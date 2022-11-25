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
public class GiaoVienBean implements Serializable{
    private String maGv;
    private String hoTen;
    private Boolean gioiTinh;
    private String diaChi;
    private String matkhau;
    private String maKhoa;

    public GiaoVienBean() {
    }

    public GiaoVienBean(String maGv, String hoTen, Boolean gioiTinh, String diaChi, String matkhau, String maKhoa) {
        this.maGv = maGv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.matkhau = matkhau;
        this.maKhoa = maKhoa;
    }

    public String getMaGv() {
        return maGv;
    }

    public void setMaGv(String maGv) {
        this.maGv = maGv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    @Override
    public String toString() {
        return "GiaoVienBean{" + "maGv=" + maGv + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", matkhau=" + matkhau + ", maKhoa=" + maKhoa + '}';
    }
    
}
