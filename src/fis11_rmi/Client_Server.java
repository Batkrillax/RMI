/*
 * Copyright (C) 2021 meirb
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fis11_rmi;

/**
 *
 * @author meirb
 */
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.util.Timer;
import java.util.TimerTask;

public class Client_Server {

    public static void main(String[] args) {

        // Запуск сервера RMI в отдельном потоке
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    Server.main();
                } catch (AlreadyBoundException | RemoteException ex) {
                    System.err.println("RmiServer error!");
                }
            }
        }, 0);

        // Запуск клиента RMI в отдельном потоке с задержкой 1 секунда
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    Client.main();
                } catch (Exception ex) {
                    System.err.println("RmiClient error!");
                }
            }
        }, 1000);

    }
}
