package bean;

public class DangNhapAdminBean {

	private String tenDangNhap;
	private String matKhau;
	private boolean role;

	public DangNhapAdminBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DangNhapAdminBean(String tenDangNhap, String matKhau, boolean role) {

		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.role = role;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public boolean isRole() {
		return role;
	}

	public void setRole(boolean role) {
		this.role = role;
	}
	

}
