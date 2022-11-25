/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import bean.SinhVienBean;
import bean.ThongKeBean;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ITinhToan extends  Remote{
    public SinhVienBean ktDn(String tk, String mk) throws  Exception;
    //public List<> VanTinTaiKhoan(String tk) throws  Exception;
    public List<SinhVienBean> timkiem(String value) throws Exception;
    
     public List<ThongKeBean> thongke() throws Exception;
   
}
