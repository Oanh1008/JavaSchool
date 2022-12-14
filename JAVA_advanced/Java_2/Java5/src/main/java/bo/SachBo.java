package bo;

import java.util.List;
import java.util.stream.Collectors;

import bean.LoaiBean;
import bean.SachBean;
import dao.SachDao;

public class SachBo {
	private static SachDao sachDao;
	static {
		sachDao = new SachDao();
	}
	
	List<SachBean> ds;
	public List<SachBean> getSach() {
		return sachDao.getSach();
	
	}
	
	public List<SachBean> getSach(int page, int size) {
		return sachDao.getSach(page,size);
		
	}
	
	public SachBean getSach(String masach) {
		return getSach().stream().filter(t -> t.getMasach().equals(masach)).findFirst().get();
	}
	/**
	 * search by mã loại
	 * @param ml
	 * @return
	 */
	public List<SachBean> searchMl(String ml){
		return getSach().stream().filter(s -> s.getMaloai().equals(ml))
				.collect(Collectors.toList());
	}
	
	public List<SachBean> find(String tk) {
		return getSach().stream().filter(s ->s.getTensach().toLowerCase().contains(tk.toLowerCase().trim()))
				.collect(Collectors.toList());
	}
	
	public int themSach(SachBean s) {
		return sachDao.themSach(s);
	}
	public int xoaSach(String masach) {
		return sachDao.xoaSach(masach);
	}
}
