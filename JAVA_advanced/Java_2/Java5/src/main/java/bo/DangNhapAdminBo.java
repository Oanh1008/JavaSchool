package bo;

import bean.DangNhapAdminBean;
import bean.UserBean;
import dao.DangNhapAdminDao;
import dao.UserDao;

public class DangNhapAdminBo {

	private static DangNhapAdminDao userDao;
	static {
		userDao = new DangNhapAdminDao();
	}
	public DangNhapAdminBean login(String userName,String pass) {
		return userDao.login(userName, pass);
	}
	
}
