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
public class ThongKeBean implements Serializable{
     private String tenKhoa;
    private int soluong;

    public ThongKeBean() {
    }

    public ThongKeBean(String tenKhoa, int soluong) {
        this.tenKhoa = tenKhoa;
        this.soluong = soluong;
    }

    public String getTenLop() {
        return tenKhoa;
    }

    public void setTenLop(String tenLop) {
        this.tenKhoa = tenLop;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "ThongKeBean{" + "tenKhoa=" + tenKhoa + ", soluong=" + soluong + '}';
    }
    
}
