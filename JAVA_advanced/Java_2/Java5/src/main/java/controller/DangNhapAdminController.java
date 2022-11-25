package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.DangNhapAdminBean;
import bean.UserBean;
import bo.DangNhapAdminBo;
import bo.UserBo;

/**
 * Servlet implementation class DangNhapAdminController
 */
@WebServlet("/DangNhapAdminController")
public class DangNhapAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangNhapAdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		UserBo loginBo = new UserBo();

		String un = request.getParameter("un");
		String pass = request.getParameter("pw");
	
		HttpSession session = request.getSession();

		  RequestDispatcher rd;
		  if(un!=null&&pass!=null){
			  DangNhapAdminBo dnbo= new DangNhapAdminBo();
			  DangNhapAdminBean  dn= dnbo.login(un, pass);
		  if(dn!=null){
			  //Tao ra doi tuong session
			  session.setAttribute("admin", dn);
			   rd= request.getRequestDispatcher("AdminController");
			}else //Dang nhap sai
			rd= request.getRequestDispatcher("dangnhapadmin.jsp?kt=1");
		  } else//Chay lan dau
			  rd= request.getRequestDispatcher("dangnhapadmin.jsp");
		  
		  rd.forward(request, response);  

	
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
