/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bo.TaiKhoanBo;
import java.util.Scanner;

/**
 *
 * @author Oanhpv1008
 */
public class Main {
    public static TaiKhoanBo bo;
    private static Scanner sc;
    static{
         bo = new TaiKhoanBo();
         sc = new Scanner(System.in);
    }
    public static void main (String [] args) {
      
        bo.getAll().forEach(System.out::println);
        
        System.out.print("So tai khoan: ");
        String stk = sc.nextLine();
        System.out.print("Mat khau: ");
        String mk = sc.nextLine();
        
        System.out.println(bo.checkLogin(stk, mk));
    }
    
}
