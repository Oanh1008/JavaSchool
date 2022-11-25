/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi2;

import bean.TaiKhoanBean;
import bo.TaiKhoanBo;
import dao.KetNoi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import utils.AutoClose;

/**
 *
 * @author Oanhpv1008
 */
public class TinhToan extends UnicastRemoteObject implements ITinhToan {

    public TinhToan() throws RemoteException{
        
    }
    
    TaiKhoanBo bo = new TaiKhoanBo();
    public long factorial(int number) {
        long rs = 1;
        for (int i = 1; i <= number; i++) {
            rs *= i;
        }
        return rs;
    }

    public long combination(int n, int k) {
        return factorial(n) / (factorial(k) * (factorial(n - k)));
    }

    @Override
    public int Cong(int a, int b) throws Exception {
        int s = a + b;
        System.out.println("Tong: " + s);
        return s;
    }

    @Override
    public int Tru(int a, int b) throws Exception {
        int s = a - b;
        System.out.println("Tru: " + s);
        return s;
    }

    @Override
    public int Nhan(int a, int b) throws Exception {
        int s = a * b;
        System.out.println("Nhan: " + s);
        return s;
    }

    @Override
    public float Chia(int a, int b) throws Exception {
        float s = (float) a / b;
        System.out.println("Chia: " + s);
        return s;
    }

    @Override
    public long tohop(int n, int k) throws Exception {
        return factorial(n)/(factorial(k)*(factorial(n-k)));
    }

    @Override
    public TaiKhoanBean checkLogin(String stk, String mk) throws Exception {
        return bo.checkLogin(stk, mk);
    }
    

}
