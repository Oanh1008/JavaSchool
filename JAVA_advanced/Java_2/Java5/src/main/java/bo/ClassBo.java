package bo;

import java.util.List;

import bean.ClassBean;
import dao.ClassDao;

public class ClassBo {

	private static ClassDao classDao;
	static {
		classDao = new ClassDao();
	}

	public static List<ClassBean> ds;

	public List<ClassBean> getAllClass() {
		ds = classDao.getAllClass();
		return ds;
	}
}
