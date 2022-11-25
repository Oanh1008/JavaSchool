package bean;

import java.util.Objects;

public class Temp {

	private int mhd;
	private String ngay;
	private long thanhtien;
	public Temp(int mhd, String ngay, long thanhtien) {
		super();
		this.mhd = mhd;
		this.ngay = ngay;
		this.thanhtien = thanhtien;
	}
	public int getMhd() {
		return mhd;
	}
	public void setMhd(int mhd) {
		this.mhd = mhd;
	}
	public String getNgay() {
		return ngay;
	}
	public void setNgay(String ngay) {
		this.ngay = ngay;
	}
	public long getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(long thanhtien) {
		this.thanhtien = thanhtien;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.mhd);
	}

	@Override
    public boolean equals(Object o) {
 
        // If the object is compared with itself then return true 
        if (o == this) {
            return true;
        }
 
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Temp)) {
            return false;
        }
         
        // typecast o to Complex so that we can compare data members
        Temp c = (Temp) o;
         
        // Compare the data members and return accordingly
        return c.getMhd() == this.getMhd();
    }
}
