/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2022-09-30 01:59:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.List;
import bean.SachBean;
import bean.LoaiBean;
import bo.SachBo;
import bo.LoaiBo;

public final class dangnhap_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("bean.LoaiBean");
    _jspx_imports_classes.add("bo.LoaiBo");
    _jspx_imports_classes.add("bean.SachBean");
    _jspx_imports_classes.add("bo.SachBo");
    _jspx_imports_classes.add("java.util.stream.Collectors");
    _jspx_imports_classes.add("java.util.Collections");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Bootstrap Example</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--Custom styles-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"#\">Trang chủ</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"htgio.jsp\">Giỏ hàng</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"thanhtoan.jsp\">Thanh toán</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"lichsu.jsp\">Lịch sử mua hàng</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li><a href=\"thoat.jsp\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"dangnhap.jsp\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t");

	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	LoaiBo lbo = new LoaiBo();
	SachBo sbo = new SachBo();
	String tk = request.getParameter("txttk");
	String ml = request.getParameter("ml");
	List<SachBean> dssach = sbo.getSach();
	if (tk != null) {
		dssach = sbo.find(tk);
	}
	if (ml != null) {
		dssach = sbo.searchMl(ml);
	}
	
      out.write("\r\n");
      out.write("\t<table width=\"100%\" align=\"center\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"20%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t<table class=\"table table-hover\">\r\n");
      out.write("\t\t\t\t\t");

					for (LoaiBean l : lbo.getLoai()) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><a href=\"htsach.jsp?ml=");
      out.print(l.getMaloai());
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(l.getTenloai());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

					}
					
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"60%\" valign=\"top\"\r\n");
      out.write("\t\t\t\tstyle=\"align-items: center; display: flex; justify-content: center; flex-wrap: 1; flex-direction: 1; margin-left: 200px;\">\r\n");
      out.write("\t\t\t\t<div class=\"container1\">\r\n");
      out.write("\t\t\t\t\t<div class=\"d-flex justify-content-center h-100\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Sign In</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6 style=\"color: red\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									String kt = request.getParameter("kt");
									if (kt != null && kt.equals("0")) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tBad credentials !\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"d-flex justify-content-end social_icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span><i class=\"fab fa-facebook-square\"></i></span> <span><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fab fa-google-plus-square\"></i></span> <span><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"fab fa-twitter-square\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"ktdn.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"input-group-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"un\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"username\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"input-group-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"pw\" type=\"password\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row align-items-center remember\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\">Remember Me\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Login\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btn float-right login_btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"d-flex justify-content-center links\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tDon't have an account?<a href=\"#\">Sign Up</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"d-flex justify-content-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Forgot your password?</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"20%\" valign=\"top\">\r\n");
      out.write("\t\t\t\t<form action=\"htsach.jsp\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t<input class=\"form-control\" name=\"txttk\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(tk == null ? "" : tk);
      out.write("\" placeholder=\"Nhap tt\"> <br>\r\n");
      out.write("\t\t\t\t\t<input class=\"btn-primary\" name=\"butt\" type=\"submit\" value=\"Search\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}