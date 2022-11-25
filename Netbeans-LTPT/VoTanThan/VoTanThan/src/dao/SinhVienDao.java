/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.SinhVienBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class SinhVienDao {
    public SinhVienBean ktDn(String tk, String mk) throws  Exception{
               //KetNoi.KetNoi();
        String sql = "select * from SinhVien where maSv=? and matkhau=?";
        PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);
        cmd.setString(1, tk);
        cmd.setString(2, mk);
        SinhVienBean sv =null;
        ResultSet rs = cmd.executeQuery();
        if(rs.next() == true){
            String maSv = rs.getNString("maSv");
            String hoten = rs.getString("hoten");
            String diachi = rs.getString("diachi");
            boolean  gioitinh=rs.getBoolean("gioitinh");
            int maLop = rs.getInt("maLop");
            sv = new SinhVienBean(maSv, hoten, diachi, gioitinh, maSv, maLop);
        
        }
        return sv;
    }
    public List<SinhVienBean> getAll() throws  Exception{
               //KetNoi.KetNoi();
        List<SinhVienBean> result = new ArrayList<SinhVienBean>();
        String sql = "select * from SinhVien";
        PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);
 
        SinhVienBean sv;
        ResultSet rs = cmd.executeQuery();
        while(rs.next()){
            String maSv = rs.getNString("maSv");
            String hoten = rs.getString("hoten");
            String diachi = rs.getString("diachi");
            boolean  gioitinh=rs.getBoolean("gioitinh");
            int maLop = rs.getInt("maLop");
            sv = new SinhVienBean(maSv, hoten, diachi, gioitinh, maSv, maLop);
            result.add(sv);
        
        }
        return result;
    }
   
}
