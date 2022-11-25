/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.TaiKhoanBean;
import dao.TaiKhoanDao;
import java.util.ArrayList;

/**
 *
 * @author Oanhpv1008
 */
public class TaiKhoanBo {
    public static TaiKhoanDao dao;
    public static ArrayList<TaiKhoanBean> dstk;
    static {
        dao = new TaiKhoanDao();
        dstk = new ArrayList<>();
    }
   
   public ArrayList<TaiKhoanBean> getAll() {
        dstk = dao.getAll();
        return dstk;
    }
   
   public TaiKhoanBean checkLogin(String soTK, String mk) {
       
       return dao.checkLogin(soTK, mk);
   }
}
