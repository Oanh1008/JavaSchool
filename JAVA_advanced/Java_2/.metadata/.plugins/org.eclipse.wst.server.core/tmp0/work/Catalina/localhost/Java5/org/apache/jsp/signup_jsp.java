/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2022-09-15 01:16:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<div align=\"left\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"dregister6\" name=\"dregister6\" style=\"\">\r\n");
      out.write("\t\t\t\t<p>B???n c???n k??ch ho???t t??i kho???n qua Email sau khi ????ng k?? ????? nh???n ngay 50 ePoints th?????ng t??? TaiLieu.VN</p>\r\n");
      out.write("\t\t\t\t<div class=\"spacing margintop10\">\r\n");
      out.write("\t\t\t\t\t<input placeholder=\"Nh???p Username\" type=\"text\" name=\"txtUsername_Regis\" id=\"txtUsername_Regis\" maxlength=\"50\" class=\"txt295 marginright10 inputtext\" value=\"\">\r\n");
      out.write("\t\t\t\t\t<input placeholder=\"Nh???p H??? v?? T??n\" type=\"text\" id=\"txtFullname_Regis\" name=\"txtFullname_Regis\" maxlength=\"100\" class=\"txt295 inputtext\" value=\"\">\r\n");
      out.write("\t\t\t\t\t<div id=\"txtErrorUser_Regis\" name=\"txtErrorUser_Regis\" class=\"errormsg1\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"txtErrorFullname_Regis\" name=\"txtErrorFullname_Regis\" class=\"errormsg2\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"spacing\">\r\n");
      out.write("\t\t\t\t\t<input placeholder=\"Nh???p m???t kh???u\" type=\"password\" id=\"txtPassword_Regis\" name=\"txtPassword_Regis\" maxlength=\"30\" class=\"txt295 marginright10 fleft inputtext\" value=\"\">\r\n");
      out.write("\t\t\t\t\t<select name=\"txtGender_Regis\" id=\"txtGender_Regis\" class=\"select75 fleft inputtext\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"\">Gi???i T??nh</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">Nam</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">N???</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t<div id=\"txtErrorPass_Regis\" name=\"txtErrorPass_Regis\" class=\"errormsg1\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"txtErrorGender_Regis\" name=\"txtErrorGender_Regis\" class=\"errormsg2\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"spacing\">\r\n");
      out.write("\t\t\t\t\t<input placeholder=\"Nh???p l???i m???t kh???u\" type=\"password\" id=\"txtCPassword_Regis\" name=\"txtCPassword_Regis\" maxlength=\"30\" class=\"txt295 marginright10 fleft inputtext\" value=\"\">\r\n");
      out.write("\t\t\t\t\t<select name=\"txtDay_Regis\" id=\"txtDay_Regis\" class=\"select75 fleft inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\">Ng??y sinh</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">1</option><option value=\"2\">2</option><option value=\"3\">3</option><option value=\"4\">4</option><option value=\"5\">5</option><option value=\"6\">6</option><option value=\"7\">7</option><option value=\"8\">8</option><option value=\"9\">9</option><option value=\"10\">10</option><option value=\"11\">11</option><option value=\"12\">12</option><option value=\"13\">13</option><option value=\"14\">14</option><option value=\"15\">15</option><option value=\"16\">16</option><option value=\"17\">17</option><option value=\"18\">18</option><option value=\"19\">19</option><option value=\"20\">20</option><option value=\"21\">21</option><option value=\"22\">22</option><option value=\"23\">23</option><option value=\"24\">24</option><option value=\"25\">25</option><option value=\"26\">26</option><option value=\"27\">27</option><option value=\"28\">28</option><option value=\"29\">29</option><option value=\"30\">30</option><option value=\"31\">31</option>\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t<select name=\"txtMonth_Regis\" id=\"txtMonth_Regis\" class=\"select75 fleft inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\">Th??ng</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">1</option><option value=\"2\">2</option><option value=\"3\">3</option><option value=\"4\">4</option><option value=\"5\">5</option><option value=\"6\">6</option><option value=\"7\">7</option><option value=\"8\">8</option><option value=\"9\">9</option><option value=\"10\">10</option><option value=\"11\">11</option><option value=\"12\">12</option>\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t<select name=\"txtYear_Regis\" id=\"txtYear_Regis\" class=\"select75 fleft inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\">N??m</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1960\">1960</option><option value=\"1961\">1961</option><option value=\"1962\">1962</option><option value=\"1963\">1963</option><option value=\"1964\">1964</option><option value=\"1965\">1965</option><option value=\"1966\">1966</option><option value=\"1967\">1967</option><option value=\"1968\">1968</option><option value=\"1969\">1969</option><option value=\"1970\">1970</option><option value=\"1971\">1971</option><option value=\"1972\">1972</option><option value=\"1973\">1973</option><option value=\"1974\">1974</option><option value=\"1975\">1975</option><option value=\"1976\">1976</option><option value=\"1977\">1977</option><option value=\"1978\">1978</option><option value=\"1979\">1979</option><option value=\"1980\">1980</option><option value=\"1981\">1981</option><option value=\"1982\">1982</option><option value=\"1983\">1983</option><option value=\"1984\">1984</option><option value=\"1985\">1985</option><option value=\"1986\">1986</option><option value=\"1987\">1987</option><option value=\"1988\">1988</option><option value=\"1989\">1989</option><option value=\"1990\">1990</option><option value=\"1991\">1991</option><option value=\"1992\">1992</option><option value=\"1993\">1993</option><option value=\"1994\">1994</option><option value=\"1995\">1995</option><option value=\"1996\">1996</option><option value=\"1997\">1997</option><option value=\"1998\">1998</option><option value=\"1999\">1999</option>\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t<div id=\"txtErrorPass2_Regis\" name=\"txtErrorPass2_Regis\" class=\"errormsg1\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"txtErrorBirthday_Regis\" name=\"txtErrorBirthday_Regis\" class=\"errormsg2\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"spacing\">\r\n");
      out.write("\t\t\t\t\t<input placeholder=\"Nh???p ?????a ch??? Email\" type=\"text\" id=\"txtEmail_Regis\" name=\"txtEmail_Regis\" maxlength=\"100\" class=\"txt295 marginright10 fleft inputtext\" value=\"\">\r\n");
      out.write("\t\t\t\t\t<select name=\"txtCity_Regis\" id=\"txtCity_Regis\" class=\"select75 fleft inputtext\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"\">T???nh/TP</option><option value=\"76\">An Giang</option><option value=\"64\">B?? R???a V??ng T??u</option><option value=\"281\">B???c C???n</option><option value=\"240\">B???c Giang</option><option value=\"781\">B???c Li??u</option><option value=\"241\">B???c Ninh</option><option value=\"75\">B???n Tre</option><option value=\"650\">B??nh D????ng</option><option value=\"651\">B??nh Ph?????c</option><option value=\"62\">B??nh Thu???n</option><option value=\"56\">B??nh ?????nh</option><option value=\"78\">C?? Mau</option><option value=\"71\">C???n Th??</option><option value=\"26\">Cao B???ng</option><option value=\"59\">Gia Lai</option><option value=\"19\">H?? Giang</option><option value=\"351\">H?? Nam</option><option value=\"4\">H?? N???i</option><option value=\"34\">H?? T??y</option><option value=\"39\">H?? T???nh</option><option value=\"320\">H???i D????ng</option><option value=\"31\">H???i Ph??ng</option><option value=\"18\">H??a B??nh</option><option value=\"321\">H??ng Y??n</option><option value=\"58\">Kh??nh H??a</option><option value=\"77\">Ki??n Giang</option><option value=\"60\">Kon Tum</option><option value=\"23\">Lai Ch??u</option><option value=\"63\">L??m ?????ng</option><option value=\"25\">L???ng S??n</option><option value=\"20\">L??o Cai</option><option value=\"72\">Long An</option><option value=\"350\">Nam ?????nh</option><option value=\"38\">Ngh??? An</option><option value=\"30\">Ninh B??nh</option><option value=\"68\">Ninh Thu???n</option><option value=\"901\">N??i kh??c</option><option value=\"210\">Ph?? Th???</option><option value=\"57\">Ph?? Y??n</option><option value=\"52\">Qu???ng B??nh</option><option value=\"510\">Qu???ng Nam</option><option value=\"55\">Qu???ng Ng??i</option><option value=\"33\">Qu???ng Ninh</option><option value=\"53\">Qu???ng Tr???</option><option value=\"79\">S??c Tr??ng</option><option value=\"22\">S??n La</option><option value=\"66\">T??y Ninh</option><option value=\"36\">Th??i B??nh</option><option value=\"280\">Th??i Nguy??n</option><option value=\"37\">Thanh H??a</option><option value=\"54\">Th???a Thi??n Hu???</option><option value=\"73\">Ti???n Giang</option><option value=\"8\">TP.HCM</option><option value=\"74\">Tr?? Vinh</option><option value=\"27\">Tuy??n Quang</option><option value=\"70\">V??nh Long</option><option value=\"211\">V??nh Ph??c</option><option value=\"29\">Y??n B??i</option><option value=\"511\">???? N???ng</option><option value=\"50\">?????c L???c</option><option value=\"1042\">?????c N??ng</option><option value=\"900\">??i???n Bi??n</option><option value=\"61\">?????ng Nai</option><option value=\"67\">?????ng Th??p</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t<div id=\"txtErrorLoginEmail_Regis\" name=\"txtErrorLoginEmail_Regis\" class=\"errormsg1\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"txtErrorCity_Regis\" name=\"txtErrorCity_Regis\" class=\"errormsg2\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"spacing\">\r\n");
      out.write("\t\t\t\t\t<input placeholder=\"Nh???p l???i ?????a ch??? Email\" type=\"text\" id=\"txtCEmail_Regis\" name=\"txtCEmail_Regis\" maxlength=\"100\" class=\"txt295 marginright10 fleft inputtext\" value=\"\">\r\n");
      out.write("\t\t\t\t\t<input placeholder=\"Nh???p m?? x??c nh???n\" type=\"text\" id=\"txtCaptcha_Regis\" name=\"txtCaptcha_Regis\" maxlength=\"30\" class=\"txt295 marginright10 fleft inputtext\" style=\"width:120px;\" value=\"\">\r\n");
      out.write("\t\t\t\t\t<span id=\"spmImgCaptcha_Regis\" name=\"spmImgCaptcha_Regis\" class=\"fleft\"><img src=\"https://tailieu.vn/image/captcha/06f608b6abc64fcc18b60a48d7b21848.png\"></span>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" value=\"06f608b6abc64fcc18b60a48d7b21848\" name=\"captcha_id_Regis\" id=\"captcha_id_Regis\">\r\n");
      out.write("\t\t\t\t\t<a onclick=\t\"changeCaptchaLogin_Regis();\" href=\"javascript:void(0);\" class=\"newcap fleft\">Ch???n m?? x??c nh???n kh??c.</a>\r\n");
      out.write("\t\t\t\t\t<div id=\"txtErrorLoginEmail2_Regis\" name=\"txtErrorLoginEmail2\" class=\"errormsg1\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"txtErrorDKCode_Regis\" name=\"txtErrorDKCode\" class=\"errormsg2\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"clear\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"margintop5 fleft\">\r\n");
      out.write("\t\t\t\t\t<div class=\"fleft\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width:80px;\" class=\"btncenterblue\" onclick=\"registerMember_Regis();\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btnleftblue\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"btntext\">????ng k??</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btnrightblue\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"fleft marginleft6 paddingtop10\">\r\n");
      out.write("\t\t\t\t\t\t<input checked=\"checked\" type=\"checkbox\" name=\"chkRight_Regis\" id=\"chkRight_Regis\" value=\"1\">&nbsp;T??i ?????ng ?? v???i c??c Ch??nh S??ch v?? Th???a Thu???n S??? D???ng c???a TaiLieu.VN\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
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
