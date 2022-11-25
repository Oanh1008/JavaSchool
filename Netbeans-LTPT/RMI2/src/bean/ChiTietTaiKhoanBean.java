/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Oanhpv1008
 */
public class ChiTietTaiKhoanBean implements Serializable{
    
    private int id;
    
    private Date ngayRutTien;
    
    private long soTienRutRa;
    
    private String soTaiKhoan;
    
    private String ghiChu;

    public ChiTietTaiKhoanBean() {
    }

    public ChiTietTaiKhoanBean(int id, Date ngayRutTien, long soTienRutRa, String soTaiKhoan, String ghiChu) {
        this.id = id;
        this.ngayRutTien = ngayRutTien;
        this.soTienRutRa = soTienRutRa;
        this.soTaiKhoan = soTaiKhoan;
        this.ghiChu = ghiChu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgayRutTien() {
        return ngayRutTien;
    }

    public void setNgayRutTien(Date ngayRutTien) {
        this.ngayRutTien = ngayRutTien;
    }

    public long getSoTienRutRa() {
        return soTienRutRa;
    }

    public void setSoTienRutRa(long soTienRutRa) {
        this.soTienRutRa = soTienRutRa;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
}
