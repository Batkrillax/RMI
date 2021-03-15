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
import java.rmi.registry.*;

// Клиент RMI
public class Client {

    final static String HOST = "localhost"; // Адрес сервера

    public static void main(String... args) throws Exception {
        Registry server = LocateRegistry.getRegistry(HOST, IRemoteSolve.PORT);
        IRemoteSolve remoteService = (IRemoteSolve) server.lookup(IRemoteSolve.SERVICE_NAME);
        System.out.println(remoteService.getData(new Variables(1, 2, 3))); //a, b, x
        System.out.println(remoteService.getData(new Variables(24, -54, 71)));
        remoteService.stopServer();
    }
}