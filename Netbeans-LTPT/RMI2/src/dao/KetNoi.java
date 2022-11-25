/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import sun.applet.Main;

/**
 *
 * @author Oanhpv1008
 */
public class KetNoi {

    public Connection connection;

    public void connectToSqlServer() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://Pham-Van-Oanh\\OANHPV:1433;databaseName=QlTaiKhoan;user=sa; password=123");
            
            System.out.println("Ok");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] arg){
        
        KetNoi kn = new KetNoi();
        kn.connectToSqlServer();
    }
    
}
