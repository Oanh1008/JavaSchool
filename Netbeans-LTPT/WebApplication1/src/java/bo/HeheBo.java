/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

/**
 *
 * @author Oanhpv1008
 */
public class HeheBo {
    
    public Integer operation(int a, int b) {
        a.DichBu_Service service = new a.DichBu_Service();
        a.DichBu port = service.getDichBuPort();
        return port.operation(a, b);
    }
}
