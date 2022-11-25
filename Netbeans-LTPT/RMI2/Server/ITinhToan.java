import java.rmi.Remote;

/**
 *
 * @author Oanhpv1008
 */
public interface ITinhToan extends Remote{
    int Cong(int a, int b) throws Exception;
    int Tru (int a, int b) throws Exception;
    int Nhan(int a,int b) throws Exception;
    float Chia(int a, int b) throws Exception;
    long tohop(int n,int k) throws Exception;
}
