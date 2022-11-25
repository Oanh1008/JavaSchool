/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ChiTietTaiKhoanBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ChiTietTaiKhoanDao {
    public int them(Date ngayRutTien, long soTienRutRa,String soTaiKhoan,String ghiChu )throws  Exception{
        
        String sql = "insert into ChiTietTaiKhoan(NgayRutTien,SoTienRutRa,SoTaiKhoan,GhiChu)\n" +
"		values(?,?,?,?);";
        PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);
        java.sql.Date sqlD = new java.sql.Date(ngayRutTien.getTime());
        cmd.setDate(1, sqlD);       
        cmd.setLong(2, soTienRutRa);
        cmd.setString(3,soTaiKhoan );
        cmd.setString(4,ghiChu );
        return cmd.executeUpdate();
    }
    public List<ChiTietTaiKhoanBean> lichSuGD(String soTaiKhoan) throws  Exception{
        List<ChiTietTaiKhoanBean> result = new ArrayList<ChiTietTaiKhoanBean>();
        String sql = "select * from ChiTietTaiKhoan where SoTaiKhoan = ?";
        PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);
        cmd.setString(1, soTaiKhoan );
        ResultSet rs = cmd.executeQuery();
        while(rs.next()){
            long Id = rs.getLong("Id");
            Date NgayRutTien = rs.getDate("NgayRutTien");
            String SoTaiKhoan = rs.getString("SoTaiKhoan");
            String GhiChu = rs.getString("GhiChu");
            long SoTienRutRa = rs.getLong("SoTienRutRa");
            result.add( new ChiTietTaiKhoanBean(Id, NgayRutTien, SoTienRutRa, SoTaiKhoan, GhiChu));
        }
        rs.close();
        return result;
    }
    
}
