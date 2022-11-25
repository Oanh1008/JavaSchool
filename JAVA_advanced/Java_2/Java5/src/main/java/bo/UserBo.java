package bo;

import java.util.List;

import bean.UserBean;
import bean.SachBean;
import dao.SachDao;
import dao.UserDao;

public class UserBo {

	private static UserDao userDao;
	static {
		userDao = new UserDao();
	}
	public UserBean login(String userName,String pass) {
		return userDao.login(userName, pass);
	}
	
	public boolean signUp(String fullName,String email,String userName,String password) {
		return userDao.signup(fullName, email, userName, password);
	}
}
