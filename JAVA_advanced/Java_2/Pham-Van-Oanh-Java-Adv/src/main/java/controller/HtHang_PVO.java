package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.MatHang_PVO;
import bean.NhaCungCap_PVO;
import bo.MatHangBo_PVO;
import bo.NhaCungCapBo_PVO;

/**
 * Servlet implementation class HtHang_PVO
 */
@WebServlet("/HtHang_PVO")
public class HtHang_PVO extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HtHang_PVO() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		NhaCungCapBo_PVO bo = new NhaCungCapBo_PVO();
		MatHangBo_PVO mhBo = new MatHangBo_PVO();
		
		String ncc = request.getParameter("ncc");
		String gia = request.getParameter("gia");
		List<MatHang_PVO> mhs = mhBo.getAllMatHang();
		List<NhaCungCap_PVO> nccs = bo.getNcc();
		
		if(ncc != null) {
			mhs = mhBo.getMatHangByMaNcc(Integer.parseInt(ncc));
		}
		if(gia !=null &&  gia != "") {
			mhs = mhBo.getMatHangByGia(Integer.parseInt(gia));
			
		}
		request.setAttribute("nccs", nccs);
		request.setAttribute("mhs", mhs);
		if(mhs.size()==0) {
			request.getRequestDispatcher("kiemtra.jsp?kt=0").forward(request, response);
		}
		
		request.getRequestDispatcher("kiemtra.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
