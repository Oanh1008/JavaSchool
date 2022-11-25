/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class ThongKeBean implements Serializable{
    private String tenLop;
    private int soluong;

    public ThongKeBean() {
    }

    public ThongKeBean(String tenLop, int soluong) {
        this.tenLop = tenLop;
        this.soluong = soluong;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
}
