/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.GiaoVienBean;
import bean.ThongKeBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oanhpv1008
 */
public class pvoanhdao {
    
    public GiaoVienBean ktDn(String tk, String mk) throws  Exception{
        String sql = "select * from GiaoVien where MaGv=? and MatKhau=?";
        KetNoi kn = new KetNoi();
        kn.KetNoi();
        PreparedStatement cmd = kn.cn.prepareStatement(sql);
        cmd.setString(1, tk);
        cmd.setString(2, mk);
        GiaoVienBean gv =null;
        ResultSet rs = cmd.executeQuery();
        if(rs.next() ){
            gv = new GiaoVienBean(rs.getString("MaGv"),
                    rs.getString("Hoten"),
                        rs.getBoolean("GioiTinh"), 
                    rs.getString("DiaChi"), 
                        rs.getString("MatKhau"),
                    rs.getString("MaKhoa"));
        }
        return gv;
    }

    public ArrayList<GiaoVienBean> getGiaoVien() {
        ArrayList<GiaoVienBean> khoas = new ArrayList<>();
        String query = "select * from GiaoVien";
        KetNoi kn = new KetNoi();
        kn.KetNoi();
        try {
            PreparedStatement preparedStatement = kn.cn.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                khoas.add(new GiaoVienBean(rs.getString("MaGv"), rs.getString("Hoten"),
                        rs.getBoolean("GioiTinh"), rs.getString("DiaChi"), 
                        rs.getString("MatKhau"), rs.getString("MaKhoa")));
            }
            rs.close();
            preparedStatement.close();
        } catch (SQLException ex) {
            Logger.getLogger(pvoanhdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return khoas;
    }
    
     public ArrayList<ThongKeBean> thongke()throws Exception{
       KetNoi kn = new KetNoi();
        kn.KetNoi();
        String sql="select k.TenKhoa,count(gv.MaGv) as soluong from Khoa as k\n" +
                    "left join GiaoVien as gv on k.MaKhoa =  gv.MaKhoa\n" +
                    "group by k.MaKhoa,k.TenKhoa " ;
        
        ArrayList<ThongKeBean> result = new ArrayList<ThongKeBean>();
        PreparedStatement cmd = kn.cn.prepareStatement(sql);
        ThongKeBean tt ;
        ResultSet rs = cmd.executeQuery();
        while(rs.next() ){
            String tenKhoa = rs.getString("TenKhoa");
            int soluong = rs.getInt("soluong");
            tt = new ThongKeBean(tenKhoa, soluong);
            result.add(tt);
                    
        }
       
        return result;
       
    }
   
    public static void main(String []args){
        try {
            pvoanhdao dao = new pvoanhdao();
            System.out.println( dao.ktDn("1", "123"));
            dao.getGiaoVien().forEach(System.out::println);
            
            dao.thongke().forEach(System.out::println);
        } catch (Exception ex) {
            Logger.getLogger(pvoanhdao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
