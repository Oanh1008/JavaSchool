package bean;

public class MatHang_PVO {

	private int mh;
	private String tenHang;
	private int soLuong;
	private int gia;
	private String anh;
	private int maNcc;
	public MatHang_PVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MatHang_PVO(int mh, String tenHang, int soLuong, int gia, String anh, int maNcc) {
		this.mh = mh;
		this.tenHang = tenHang;
		this.soLuong = soLuong;
		this.gia = gia;
		this.anh = anh;
		this.maNcc = maNcc;
	}
	public int getMh() {
		return mh;
	}
	public void setMh(int mh) {
		this.mh = mh;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public int getMaNcc() {
		return maNcc;
	}
	public void setMaNcc(int maNcc) {
		this.maNcc = maNcc;
	}
	
}
