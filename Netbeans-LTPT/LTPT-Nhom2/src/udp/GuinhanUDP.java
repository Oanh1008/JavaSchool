/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author Oanhpv1008
 */
public class GuinhanUDP {

    // Mở cổng
    DatagramSocket dg;

    public void openPort(int port) throws SocketException {
        dg = new DatagramSocket(port);
        System.out.println("Port " + port + " is opened !!!");
    }

    public String Receive() throws IOException {
        DatagramPacket dr = new DatagramPacket(new byte[256],256);
        dg.receive(dr);
        return new String(dr.getData()).trim();
    }

    public void Send(String data, String ip, int port) throws SocketException, IOException {
        DatagramSocket dg = new DatagramSocket();
        DatagramPacket dp = new DatagramPacket(data.getBytes(),data.getBytes().length,InetAddress.getByName(ip),port);
        dg.send(dp);
        System.out.println("Sended to Server :" + data);
    }
    
     public byte[] ReceiveFile() throws IOException {
        DatagramPacket dr = new DatagramPacket(new byte[256],256);
        dg.receive(dr);
        return dr.getData();
    }

    public void SendFile(byte[] data, String ip, int port) throws SocketException, IOException {
        DatagramSocket dg = new DatagramSocket();
        DatagramPacket dp = new DatagramPacket(data,data.length,InetAddress.getByName(ip),port);
        dg.send(dp);
        System.out.println("Sended to Server :" + data);
    }
}
