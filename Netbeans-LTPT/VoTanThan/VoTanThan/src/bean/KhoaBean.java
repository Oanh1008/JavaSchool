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
public class KhoaBean implements Serializable{
    private int maLop;
    private int tenLop;

    public KhoaBean(int maLop, int tenLop) {
        this.maLop = maLop;
        this.tenLop = tenLop;
    }
    public KhoaBean( int tenLop) {
       
        this.tenLop = tenLop;
    }

    public KhoaBean() {
    }

    public int getMaLop() {
        return maLop;
    }

    public int getTenLop() {
        return tenLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public void setTenLop(int tenLop) {
        this.tenLop = tenLop;
    }
    
}
