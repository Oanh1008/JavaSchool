
package rmi;

import bean.GiaoVienBean;
import bean.ThongKeBean;
import dao.pvoanhdao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ADMIN
 */
public class TinhToan extends UnicastRemoteObject implements ITinhToan {
    public  TinhToan() throws RemoteException{};
    pvoanhdao pvoanh = new pvoanhdao();

    @Override
    public GiaoVienBean ktDn(String tk, String mk) throws Exception {
        return pvoanh.ktDn(tk, mk);
    }

    @Override
    public List<GiaoVienBean> timkiem(String value) throws Exception {
        if(value.equals("")){
            return pvoanh.getGiaoVien();
        }
        return pvoanh.getGiaoVien().stream().filter(t -> t.getHoTen().toLowerCase().contains(value.toLowerCase().trim()) 
        || t.getMaGv().contains(value.toLowerCase().trim())).collect(Collectors.toList());
    }

    @Override
    public List<ThongKeBean> thongke() throws Exception {
        return  pvoanh.thongke();
    } 
}
    

