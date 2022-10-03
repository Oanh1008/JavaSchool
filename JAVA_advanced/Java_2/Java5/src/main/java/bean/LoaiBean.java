package bean;

public class LoaiBean {
	private String maloai;
	private String tenloai;

	public LoaiBean() {
	}

	public LoaiBean(String maloai, String tenloai) {
		this.maloai = maloai;
		this.tenloai = tenloai;
	}

	public String getMaloai() {
		return maloai;
	}

	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}

	public String getTenloai() {
		return tenloai;
	}

	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}

	@Override
	public String toString() {
		return "LoaiBean [maloai=" + maloai + ", tenloai=" + tenloai + "]";
	}

}
