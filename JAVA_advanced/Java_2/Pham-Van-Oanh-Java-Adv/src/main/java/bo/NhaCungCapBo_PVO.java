package bo;

import java.util.List;

import bean.NhaCungCap_PVO;
import dao.NhaCungCapDao_PVO;

public class NhaCungCapBo_PVO {

	private NhaCungCapDao_PVO dao = new NhaCungCapDao_PVO();
	
	public List<NhaCungCap_PVO> getNcc(){
		return dao.getAllNcc();
	}
}
