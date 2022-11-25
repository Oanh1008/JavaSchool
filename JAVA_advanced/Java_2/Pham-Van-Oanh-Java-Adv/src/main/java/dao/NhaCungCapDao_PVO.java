package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import bean.NhaCungCap_PVO;

public class NhaCungCapDao_PVO {

	public List<NhaCungCap_PVO> getAllNcc() {
		// Kn DB
		DbProvider db = new DbProvider();
		db.connectSql();
		Connection connection = db.connection;
		List<NhaCungCap_PVO> lBean = new ArrayList<>();

		try {
			System.out.println("here");
			// Get data
			String sql = "select * from nhacungcap";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			ResultSet rs = preStatement.executeQuery();
			while (rs.next()) {
				lBean.add(new NhaCungCap_PVO(rs.getInt("MaNhaCungCap"), rs.getString("TenNhaCungCap")));
			}
			rs.close();
			preStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lBean;
	}
	
	public static void main(String[] args) {
		NhaCungCapDao_PVO dao = new NhaCungCapDao_PVO();
		dao.getAllNcc().forEach(System.out::println);
	}

}
