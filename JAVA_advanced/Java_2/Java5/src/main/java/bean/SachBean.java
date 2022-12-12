package bean;

public class SachBean {
	private String masach;
	private String tensach;
	private int soluong;
	private int gia;
	private String maloai;
	private String anh;
	private String tacgia;
	private long thanhtien;
	public SachBean() {	
	}
	public SachBean(String masach, String tensach,int soluong,int gia,long thanhtien) {	
		this.masach = masach;
		this.tensach = tensach;
		this.soluong = soluong;
		this.gia=gia;
		this.thanhtien = thanhtien;
	}
	public SachBean(String masach, String tensach, int soluong, int gia, String maloai, String anh, String tacgia) {
		super();
		this.masach = masach;
		this.tensach = tensach;
		this.soluong = soluong;
		this.gia = gia;
		this.maloai = maloai;
		this.anh = anh;
		this.tacgia = tacgia;
	}
	public String getMasach() {
		return masach;
	}
	public void setMasach(String masach) {
		this.masach = masach;
	}
	public String getTensach() {
		return tensach;
	}
	public void setTensach(String tensach) {
		this.tensach = tensach;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public String getMaloai() {
		return maloai;
	}
	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public String getTacgia() {
		return tacgia;
	}
	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}
	public long getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(long thanhtien) {
		this.thanhtien = thanhtien;
	}

	
	
}
