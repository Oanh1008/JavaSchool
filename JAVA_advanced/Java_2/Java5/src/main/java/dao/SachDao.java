package dao;

import java.util.Arrays;
import java.util.List;

import bean.SachBean;

public class SachDao {

	public List<SachBean> getSach() {
		return Arrays.asList(
				new SachBean("s1", "Cơ sở dữ liệu 1", "Lê Nam", 10, 10000, "b1.jpg", "tin"),
				new SachBean("s2", "Cơ sở dữ liệu 2", "Lê Nam", 10, 10000, "b2.jpg", "tin"),
				new SachBean("s3", "Cơ sở dữ liệu 3", "Lê Nam", 10, 10000, "b3.jpg", "tin"),
				new SachBean("s4", "Giải tích 1", "Lê Nam", 10, 10000, "b4.jpg", "toan"),
				new SachBean("s5", "Giải tích 2", "Lê Nam", 10, 10000, "b5.jpg", "toan"),
				new SachBean("s5", "Vật lý 1", "Đỗ Nam", 10, 10000, "b6.jpg", "ly"));
	}
}
