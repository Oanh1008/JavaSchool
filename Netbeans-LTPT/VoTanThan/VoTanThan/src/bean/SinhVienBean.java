/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class SinhVienBean implements Serializable{
    private String maSv;
    private String hoten;
    private String diachi;
    private boolean gioitinh;
    private String matkhau;
    private int maLop;

    public SinhVienBean() {
    }

    public SinhVienBean(String maSv, String hoten, String diachi, boolean gioitinh, String matkhau, int maLop) {
        this.maSv = maSv;
        this.hoten = hoten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.matkhau = matkhau;
        this.maLop = maLop;
    }
    public SinhVienBean( String hoten, String diachi, boolean gioitinh, String matkhau, int maLop) {
        
        this.hoten = hoten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.matkhau = matkhau;
        this.maLop = maLop;
    }

    public String getMaSv() {
        return maSv;
    }

    public String getHoten() {
        return hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }
    
    
}
