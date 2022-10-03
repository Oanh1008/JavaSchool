package bo;

import java.util.ArrayList;
import java.util.List;

import bean.GioHangBean;

public class GioHangBo {
	public List<GioHangBean> ds = new ArrayList<>();

	public void Them(String masach, String tensach, long gia, long soluong) {
		for (GioHangBean h : ds) {
			if (h.getMasach().equals(masach)) {
				h.setSoluong(h.getSoluong() + soluong);
				return;
			}
		}
		ds.add(new GioHangBean(masach, tensach, gia, soluong));
	}

	public long ThanhTien() {
		return ds.stream().mapToLong(d -> d.getThanhtien()).sum();
	}
	
	public long TongSach() {
		return ds.stream().mapToLong(d -> d.getSoluong()).sum();
	}
	public void xoaSach(String ms) {
		ds.removeIf(d -> d.getMasach().equals(ms));
	}
	public void xoaAll() {
		ds.removeAll(ds);
	}
	public void suaSL(String ms, long sl) {
		for (GioHangBean h : ds) {
			if (h.getMasach().equals(ms)) {
				h.setSoluong(sl);
				return;
			}
		}
	}
}
