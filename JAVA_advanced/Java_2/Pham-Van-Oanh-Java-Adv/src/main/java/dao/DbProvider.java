package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbProvider {
	public Connection connection;

	public void connectSql() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection("jdbc:sqlserver://Pham-Van-Oanh\\OANHPV:1433;databaseName=PhamVanOanh;user=sa; password=123");
			System.out.println("Connect Thanh Cong");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DbProvider db= new DbProvider();
		db.connectSql();
	}
}
