package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import bean.SachBean;
import bo.SachBo;

/**
 * Servlet implementation class ThemSach
 */
@WebServlet("/ThemSach")
public class ThemSach extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThemSach() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// TODO Auto-generated method stub
		SachBo sbo = new SachBo();
		DiskFileItemFactory factory = new DiskFileItemFactory();
		DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
		String masach="", tensach="",maloai= "",anh= "",tacgia ="";
		int soluong=0,gia=0,sotap = 0;

		try {
			List<FileItem> fileItems = upload.parseRequest(request);// Lấy về các đối tượng gửi lên
			// duyệt qua các đối tượng gửi lên từ client gồm file và các control
			for (FileItem fileItem : fileItems) {
				if (!fileItem.isFormField()) {// Nếu ko phải các control=>upfile lên
					// xử lý file
					String nameimg = fileItem.getName();
					if (!nameimg.equals("")) {
						// Lấy đường dẫn hiện tại, chủ ý xử lý trên dirUrl để có đường dẫn đúng
						String dirUrl = request.getServletContext().getRealPath("") + File.separator + "image_sach";
						File dir = new File(dirUrl);
						if (!dir.exists()) {// nếu ko có thư mục thì tạo ra
							dir.mkdir();
						}
						String fileImg = dirUrl + File.separator + nameimg;
						File file = new File(fileImg);// tạo file
						try {
							fileItem.write(file);// lưu file
							System.out.println("UPLOAD THÀNH CÔNG...!");
							System.out.println("Đường dẫn lưu file là: " + dirUrl);
							anh = file.getName();
							System.out.println(anh);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} else// Neu la control
				{
					String tentk = fileItem.getFieldName();
				
					if (tentk.equals("masach"))
						masach = fileItem.getString();
					if (tentk.equals("tensach"))
						tensach = fileItem.getString();
					if (tentk.equals("maloai"))
						maloai = fileItem.getString();
					if (tentk.equals("tacgia"))
						tacgia = fileItem.getString();
					if (tentk.equals("soluong"))
						soluong = Integer.parseInt(fileItem.getString());
					if (tentk.equals("sotap"))
						sotap = Integer.parseInt(fileItem.getString());
					if (tentk.equals("gia"))
						gia = Integer.parseInt(fileItem.getString());
					System.out.println(tentk +" "+fileItem.getString());
					
				}
			}

		} catch (FileUploadException e) {
			e.printStackTrace();
		}
		
		System.out.println(masach + tensach + soluong+ gia+ tacgia+sotap+maloai);
		anh = "image_sach/"+anh;
		SachBean s = new SachBean( masach,  tensach,  soluong,  gia,  maloai,  anh,  tacgia);
		int rs = sbo.themSach(s);
		request.setAttribute("ttc", rs);		
		request.getRequestDispatcher("SuaXoaSach").forward(request, response);
		

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
