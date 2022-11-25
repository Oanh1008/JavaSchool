package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.GioHangBo;
import bo.LoaiBo;

/**
 * Servlet implementation class ThemGioHang
 */
@WebServlet("/ThemGioHang")
public class ThemGioHang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemGioHang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String masach = request.getParameter("ms");
		String tensach = request.getParameter("ts");
		String giaTemp = request.getParameter("gia");
	
		long gia = 0;
		if (giaTemp != null) {
			gia = Long.parseLong(giaTemp);
		}
		HttpSession session = request.getSession();
		
		if(session.getAttribute("dn") != null ) {
			GioHangBo gh;
			if (session.getAttribute("gio") == null) {
				gh = new GioHangBo();
				session.setAttribute("gio", gh);
			}
			// b1: luu session
			gh = (GioHangBo) session.getAttribute("gio");
			// b2: thay doi
			gh.Them(masach, tensach, gia, (long) 1);


			// b3 : luu lai session
			session.setAttribute("gio", gh);
			
			response.sendRedirect("GioHang");
		}else {
			response.sendRedirect("KiemTraDangNhap");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
