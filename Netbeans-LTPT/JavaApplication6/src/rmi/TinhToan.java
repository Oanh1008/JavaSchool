/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import bean.ChiTietTaiKhoanBean;
import bean.TaiKhoanBean;
import dao.ChiTietTaiKhoanDao;
import dao.TaiKhoanDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TinhToan extends UnicastRemoteObject implements ITinhToan {

    public TinhToan() throws RemoteException {
    }
    ;
    TaiKhoanDao tkDao = new TaiKhoanDao();
    ChiTietTaiKhoanDao cttkDao = new ChiTietTaiKhoanDao();

    @Override
    public TaiKhoanBean ktDn(String tk, String mk) throws Exception {

        return tkDao.ktDn(tk, mk);

    }

    @Override
    public String rutTien(String soTaiKhoan, long soTienRut) throws Exception {
        if (VanTinTaiKhoan(soTaiKhoan).getSoTien() < soTienRut) {
            return "Số tiền rút phải nhỏ hơn số dư";
        } else {
            tkDao.rutTien(soTaiKhoan, soTienRut);
            cttkDao.them(new java.util.Date(), soTienRut, soTaiKhoan, "ok");
            return "Bạn đã rút thành công:" + soTienRut +"("+Doc_so_thay_lam(soTienRut)+")";
        }
    }

    @Override
    public String chuyenTien(String soTaiKhoanChuyen, long soTienChuyen, String soTaiKhoanNhan) throws Exception {
        if (tkDao.VanTinTaiKhoan(soTaiKhoanNhan) == null) {
            return "Không tồn tài số tài khoản này";
        } else if (soTienChuyen > tkDao.VanTinTaiKhoan(soTaiKhoanChuyen).getSoTien()) {
            return "Số dư của bạn không đủ!";
        } else {
            tkDao.chuyenTien(soTaiKhoanChuyen, soTienChuyen, soTaiKhoanNhan);
            cttkDao.them(new java.util.Date(), soTienChuyen, soTaiKhoanChuyen,
                    "STK:" + soTaiKhoanNhan + " số tiền là: " + soTienChuyen);
            return "Bạn đã chuyển tiền thành công ";
        }
    }

    @Override
    public String doiMatKhau(String soTaiKhoan, String matKhauCu, String matKhauMoi) throws Exception {
        if (matKhauCu.equals(matKhauMoi)) {
            return "Trùng mật khẩu cũ";
        } else if (tkDao.doiMatKhau(soTaiKhoan, matKhauCu, matKhauMoi) == 0) {
            return "Nhập mật khẩu cũ sai!";
        } else {
            return "Đã đổi mật khẩu";
        }
    }

    @Override
    public TaiKhoanBean VanTinTaiKhoan(String tk) throws Exception {
        return tkDao.VanTinTaiKhoan(tk);
    }

    @Override
    public List<ChiTietTaiKhoanBean> lichSuGD(String soTaiKhoan) throws Exception {
        return cttkDao.lichSuGD(soTaiKhoan);
    }

    public String Mot_so(long n) {
        if (n == 0) {
            return " khong ";
        }
        if (n == 1) {
            return " mot ";
        }
        if (n == 2) {
            return " hai ";
        }
        if (n == 3) {
            return " ba ";
        }
        if (n == 4) {
            return " bon ";
        }
        if (n == 5) {
            return " nam ";
        }
        if (n == 6) {
            return " sau ";
        }
        if (n == 7) {
            return " bay ";
        }
        if (n == 8) {
            return " tam ";
        }
        if (n == 9) {
            return " chin ";
        }
        return "";
    }

    public String Hai_so(long n) {
        long c = n / 10;
        long dv = n % 10;
        if (c == 1) {
            if (dv == 0) {
                return " muoi ";
            } else if (dv == 5) {
                return " muoi lam ";
            } else {
                return " muoi " + Mot_so(dv);
            }
        } else {
            if (dv == 0) {
                return Mot_so(c) + " muoi ";
            } else if (dv == 1) {
                return Mot_so(c) + " muoi mot ";
            } else if (dv == 5) {
                return Mot_so(c) + " muoi lam ";
            } else {
                return Mot_so(c) + " muoi " + Mot_so(dv);
            }
        }

    }

    public String Ba_so(long n) {
        long dv = n % 10;
        long ch = (n % 100) / 10;
        long tr = n / 100;
        if (ch == 0) {
            if (dv == 0) {
                if (tr == 0) {
                    return " ";
                } else {
                    return Mot_so(tr) + " tram ";
                }
            } else {
                return Mot_so(tr) + " tram le " + Mot_so(dv);
            }
        } else {
            return Mot_so(tr) + " tram " + Hai_so(ch * 10 + dv);
        }
    }

    public String Doc_so_thay_lam(long n){
	
	int nhom=1; String st1="",st="";
	while(n!=0){
		long dv=n%10; long c=n/10%10;long t=n/100%10;
		if(n<10) st1=Mot_so(n);
		else if(n<100) st1=Hai_so(c*10+dv);
		else st1=Ba_so(t*100+c*10+dv);
		if(st1!=""){
		    if(nhom==1) st=st1;
		    if(nhom==2) st=st1+" nghin, "+st;
		    if(nhom==3) st=st1+" trieu, "+st;
		    if(nhom==4) st=st1+" ty, "+st;
		    if(nhom==5) st=st1+" nghin, "+st;
		}
		n=n/1000;nhom++;
	}
	return st;
}


    

    @Override
    public String docSo(long so) {
        return Doc_so_thay_lam(so);
    }

}
