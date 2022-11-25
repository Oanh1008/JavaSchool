package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.LoaiBean;
import utils.AutoClose;

public class LoaiDao {
	
	public List<LoaiBean> getLoai() {
		// Kn DB
		DbProvider db = new DbProvider();
		db.connectSql();
		Connection connection = db.connection;
		List<LoaiBean> lBean = new ArrayList<>();

		try {

			// Get data
			String sql = "select * from loai";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			ResultSet rs = preStatement.executeQuery();
			while(rs.next()) {
				lBean.add(new LoaiBean(rs.getString("maloai"), rs.getString("tenloai")));
			}
			rs.close();
			preStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return  lBean;
	}
}
