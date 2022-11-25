package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.LoaiBean;
import bean.SachBean;
import bo.LoaiBo;
import bo.SachBo;

/**
 * Servlet implementation class HtSach
 */
@WebServlet("/HtSach")
public class HtSach extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HtSach() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		LoaiBo lbo = new LoaiBo();
		SachBo sbo = new SachBo();
		String tk = request.getParameter("txttk");
		String ml = request.getParameter("ml");
		String page =  request.getParameter("page");
		System.out.println(page+" aaa");
		int initPage = 1;int initSize = 9;
		List<SachBean> dssach = sbo.getSach();
		long count = dssach.stream().count();
		long totalPages = (count%9==0)?(count/9):(count/9) +1;
		for(int i =0;i<1;i++) {
			if (tk != null) {
				dssach = sbo.find(tk);
				break;
			}
			if (ml != null) {
				dssach = sbo.searchMl(ml);
				break;
			} 
			if(page !=null) {
				dssach = sbo.getSach(Integer.parseInt(page), initSize);
				break;
			} else {
				System.out.println("here");
				dssach = sbo.getSach(initPage, initSize);
				break;
			}
		}
		request.setAttribute("dssach", dssach);
		request.setAttribute("dsloai",lbo.getLoai());
		request.setAttribute("totalPages", totalPages);
		RequestDispatcher rd = request.getRequestDispatcher("htsach.jsp");
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
