/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fis11_rmi;

/**
 *
 * @author squoz
 */
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.ServerNotActiveException;
import java.rmi.server.UnicastRemoteObject;
import java.util.concurrent.atomic.AtomicBoolean;

// Класс сервера RMI
public class Server implements IRemoteSolve {

    // Потокозащищенная логическая переменная для возможности остановки сервера
    private static final AtomicBoolean stopServer = new AtomicBoolean(false);

    @Override
    // Метод получения данных
    public Object getData(Variables data) {
        try {
            System.out.println("\nПолучены значения переменных из " + UnicastRemoteObject.getClientHost() + ":");
            double a = data.getA();
            double b = data.getB();
            double x = data.getX();

            if (x < 7) {
                double y = (2 * a * b * x) / ((a + b) * (a + b));
                data.setY(y);
            } else {
                double y = x * (a * a + 4 * b);
                data.setY(y);
            }
        } catch (ServerNotActiveException e) {
        }
        return data;
    }

    @Override
    // Метод остановки сервера
    public void stopServer() {
        stopServer.set(true);
    }

    public static void main(String... args) throws AccessException, RemoteException, AlreadyBoundException {
        System.out.println("Запуск сервиса...");
        final IRemoteSolve service = new Server();
        LocateRegistry.createRegistry(IRemoteSolve.PORT).bind(IRemoteSolve.SERVICE_NAME, UnicastRemoteObject.exportObject(service, 0));
        while (!stopServer.get()) { // Бесконечный цикл, пока переменная stopServer не выключит его
            try {
                Thread.sleep(100); // Небольшая задержка для правильной работы цикла в потоке
            } catch (InterruptedException e) { // Завершение потока при внешнем прерывании
                break;
            }
        }
        System.out.println("\nСервер остановлен");
        System.exit(0);
    }

}
