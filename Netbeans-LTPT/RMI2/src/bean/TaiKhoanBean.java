/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author Oanhpv1008
 */
public class TaiKhoanBean implements Serializable{
    
    private String soTaiKhoan;
    
    private String hoTen;
    
    private long soTien;
    
    private String matKhau;

    public TaiKhoanBean() {
    }

    public TaiKhoanBean(String soTaiKhoan, String hoTen, long soTien, String matKhau) {
        this.soTaiKhoan = soTaiKhoan;
        this.hoTen = hoTen;
        this.soTien = soTien;
        this.matKhau = matKhau;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public long getSoTien() {
        return soTien;
    }

    public void setSoTien(long soTien) {
        this.soTien = soTien;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public String toString() {
        return "TaiKhoanBean{" + "soTaiKhoan=" + soTaiKhoan + ", hoTen=" + hoTen + ", soTien=" + soTien + ", matKhau=" + matKhau + '}';
    }
    
    
}
