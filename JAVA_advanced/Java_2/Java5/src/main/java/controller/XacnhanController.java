package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.DangNhapAdminBean;
import bean.UserBean;
import bo.GioHangBo;

/**
 * Servlet implementation class XacnhanController
 */
@WebServlet("/XacnhanController")
public class XacnhanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XacnhanController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GioHangBo ghBo = new GioHangBo();
		String mhd = request.getParameter("mhd");
		if(mhd !=null) {
			ghBo.xacNhan(Integer.parseInt(mhd));
		}
		
		HttpSession session = request.getSession();
		DangNhapAdminBean user = (DangNhapAdminBean) session.getAttribute("admin");
		request.setAttribute("lsmh", ghBo.lichSuMuaHang());
		
		request.getRequestDispatcher("admin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
