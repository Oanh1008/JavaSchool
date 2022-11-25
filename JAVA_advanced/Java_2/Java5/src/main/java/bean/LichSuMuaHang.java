package bean;

import java.time.LocalDateTime;

public class LichSuMuaHang {

	private String maKH;
	private int mhd;
	private String maSach;
	private String tenSach;
	private int soLuongMua;
	private long gia;
	private long thanhTien;
	private String ngayMua;
	private long tongtien;
	public LichSuMuaHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LichSuMuaHang(String maKH, int mhd, String maSach, String tenSach, int soLuongMua, long gia, long thanhTien,
			String ngayMua, long tongtien) {
		super();
		this.maKH = maKH;
		this.mhd = mhd;
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.soLuongMua = soLuongMua;
		this.gia = gia;
		this.thanhTien = thanhTien;
		this.ngayMua = ngayMua;
		this.tongtien = tongtien;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public int getMhd() {
		return mhd;
	}
	public void setMhd(int mhd) {
		this.mhd = mhd;
	}
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public int getSoLuongMua() {
		return soLuongMua;
	}
	public void setSoLuongMua(int soLuongMua) {
		this.soLuongMua = soLuongMua;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public long getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(long thanhTien) {
		this.thanhTien = thanhTien;
	}
	public String getNgayMua() {
		return ngayMua;
	}
	public void setNgayMua(String ngayMua) {
		this.ngayMua = ngayMua;
	}
	public long getTongtien() {
		return tongtien;
	}
	public void setTongtien(long tongtien) {
		this.tongtien = tongtien;
	}
	@Override
	public String toString() {
		return "LichSuMuaHang [maKH=" + maKH + ", mhd=" + mhd + ", maSach=" + maSach + ", tenSach=" + tenSach
				+ ", soLuongMua=" + soLuongMua + ", gia=" + gia + ", thanhTien=" + thanhTien + ", ngayMua=" + ngayMua
				+ ", tongtien=" + tongtien + "]";
	}
	
	
}
