/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ADMIN
 */
public class KetNoi {
    public static Connection cn;
    public static void KetNoi(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Dã xác định HQTCSDL SQL");
            String url ="jdbc:sqlserver://MSI:1433;databaseName=VoTanThan;user=sa;password=123";
            cn = DriverManager.getConnection(url);
            System.out.println("Kêt nối thành công");
        } catch (Exception e) {
        }
    }
    
}
