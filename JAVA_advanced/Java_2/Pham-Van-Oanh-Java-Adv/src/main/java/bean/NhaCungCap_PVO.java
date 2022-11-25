package bean;

public class NhaCungCap_PVO {
	
	private int maNcc;
	private String tenNcc;
	public NhaCungCap_PVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhaCungCap_PVO(int maNcc, String tenNcc) {
		this.maNcc = maNcc;
		this.tenNcc = tenNcc;
	}
	public int getMaNcc() {
		return maNcc;
	}
	public void setMaNcc(int maNcc) {
		this.maNcc = maNcc;
	}
	public String getTenNcc() {
		return tenNcc;
	}
	public void setTenNcc(String tenNcc) {
		this.tenNcc = tenNcc;
	}
	

}
