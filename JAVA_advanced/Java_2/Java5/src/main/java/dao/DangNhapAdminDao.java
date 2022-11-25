package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.DangNhapAdminBean;
import bean.UserBean;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utils.StringUtils;


public class DangNhapAdminDao {

	public DangNhapAdminBean login(String userName, String pass) {
		// Kn DB
		DbProvider db = new DbProvider();
		db.connectSql();
		Connection connection = db.connection;
		DangNhapAdminBean loginBean = new DangNhapAdminBean();

		try {

			// Get data
			String sql = "select * from dangnhap where TenDangNhap = ? and MatKhau = ?";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			preStatement.setString(1, userName);
			preStatement.setString(2, StringUtils.ecrypt(pass));
			ResultSet rs = preStatement.executeQuery();
			while (rs.next()) {
				loginBean = new DangNhapAdminBean(rs.getString(1),rs.getString(2),rs.getBoolean(3));
			}
			rs.close();
			preStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginBean;
	}
	public static void main(String[] args) {
		DangNhapAdminDao dao = new DangNhapAdminDao();
		System.out.println(dao.login("abc", "123"));
	}
}
