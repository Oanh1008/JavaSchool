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
 * @author Oanhpv1008
 */
public class KetNoi {
    public static Connection cn;
    public static void KetNoi(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Dã xác định HQTCSDL SQL");
            String url ="jdbc:sqlserver://Pham-Van-Oanh\\OANHPV:1433;databaseName=PhamVanOanhLTPT;user=sa;password=123";
            cn = DriverManager.getConnection(url);
            System.out.println("Kêt nối thành công  sádá");
        } catch (Exception e) {
        }
    }
    
}
