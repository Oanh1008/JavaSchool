/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import bean.GiaoVienBean;
import bean.ThongKeBean;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ITinhToan extends  Remote{
    public GiaoVienBean ktDn(String tk, String mk) throws  Exception;
    public List<GiaoVienBean> timkiem(String value) throws Exception;
     public List<ThongKeBean> thongke() throws Exception;
   
}
