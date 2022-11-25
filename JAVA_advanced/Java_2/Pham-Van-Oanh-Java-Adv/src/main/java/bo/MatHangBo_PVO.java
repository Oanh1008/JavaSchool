package bo;

import java.util.List;
import java.util.stream.Collectors;

import bean.MatHang_PVO;
import dao.MatHangDao_PVO;

public class MatHangBo_PVO {

	
	private MatHangDao_PVO dao = new MatHangDao_PVO();
	
	public List<MatHang_PVO> getAllMatHang(){
		return dao.getAllMatHang();
	}
	
	public List<MatHang_PVO> getMatHangByMaNcc(int ncc){
		return dao.getAllMatHang().stream().filter(t -> t.getMaNcc() == ncc).collect(Collectors.toList());
	}
	public List<MatHang_PVO> getMatHangByGia(int gia){
		return dao.getAllMatHang().stream().filter(t -> t.getGia() >= gia).collect(Collectors.toList());
	}
}
