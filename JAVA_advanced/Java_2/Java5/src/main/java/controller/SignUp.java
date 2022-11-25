package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;
import bo.UserBo;
import utils.StringUtils;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserBo userBo = new UserBo();

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println(firstName+", "+ lastName+", "+email+" ,"+userName+", "+password);
		if (firstName != null && lastName != null && email !=null && userName != null && password !=null) {
				try {
					String pass = StringUtils.ecrypt(password);
					boolean kt = userBo.signUp(firstName+" "+lastName, email, userName, pass);
					System.out.println(pass +" "+kt);
					
					if(kt) {
						response.sendRedirect("KiemTraDangNhap?signup=1");
					}else {
						rd(request,"register.jsp",response);
					}
				} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
					e.printStackTrace();
				}
		} else { // first
			rd(request, "register.jsp",response);
		}
	}
	public void rd(HttpServletRequest re, String path, HttpServletResponse response) throws ServletException, IOException {
		 re.getRequestDispatcher(path).forward(re, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
