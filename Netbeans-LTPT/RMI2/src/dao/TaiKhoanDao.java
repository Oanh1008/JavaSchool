/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.TaiKhoanBean;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import utils.AutoClose;

/**
 *
 * @author Oanhpv1008
 */
public class TaiKhoanDao {

    public static KetNoi kn;

    static {
        kn = new KetNoi();
        kn.connectToSqlServer();
    }
    public Connection cn = kn.connection;
    public  PreparedStatement preparedStatement;
    public  ResultSet rs;
    public ArrayList<TaiKhoanBean> getAll() {

        ArrayList<TaiKhoanBean> tks = new ArrayList<>();
        String sql = "select * from TaiKhoan";

        try {
             preparedStatement = cn.prepareStatement(sql);
             rs = preparedStatement.executeQuery();
            while (rs.next()) {
                tks.add(new TaiKhoanBean(rs.getString("SoTaiKhoan"), rs.getString("HoTen"), rs.getLong("SoTien"), rs.getString("MatKhau")));
            }
            AutoClose.close(rs, preparedStatement);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return tks;
    }

    public TaiKhoanBean checkLogin(String soTK, String mk) {
        String sql = "select * from TaiKhoan where SoTaiKhoan=? and MatKhau =?";

        try {
            preparedStatement = cn.prepareStatement(sql);
            preparedStatement.setString(1, soTK);
            preparedStatement.setString(2, mk);
            rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return new TaiKhoanBean(rs.getString("SoTaiKhoan"), rs.getString("HoTen"), rs.getLong("SoTien"), rs.getString("MatKhau"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            AutoClose.close(rs, preparedStatement);
        }
        return null;
    }
}
