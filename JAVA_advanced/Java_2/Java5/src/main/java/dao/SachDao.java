package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.LoaiBean;
import bean.SachBean;

public class SachDao {

	public List<SachBean> getSach() {
		// Kn DB
		DbProvider db = new DbProvider();
		db.connectSql();
		Connection connection = db.connection;
		List<SachBean> sBean = new ArrayList<>();

		try {

			// Get data
			String sql = "select * from sach";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			ResultSet rs = preStatement.executeQuery();

			while (rs.next()) {
				sBean.add(new SachBean(rs.getString("masach"), rs.getString("tensach"), rs.getInt("soluong"),
						rs.getInt("gia"), rs.getString("maloai"), rs.getString("anh"), rs.getString("tacgia")));
			}
			rs.close();
			preStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sBean;
	}

	public List<SachBean> getSach(int page, int size) {
		// Kn DB
		DbProvider db = new DbProvider();
		db.connectSql();
		Connection connection = db.connection;
		List<SachBean> sBean = new ArrayList<>();

		try {

			// Get data
			String sql = "DECLARE @PageNumber AS INT \n" + "DECLARE @RowsOfPage AS INT \n" + "SET @PageNumber=? \n"
					+ "SET @RowsOfPage=? \n" + "SELECT masach, tensach,soluong,gia,maloai,anh,tacgia  \n"
					+ "FROM sach \n" + "ORDER BY tensach  \n" + "OFFSET (@PageNumber-1)*@RowsOfPage ROWS \n"
					+ "FETCH NEXT @RowsOfPage ROWS ONLY";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			preStatement.setInt(1, page);
			preStatement.setInt(2, size);
			ResultSet rs = preStatement.executeQuery();

			while (rs.next()) {
				sBean.add(new SachBean(rs.getString("masach"), rs.getString("tensach"), rs.getInt("soluong"),
						rs.getInt("gia"), rs.getString("maloai"), rs.getString("anh"), rs.getString("tacgia")));
			}
			rs.close();
			preStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sBean;
	}
	public int themSach(SachBean sachBean) {
		DbProvider db = new DbProvider();
		db.connectSql();
		Connection connection = db.connection;
		try {
			String sql = "insert into sach values(?,?,?,?,?,0,?,getdate(),?)";
			PreparedStatement pre = connection.prepareStatement(sql);
			pre.setString(1, sachBean.getMasach());
			pre.setString(2, sachBean.getTensach());
			pre.setInt(3, sachBean.getSoluong());
			pre.setInt(4, sachBean.getGia());
			pre.setString(5, sachBean.getMaloai());
			pre.setString(6, sachBean.getAnh());
			pre.setString(7, sachBean.getTacgia());
			int rs = pre.executeUpdate();
			System.out.println(rs +" here");
			pre.close();
			connection.close();
			return rs;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return 0;
		
	}
	public int xoaSach(String masach) {
		DbProvider db = new DbProvider();
		db.connectSql();
		Connection connection = db.connection;
		try {
			String sql = "delete sach where masach = ?";
			PreparedStatement pre = connection.prepareStatement(sql);
			pre.setString(1, masach);
			int rs = pre.executeUpdate();
			System.out.println(rs +" here");
			pre.close();
			connection.close();
			return rs;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return 0;
		
	}

}
