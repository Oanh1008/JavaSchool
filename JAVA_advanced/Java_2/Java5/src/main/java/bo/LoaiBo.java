package bo;

import java.util.List;

import bean.LoaiBean;
import dao.LoaiDao;

public class LoaiBo {
	private static LoaiDao loaiDao;
	static {
		loaiDao = new LoaiDao();
	}

	List<LoaiBean> ds;

	public List<LoaiBean> getLoai() {
		ds = loaiDao.getLoai();
		return ds;
	}
}
