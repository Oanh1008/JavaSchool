package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestController
 */
@WebServlet("/TestController")
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestController() {
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
		// PrintWriter
		PrintWriter out = response.getWriter();
		 String aa=request.getParameter("txta");
		  String bb=request.getParameter("txtb");
		  double a=0,b=0,kq=0;
		  if(aa!=null&&bb!=null){
			  a=Double.parseDouble(aa);
			  b=Double.parseDouble(bb);
			  if(request.getParameter("butc")!=null)
				  kq=a+b;
			  else
				  if(request.getParameter("butt")!=null)
					  kq=a-b;
				  else
					  if(request.getParameter("butn")!=null)
						  kq=a*b;
					  else
						  if(b==0)
							  out.print("<script>alert('Bo tay');</script>");
						  else
							  kq=a/b;
		
		  }
		  request.setAttribute("a", a);
		  request.setAttribute("b", b);
		  request.setAttribute("kq", kq);
		  RequestDispatcher rd = request.getRequestDispatcher("maytinh.jsp");
		  rd.forward(request, response);

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
