package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.DateTimeAtCompleted;

import bean.GioHangBean;
import bean.LichSuMuaHang;
import bean.LoaiBean;
import bean.SachBean;

public class MuaHangDao {

	public String bookGoods(int makh, List<GioHangBean> sachMuas, long tien) {
		// Kn DB
		DbProvider db = new DbProvider();
		db.connectSql();
		Connection connection = db.connection;
		try {
			String insertHoaDon = "insert into hoadon(makh,NgayMua,damua,thanhtien) values(?,GETDATE(),0,?)";
			PreparedStatement preStatement = connection.prepareStatement(insertHoaDon);
			preStatement.setInt(1, makh);
			preStatement.setLong(2, tien);
			preStatement.executeUpdate();

			preStatement.close();

			String getMaHD = "select top(1) MaHoaDon from hoadon order by MaHoaDon desc";
			PreparedStatement getMaHDStatement = connection.prepareStatement(getMaHD);
			ResultSet rs = getMaHDStatement.executeQuery();
			int mhd = 0;
			if (rs.next()) {
				mhd = rs.getInt("MaHoaDon");
			}
			rs.close();
			getMaHDStatement.close();

			for (GioHangBean sachBean : sachMuas) {
				String sql = "insert into ChiTietHoaDon(MaSach,SoLuongMua,MaHoaDon,damua) values(?,?,?,0)";
				PreparedStatement statement = connection.prepareStatement(sql);
				statement.setString(1, sachBean.getMasach());
				statement.setLong(2, sachBean.getSoluong());
				statement.setInt(3, mhd);
				statement.executeUpdate();
				statement.close();

				String update = "update sach set soluong = soluong - ? where masach = ?";
				PreparedStatement upStatement = connection.prepareStatement(update);
				upStatement.setLong(1, sachBean.getSoluong());
				upStatement.setString(2, sachBean.getMasach());
				upStatement.executeUpdate();
				upStatement.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
			return "Đã xảy ra lỗi";
		}

		return "Đặt đã oke";
	}

	public List<LichSuMuaHang> lichSuMuaHang(int maKh) {
		// Kn DB
		DbProvider db = new DbProvider();
		db.connectSql();
		Connection connection = db.connection;
		List<LichSuMuaHang> sBean = new ArrayList<>();

		try {

			// Get data
			String sql = "select kh.makh,hd.MaHoaDon,cthd.MaSach,s.tensach,cthd.SoLuongMua,s.gia,\r\n"
					+ "(cthd.SoLuongMua*s.gia) as Thanhtien,hd.NgayMua,hd.thanhtien\r\n"
					+ "from KhachHang as kh\r\n"
					+ "join hoadon as hd on kh.makh = hd.makh\r\n"
					+ "join ChiTietHoaDon as cthd on hd.MaHoaDon = cthd.MaHoaDon\r\n"
					+ "join sach as s on cthd.MaSach = s.masach\n"
					+ " where kh.makh=? and hd.damua = 1";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			preStatement.setInt(1, maKh);
			ResultSet rs = preStatement.executeQuery();
			

			while (rs.next()) {
			
				sBean.add(new LichSuMuaHang(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getInt(5), rs.getLong(6), rs.getLong(7), rs.getString(8), rs.getLong(9)
						));
			}
			rs.close();
			preStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sBean;
	}
	public List<LichSuMuaHang> lichSuMuaHang() {
		// Kn DB
		DbProvider db = new DbProvider();
		db.connectSql();
		Connection connection = db.connection;
		List<LichSuMuaHang> sBean = new ArrayList<>();

		try {

			// Get data
			String sql = "select kh.makh,hd.MaHoaDon,cthd.MaSach,s.tensach,cthd.SoLuongMua,s.gia,\r\n"
					+ "(cthd.SoLuongMua*s.gia) as Thanhtien,hd.NgayMua,hd.thanhtien\r\n"
					+ "from KhachHang as kh\r\n"
					+ "join hoadon as hd on kh.makh = hd.makh\r\n"
					+ "join ChiTietHoaDon as cthd on hd.MaHoaDon = cthd.MaHoaDon\r\n"
					+ "join sach as s on cthd.MaSach = s.masach\n"
					+ " where hd.damua = 0";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			ResultSet rs = preStatement.executeQuery();
			while (rs.next()) {
			
				sBean.add(new LichSuMuaHang(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4),
						rs.getInt(5), rs.getLong(6), rs.getLong(7), rs.getString(8), rs.getLong(9)
						));
			}
			rs.close();
			preStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sBean;
	}
	public String xacNhan(int mahd) {
		DbProvider db = new DbProvider();
		db.connectSql();
		Connection connection = db.connection;
		try {
			String sql = "update hoadon set damua = 1 where MaHoaDon = ?";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			preStatement.setInt(1, mahd);
			preStatement.executeUpdate();
			preStatement.close();
			
			String sql2 = "update ChiTietHoaDon set damua = 1 where MaHoaDon = ?";
			preStatement = connection.prepareStatement(sql2);
			preStatement.setInt(1, mahd);
			preStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	public static void main(String[] args) {
		MuaHangDao dad= new MuaHangDao();
		dad.lichSuMuaHang(3).forEach(System.out::println);
	}

}
