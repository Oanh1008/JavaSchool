package bo;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.StudentBean;
import dao.StudentDao;

public class StudentBo {

	private static StudentDao studentDao;
	static {
		studentDao = new StudentDao();
	}
	
	public static List<StudentBean> ds;
	
	public List<StudentBean> getAllStudent(){
		ds = studentDao.getAllStudent();
		return ds;
	}
	
	public List<StudentBean> findByClass(String idClass){
		return ds.stream().filter(s -> s.getIdClass().equals(idClass)).collect(Collectors.toList());
	}
	
	public List<StudentBean> findByNamOrAddress(String content){
		return ds.stream().filter(s -> s.getName().toLowerCase().contains(content.toLowerCase().trim()) 
				|| s.getAddress().toLowerCase().contains(content.toLowerCase().trim())
				|| s.getEmail().toLowerCase().contains(content.toLowerCase().trim()))
				.collect(Collectors.toList());
	}
	
	public List<StudentBean> removeById(String id) {
		ds.removeIf(s -> s.getId().equals(id));
		return ds;
	}
}
