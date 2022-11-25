/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.SinhVienBean;
import bean.ThongKeBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ThongKeDao {
    
    public List<ThongKeBean> thongke()throws Exception{
        KetNoi.KetNoi();
        String sql="SELECT LopHoc.tenLop, COUNT(tenLop) as soluong\n" +
"FROM     dbo.LopHoc INNER JOIN\n" +
"                  dbo.SinhVien ON dbo.LopHoc.maLop = dbo.SinhVien.maLop\n" +
"group by tenLop";
        List<ThongKeBean> result = new ArrayList<ThongKeBean>();
        PreparedStatement cmd = KetNoi.cn.prepareStatement(sql);
        
        ThongKeBean tt ;
        ResultSet rs = cmd.executeQuery();
        while(rs.next() ){
            String tenLop = rs.getString("tenLop");
            int soluong = rs.getInt("soluong");
          
            tt = new ThongKeBean(tenLop, soluong);
            result.add(tt);
                    
        }
        KetNoi.cn.close();
        return result;
       
    }
}
