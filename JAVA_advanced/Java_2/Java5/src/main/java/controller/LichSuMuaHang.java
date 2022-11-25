package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import bean.UserBean;
import bo.GioHangBo;

/**
 * Servlet implementation class LichSuMuaHang
 */
@WebServlet("/LichSuMuaHang")
public class LichSuMuaHang extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LichSuMuaHang() {
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
		GioHangBo ghBo = new GioHangBo();
		HttpSession session = request.getSession();
		UserBean user = (UserBean) session.getAttribute("dn");
		ghBo.lichSuMuaHang(user.getId());
		request.setAttribute("lsmh", ghBo.lichSuMuaHang(user.getId()));
		
		request.getRequestDispatcher("lichsugiaodich.jsp").forward(request, response);

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
