/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package rmi2;

import java.rmi.Naming;

/**
 *
 * @author Oanhpv1008
 */
public class MyClient {
    public static void main (String[] args){
        try{
            ITinhToan tt = (ITinhToan)Naming.lookup("rmi://localhost/TinhToan");
            System.out.println(tt.Cong(19, 21));
            System.out.println(tt.Tru(19, 21));
            System.out.println(tt.Nhan(19, 21));
            System.out.println(tt.Chia(19, 21));
          
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
