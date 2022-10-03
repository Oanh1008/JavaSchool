package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.LoaiBean;

public class LoaiDao {
	public List<LoaiBean> getLoai() {
		return Arrays.asList(
				new LoaiBean("tin","Công nghệ thông tin"),
				new LoaiBean("toan","Toán ứng dụng"),
				new LoaiBean("ly", "Vật lý chất rắn"),
				new LoaiBean("hoa", "Công nghệ hóa dầu"));
	}
}
