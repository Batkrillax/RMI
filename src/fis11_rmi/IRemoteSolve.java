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
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemoteSolve extends Remote {

    String SERVICE_NAME = "fis/calc";
    int PORT = 1100;

    Object getData(Variables data) throws RemoteException;

    void stopServer() throws RemoteException;
}
