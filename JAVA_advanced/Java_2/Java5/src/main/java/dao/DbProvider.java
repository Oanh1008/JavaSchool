package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbProvider {
	public Connection connection;

	public void connectSql() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection("jdbc:sqlserver://Pham-Van-Oanh\\OANHPV:1433;databaseName=QlSach;user=sa; password=123");
			System.out.println("Connect Thanh Cong");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
