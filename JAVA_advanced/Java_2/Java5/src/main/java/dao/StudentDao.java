package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.ClassBean;
import bean.StudentBean;

public class StudentDao {

	public List<StudentBean> getAllStudent() {
		List<StudentBean> s = new ArrayList<>();
		s.add(new StudentBean("19T1021165", "Tôn Nữ Thị Ninh", "class2", "Huế","19T1021165@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdKF2_vXjGIW8u6ug9bt1k_OL6srb9CyjVPw&usqp=CAU"));
		s.add(new StudentBean("19T1021161", "Lâm Thị Mỹ Dạ", "class3", "Huế","19T1021161@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrPD-M7flVPXdlTG8hwlI7c8Ng60OM5Jl1Uw&usqp=CAU"));
		s.add(new StudentBean("19T1021162", "Lê Chân", "class4", "Quảng Nam","19T1021162@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRh3tPP3ETG6smkYSZGZBfaoV6OZPHzOZvjNQ&usqp=CAU"));
		s.add(new StudentBean("19T1021163", "Trần Lê Quốc Toàn", "class5", "Huế","19T1021163@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVIQkLz5p1_3jCLnEmdiNBOHPWpbxDYDk-wQ&usqp=CAU"));
		s.add(new StudentBean("19T1021164", "Trương Văn Thái Quý", "class6", "Đà Nẵng","19T1021164@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTek9hpZ4_SNL9L6P-8bGpfDEhFjmni38QU0g&usqp=CAU"));
		s.add(new StudentBean("19T1021166", "Trịnh Kiểm", "class6", "Quảng Trị","19T1021166@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtF4-i-g3kGs2jef3aERMwaAgwc28kD6hLmA&usqp=CAU"));
		s.add(new StudentBean("19T1021167", "Nguyễn Phúc Vĩnh San", "class5", "Đà Nẵng","19T1021167@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQicaAk6yLvbzPQI_kofQNAfgplJ_JAu0somQ&usqp=CAU"));
		s.add(new StudentBean("19T1021168", "Trần Thủ Độ", "class4", "Đà Nẵng","19T1021168@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdgVO1IcckhFG-xjs4X6uFKK3D0OlzVg04Pg&usqp=CAU"));
		s.add(new StudentBean("19T1021169", "Trần Cảnh", "class3", "Huế","19T1021169@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdKF2_vXjGIW8u6ug9bt1k_OL6srb9CyjVPw&usqp=CAU"));
		s.add(new StudentBean("19T1021115", "Trần Hữu Đông Triều", "class2", "Quảng Nam","19T1021115@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrPD-M7flVPXdlTG8hwlI7c8Ng60OM5Jl1Uw&usqp=CAU"));
		s.add(new StudentBean("19T1021125", "Trương Văn Thái Quý", "class1", "Huế","19T1021125@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVIQkLz5p1_3jCLnEmdiNBOHPWpbxDYDk-wQ&usqp=CAU"));
		s.add(new StudentBean("19T1021135", "Nguyễn Thị Ánh Viên", "class1", "Quảng Nam","19T1021135@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdgVO1IcckhFG-xjs4X6uFKK3D0OlzVg04Pg&usqp=CAU"));
		s.add(new StudentBean("19T1021145", "Nguyễn Ngọc Trường Sơn", "class2", "Đà Nẵng","19T1021145@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdgVO1IcckhFG-xjs4X6uFKK3D0OlzVg04Pg&usqp=CAU"));
		s.add(new StudentBean("19T1021155", "Lý Thiên Hinh", "class3", "Huế","19T1021155@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdgVO1IcckhFG-xjs4X6uFKK3D0OlzVg04Pg&usqp=CAU"));
		s.add(new StudentBean("19T1021165", "Phạm Văn Oanh", "class4", "Quảng Trị","19T1021165@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdgVO1IcckhFG-xjs4X6uFKK3D0OlzVg04Pg&usqp=CAU"));
		s.add(new StudentBean("19T1021175", "Phạm Văn Oanh", "class5", "Quảng Nam","19T1021175@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdgVO1IcckhFG-xjs4X6uFKK3D0OlzVg04Pg&usqp=CAU"));
		s.add(new StudentBean("19T1021185", "Phạm Văn Oanh", "class6", "Huế","19T1021185@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRh3tPP3ETG6smkYSZGZBfaoV6OZPHzOZvjNQ&usqp=CAU"));
		s.add(new StudentBean("19T1021195", "Phạm Văn Oanh", "class6", "Đà Nẵng","19T1021195@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRh3tPP3ETG6smkYSZGZBfaoV6OZPHzOZvjNQ&usqp=CAU"));
		s.add(new StudentBean("19T1021165", "Phạm Văn Oanh", "class5", "Quảng Trị","19T1021165@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdKF2_vXjGIW8u6ug9bt1k_OL6srb9CyjVPw&usqp=CAU"));
		s.add(new StudentBean("19T1021265", "Phạm Văn Oanh", "class4", "Đà Nẵng","19T1021265@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVIQkLz5p1_3jCLnEmdiNBOHPWpbxDYDk-wQ&usqp=CAU"));
		s.add(new StudentBean("19T1023165", "Phạm Văn Oanh", "class3", "Quảng Nam","19T1023165@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRh3tPP3ETG6smkYSZGZBfaoV6OZPHzOZvjNQ&usqp=CAU"));
		s.add(new StudentBean("19T1021465", "Phạm Văn Oanh", "class2", "Đà Nẵng","19T1021465@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRh3tPP3ETG6smkYSZGZBfaoV6OZPHzOZvjNQ&usqp=CAU"));
		s.add(new StudentBean("19T1021565", "Phạm Văn Oanh", "class1", "Quảng Nam","19T1021565@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQicaAk6yLvbzPQI_kofQNAfgplJ_JAu0somQ&usqp=CAU"));
		s.add(new StudentBean("19T1021665", "Phạm Văn Oanh", "class1", "Đà Nẵng","19T1021665@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdgVO1IcckhFG-xjs4X6uFKK3D0OlzVg04Pg&usqp=CAU"));
		s.add(new StudentBean("19T1021765", "Phạm Văn Oanh", "class2", "Quảng Nam","19T1021765@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrPD-M7flVPXdlTG8hwlI7c8Ng60OM5Jl1Uw&usqp=CAU"));
		s.add(new StudentBean("19T1021865", "Phạm Văn Oanh", "class3", "Quảng Trị","19T1021865@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdgVO1IcckhFG-xjs4X6uFKK3D0OlzVg04Pg&usqp=CAU"));
		s.add(new StudentBean("19T1021965", "Phạm Văn Oanh", "class4", "Đà Nẵng","19T1021965@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdgVO1IcckhFG-xjs4X6uFKK3D0OlzVg04Pg&usqp=CAU"));
		s.add(new StudentBean("19T1025165", "Phạm Văn Oanh", "class15", "Đà Nẵng","19T1025165@husc.edu.vn","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQicaAk6yLvbzPQI_kofQNAfgplJ_JAu0somQ&usqp=CAU"));
		return s;
	}
}
