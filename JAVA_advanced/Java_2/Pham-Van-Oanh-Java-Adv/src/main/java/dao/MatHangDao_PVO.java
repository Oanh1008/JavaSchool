package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.MatHang_PVO;
import bean.NhaCungCap_PVO;

public class MatHangDao_PVO {

	public List<MatHang_PVO> getAllMatHang() {
		// Kn DB
		DbProvider db = new DbProvider();
		db.connectSql();
		Connection connection = db.connection;
		List<MatHang_PVO> lBean = new ArrayList<>();

		try {
			System.out.println("here");
			// Get data
			String sql = "select * from mathang";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			ResultSet rs = preStatement.executeQuery();
			while (rs.next()) {
		
				lBean.add(new MatHang_PVO(rs.getInt(1),rs.getString(2),rs.getInt(3),
						rs.getInt(4),rs.getString(5),rs.getInt(6)));
			}
			rs.close();
			preStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lBean;
	}
	public static void main(String[] args) {
		MatHangDao_PVO dao = new MatHangDao_PVO();
		dao.getAllMatHang().forEach(System.out::println);
	}
}
