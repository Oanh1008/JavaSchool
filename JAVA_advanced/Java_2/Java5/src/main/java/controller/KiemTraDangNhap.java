package controller;

import java.io.IOException;
import java.net.http.HttpRequest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;
import bo.UserBo;

/**
 * Servlet implementation class KiemTraDangNhap
 */
@WebServlet("/KiemTraDangNhap")
public class KiemTraDangNhap extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static int INDEX = 0 ;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public KiemTraDangNhap() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserBo loginBo = new UserBo();

		String un = request.getParameter("un");
		String pass = request.getParameter("pw");
		String signup = request.getParameter("signup");
	
		HttpSession session = request.getSession();
		if (un != null && pass != null) {
			UserBean lbean = loginBo.login(un, pass) ;
			System.out.println(lbean.toString());
			if (lbean.getUserName() != null) {
				nl.captcha.Captcha captcha = (nl.captcha.Captcha) request.getSession().getAttribute(nl.captcha.Captcha.NAME);
				request.setCharacterEncoding("UTF-8");
				String answer = request.getParameter("cc");
				if(answer !=null) {
					if(captcha.isCorrect(answer)) {
						session.setAttribute("dn", lbean);
						response.sendRedirect("HtSach");
					}
				}else {
					session.setAttribute("dn", lbean);
					response.sendRedirect("HtSach");
				}
				
			} else {// login error
				if(session.getAttribute("index") == null) {
					session.setAttribute("index",0 );
				}
				int value =(int) session.getAttribute("index");
				value++;
				session.setAttribute("index",value);
				if (value >= 3) {
					rd(request, "dangnhap.jsp?captcha=1",response);
				}
				rd(request, "dangnhap.jsp?kt=1",response);
				
			}
		} else { // first
			if(signup != null ) {
				rd(request,"dangnhap.jsp?signup=1",response);
			}
			rd(request, "dangnhap.jsp",response);
		}

	}

	public void rd(HttpServletRequest re, String path, HttpServletResponse response) throws ServletException, IOException {
		 re.getRequestDispatcher(path).forward(re, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
