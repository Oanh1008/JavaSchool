/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import jdk.nashorn.internal.runtime.logging.Logger;

/**
 *
 * @author Oanhpv1008
 */
public class SendReceive {

    ServerSocket serverSocket;

    public void OpenPort(int port) throws Exception {
        serverSocket = new ServerSocket(port);
        System.out.println("Server opened port: " + port);
    }

    public String Receive() throws Exception {
        // loop true
        Socket c = serverSocket.accept();
        System.out.println("There is one client connected....");
        InputStreamReader is = new InputStreamReader(c.getInputStream());
        BufferedReader bd = new BufferedReader(is);
        return bd.readLine();
    }

    public void Send(String data, String ipServer, int port) throws Exception {
        // 172.12.3.183 IP Thay
        Socket socket = new Socket(ipServer, port);
        System.out.println("Connected to server....");
        DataOutputStream out =  new DataOutputStream(socket.getOutputStream());
        out.writeBytes(data);
        out.write(13);
        out.write(10);
        out.close();
        socket.close();

    }
}
