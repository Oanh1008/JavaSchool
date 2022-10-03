package dao;

import java.util.Arrays;
import java.util.List;

import bean.ClassBean;

public class ClassDao {

	public List<ClassBean> getAllClass(){
		return Arrays.asList(
				new ClassBean("class1", "CNTT K43A"),
				new ClassBean("class2", "CNTT K43B"),
				new ClassBean("class3", "CNTT K43C")
				,new ClassBean("class4", "CNTT K43D"),
				new ClassBean("class5", "CNTT K43E"),
				new ClassBean("class6", "CNTT K43F"));
	}
}
