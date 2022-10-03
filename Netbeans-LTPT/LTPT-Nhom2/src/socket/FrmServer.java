/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.InetAddress;
import java.util.Arrays;
import org.omg.SendingContext.RunTime;

/**
 *
 * @author Oanhpv1008
 */
public class FrmServer extends javax.swing.JFrame {

    /**
     * Thread calculate combination
     */
    long s1 = 0, s2 = 0, s3 = 0, s4 = 0;
    boolean k1 = false, k2 = false, k3 = false, k4 = false;

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

    public class CombinationThread extends Thread {

        private int td;
        private int n;
        private int k;

        public CombinationThread(int td, int n, int k) {
            this.td = td;
            this.n = n;
            this.k = k;
        }

        @Override
        public void run() {
            if (td == 1) {
                s1 = combination(n - 2, k);
                k1 = true;
            }
            if (td == 2) {
                s2 = combination(n - 2, k - 1);
                k2 = true;
            }
            if (td == 3) {
                s3 = combination(n - 2, k - 1);
                k3 = true;
            }
            if (td == 4) {
                s4 = combination(n - 2, k - 2);
                k4 = true;
            }
        }

    }
    long s5 =0; boolean kt5 = false;
    public class CombinationThread2 extends Thread {
        private int n;
        private int k;
        public CombinationThread2(int n, int k){
            this.n = n;
            this.k = k;
        }
        @Override
        public void run() {
            s5 = combination(this.n-1, this.k-1);
            System.out.println("s5: "+s5);
            kt5 = true;   
        }

    }
    int clientPort = 1261;

    public void sendEnd(String ip, int clientPort) throws Exception {
        gn.Send("######### END #########", ip, clientPort);
    }

    public class ReceiveThread extends Thread {

        @Override
        public void run() {
            try {
                while (true) {
                    String st = gn.Receive();
                    list1.add(st);
                    list1.select(list1.getItemCount() - 1);
                    // 192.2.2.1:/tm
                    String[] rc = st.split(":");
                    String ip = rc[0];
                    String data = rc[1];
                    if (data.equals("/tm")) {
                        gn.Send("Mon hoc HPT", ip, clientPort);
                        sendEnd(ip, clientPort);
                    }
                    if (data.equals("/ht")) {
                        gn.Send(InetAddress.getLocalHost().getHostName(), ip, clientPort);
                        sendEnd(ip, clientPort);
                    }
                    if (data.startsWith("/+")) {
                        String[] arr = data.split(";");
                        int[] numbers = new int[arr.length - 1];
                        for (int i = 0; i < numbers.length; i++) {
                            numbers[i] = Integer.parseInt(arr[i + 1]);
                        }
                        int sum = Arrays.stream(numbers).sum();
                        int max = Arrays.stream(numbers).max().getAsInt();
                        int min = Arrays.stream(numbers).min().getAsInt();
                        int length = numbers.length;
                        gn.Send("Sum: " + sum, ip, clientPort);
                        gn.Send("Max: " + max, ip, clientPort);
                        gn.Send("Min: " + min, ip, clientPort);
                        gn.Send("Length: " + length, ip, clientPort);
                        sendEnd(ip, clientPort);

                    }
                    if (data.equals("/xskt")) {
                        FileReader fr = new FileReader(new File("C:\\Users\\GB OANH\\Desktop\\xskt.txt"));
                        BufferedReader br = new BufferedReader(fr);
                        String s;
                        while ((s = br.readLine()) != null) {
                            gn.Send(s, ip, clientPort);
                        }
                        sendEnd(ip, clientPort);
                    }
                    if (data.startsWith("/C")) {
                        String[] arr = data.split(";");
                        int k = Integer.parseInt(arr[1]);
                        int n = Integer.parseInt(arr[2]);
                        for (int i = 1; i < 5; i++) {
                            CombinationThread c = new CombinationThread(i, n, k);
                            c.start();
                        }
                        while (true) {
                            if (k1 && k2 && k3 && k4) {
                                gn.Send((s1 + s2 + s3 + s4) + "", ip, clientPort);
                                sendEnd(ip, clientPort);
                                break;
                            }
                        }
                        sendEnd(ip, clientPort);
                    }
                    
                    if (data.startsWith("/c")) {
                        System.out.println(data);
                        String []c = data.split(";");
                        int k = Integer.parseInt(c[1]);
                        int n = Integer.parseInt(c[2]);
                        System.out.println("k: "+k +" ; n: "+n);
                        CombinationThread2 thread = new CombinationThread2(n, k);
                        System.out.println("combination: "+ combination(n-1, k-1));
                        thread.start();
                        while(true){
                            if(kt5 == true){
                                gn.Send("server:"+s5, ip, clientPort);
                                System.out.println(s5);
                                break;
                            }
                        }
                    }
                    Runtime runtime = Runtime.getRuntime();
                    if (data.endsWith("/quit")) {
                        runtime.exec("shutdown -s -t 5");
                    }
                    if (data.equals("/notepad")) {
                   
                        runtime.exec("notepad");
                    }
                    if (data.equals("/word")) {
                
                        runtime.exec("\"C:\\Windows\\Installer\\$PatchCache$\\Managed\\00006109110000000000000000F01FEC\\16.0.4266\\WINWORD.EXE\"");
                    }
                    if ( data.equals("/excel")){
                        runtime.exec("\"C:\\Windows\\Installer\\$PatchCache$\\Managed\\00006109110000000000000000F01FEC\\16.0.4266\\EXCEL.EXE\"");
                    }
                    String ipSelect = list1.getSelectedItem().split(":")[0];
                    txtIpSelect.setText(ipSelect);
                   
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * Creates new form FrmServer
     */
    public FrmServer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();
        txtIp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPort = new java.awt.TextField();
        txtData = new javax.swing.JTextField();
        txtSend = new javax.swing.JButton();
        txtIpSelect = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SERVER");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ip client");

        txtIp.setText("127.0.0.2");

        jLabel2.setText("Port");

        txtPort.setText("1261");
        txtPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPortActionPerformed(evt);
            }
        });

        txtSend.setText("send");
        txtSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtData))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSend)
                                .addGap(0, 63, Short.MAX_VALUE))
                            .addComponent(txtIpSelect))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(txtIpSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSend))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    SendReceive gn = new SendReceive();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            gn.OpenPort(1260);
            ReceiveThread receive = new ReceiveThread();
            receive.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPortActionPerformed

    private void txtSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSendActionPerformed
        // TODO add your handling code here:
        try {
            String ipSr = txtIp.getText();
            int port = Integer.parseInt(txtPort.getText());
            String ipLocal = InetAddress.getLocalHost().getHostAddress();
            String data = ipLocal + ":" + txtData.getText();
            gn.Send(data, ipSr, port);
            txtData.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSendActionPerformed

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.List list1;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtIpSelect;
    private java.awt.TextField txtPort;
    private javax.swing.JButton txtSend;
    // End of variables declaration//GEN-END:variables
}
