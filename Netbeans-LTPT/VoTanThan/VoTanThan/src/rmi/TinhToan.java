
package rmi;

import bean.SinhVienBean;
import bean.ThongKeBean;
import dao.SinhVienDao;
import dao.ThongKeDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TinhToan extends UnicastRemoteObject implements ITinhToan {
    public  TinhToan() throws RemoteException{};
    SinhVienDao svDao = new SinhVienDao();
    ThongKeDao ttDao = new ThongKeDao();
    @Override
    public SinhVienBean ktDn(String tk, String mk) throws Exception {
        return svDao.ktDn(tk, mk);
    }

    @Override
    public List<SinhVienBean> timkiem(String value) throws Exception {
        if(value.equals("")){
            return svDao.getAll();
        }
        List<SinhVienBean> tam = new ArrayList<SinhVienBean>();
        for(SinhVienBean sv : svDao.getAll() ){
            if(sv.getMaSv().contains(value) || sv.getHoten().contains(value)){
                tam.add(sv);
            }
        }
        return tam;
    }
//     public static void main(String[] args) {
//         try {
//             TinhToan t = new TinhToan();
//             System.out.println("aa:"+ t.ktDn("19T1021237", "123"));
//         } catch (Exception e) {
//             System.out.println("Lỗi:"+ e.getMessage());
//         }
//     }

    @Override
    public List<ThongKeBean> thongke() throws Exception {
        return  ttDao.thongke();
    }
//     public static void main(String[] args) {
//         try {
//             TinhToan t = new TinhToan();
//             System.out.println("aa:"+ t.thongke());
//         } catch (Exception e) {
//             System.out.println("Lỗi:"+ e.getMessage());
//         }
//     }
    
}
    

