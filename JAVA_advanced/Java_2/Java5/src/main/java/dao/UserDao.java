package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.UserBean;
import utils.StringUtils;
import bean.SachBean;

public class UserDao {
	public UserBean login(String userName, String pass) {
		// Kn DB
		DbProvider db = new DbProvider();
		db.connectSql();
		Connection connection = db.connection;
		UserBean loginBean = new UserBean();

		try {

			// Get data
			String sql = "select * from khachhang where tendn = ? and pass = ?";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			preStatement.setString(1, userName);
			preStatement.setString(2, StringUtils.ecrypt(pass));
			ResultSet rs = preStatement.executeQuery();
			while (rs.next()) {
				loginBean = new UserBean(rs.getInt("makh"), rs.getString("hoten"), rs.getString("diachi"),
						rs.getString("sodt"), rs.getString("email"), rs.getString("tendn"), rs.getString("pass"));
			}
			rs.close();
			preStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginBean;
	}

	public boolean signup(String fullName, String email, String userName, String password) {
		// Kn DB
		DbProvider db = new DbProvider();
		db.connectSql();
		Connection connection = db.connection;
		int rs = 0;

		try {
			// Get data
			String sql = "insert into KhachHang(hoten,email,tendn,pass) values(?,?,?,?)";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			preStatement.setString(1, fullName);
			preStatement.setString(2, email);
			preStatement.setString(3, userName);
			preStatement.setString(4, password);
			rs = preStatement.executeUpdate();
			preStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs > 0;

	}
}
