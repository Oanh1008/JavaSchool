package bo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.GioHangBean;
import bean.LichSuMuaHang;
import bean.Temp;
import dao.MuaHangDao;

public class GioHangBo {

	private MuaHangDao muaHangDao = new MuaHangDao();
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

	public String bookGoods(int makh, List<GioHangBean> sachMuas, long tien) {
		return muaHangDao.bookGoods(makh, sachMuas, ThanhTien());
	}

	public Map<Temp, List<LichSuMuaHang>> lichSuMuaHang(int maKh) {

		Map<Temp, List<LichSuMuaHang>> rs = muaHangDao.lichSuMuaHang(maKh).stream()
				.sorted(Comparator.comparing(t -> t.getMhd()))
				.collect(Collectors.groupingBy(t -> new Temp(t.getMhd(), t.getNgayMua(), t.getTongtien())));
		return rs;
	}

	public Map<Temp, List<LichSuMuaHang>> lichSuMuaHang() {

		Map<Temp, List<LichSuMuaHang>> rs = muaHangDao.lichSuMuaHang().stream()
				.collect(Collectors.groupingBy(t -> new Temp(t.getMhd(), t.getNgayMua(), t.getTongtien())));
		return rs;
	}
	public String xacNhan(int mhd) {

		return muaHangDao.xacNhan(mhd);
	}


}
