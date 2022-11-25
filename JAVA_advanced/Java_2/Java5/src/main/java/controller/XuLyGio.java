package controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;
import bo.GioHangBo;

/**
 * Servlet implementation class XuLyGio
 */
@WebServlet("/XuLyGio")
public class XuLyGio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public XuLyGio() {
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

		HttpSession session = request.getSession();
		GioHangBo ghBo = (GioHangBo) session.getAttribute("gio");
		UserBean user = (UserBean) session.getAttribute("dn");

		if (request.getParameter("butSua") != null) {

			String ma = request.getParameter("butSua");
			int sl = Integer.parseInt(request.getParameter("txt" + ma));
			ghBo.suaSL(ma, sl);

		}
		String msx = request.getParameter("msx");
		if (msx != null) {
			String ma = request.getParameter("msx");
			ghBo.xoaSach(ma);
		}
		String[] arrMs = request.getParameterValues("selected");
		String xoaChon = request.getParameter("butXoa");
		if (xoaChon != null) {
			System.out.println(xoaChon);
			System.out.println(arrMs.toString());
			for (String ms : arrMs) {
				ghBo.xoaSach(ms);
			}
		}
		String xoaALL = request.getParameter("xoaAll");
		if (xoaALL != null) {
			ghBo.xoaAll();
		}

		session.setAttribute("gio", ghBo);

		

		response.sendRedirect("GioHang");

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
