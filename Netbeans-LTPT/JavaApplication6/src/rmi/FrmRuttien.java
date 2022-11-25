/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import bean.TaiKhoanBean;
import com.sun.xml.internal.ws.api.message.Message;
import java.rmi.Naming;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class FrmRuttien extends javax.swing.JFrame {

    ITinhToan tt;
    TaiKhoanBean taikhoan;
    /**
     * Creates new form FrmRuttien
     */
    public FrmRuttien(TaiKhoanBean tk) {
        initComponents();
        this.taikhoan = tk;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSotienRut = new javax.swing.JTextField();
        btnRutTien = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mottram = new javax.swing.JButton();
        namtram = new javax.swing.JButton();
        mottrieu = new javax.swing.JButton();
        muoitrieu = new javax.swing.JButton();
        haimuoitrieu = new javax.swing.JButton();
        nammuoitrieu = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("  Rút tiền");

        btnRutTien.setText("Rút ");
        btnRutTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutTienActionPerformed(evt);
            }
        });

        jLabel2.setText("Nhập số khác:");

        mottram.setText("100000");
        mottram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mottramActionPerformed(evt);
            }
        });

        namtram.setText("500000");
        namtram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namtramActionPerformed(evt);
            }
        });

        mottrieu.setText("1000000");
        mottrieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mottrieuActionPerformed(evt);
            }
        });

        muoitrieu.setText("10000000");
        muoitrieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muoitrieuActionPerformed(evt);
            }
        });

        haimuoitrieu.setText("20000000");
        haimuoitrieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haimuoitrieuActionPerformed(evt);
            }
        });

        nammuoitrieu.setText("50000000");
        nammuoitrieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nammuoitrieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRutTien, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mottrieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namtram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mottram, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nammuoitrieu)
                            .addComponent(haimuoitrieu)
                            .addComponent(muoitrieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSotienRut, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mottram)
                    .addComponent(muoitrieu))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namtram)
                    .addComponent(haimuoitrieu))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mottrieu)
                    .addComponent(nammuoitrieu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSotienRut, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRutTien)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRutTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutTienActionPerformed
        // TODO add your handling code here:
        try {
            long soTienRut = Long.parseLong(txtSotienRut.getText());
            System.out.println(soTienRut +" " + taikhoan.getSoTaiKhoan());
            String mes = tt.rutTien(taikhoan.getSoTaiKhoan(),soTienRut );
            JOptionPane.showMessageDialog(rootPane, mes);
            if(mes.contains("thành công")){
                this.setVisible(false);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnRutTienActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         try {
            tt= (ITinhToan)Naming.lookup("rmi://localhost/TinhToan");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowOpened

    private void mottrieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mottrieuActionPerformed
        // TODO add your handling code here:
        try {
            long soTienRut = Long.parseLong(mottrieu.getText());
            System.out.println(soTienRut +" " + taikhoan.getSoTaiKhoan());
            String mes = tt.rutTien(taikhoan.getSoTaiKhoan(),soTienRut );
            JOptionPane.showMessageDialog(rootPane, mes);
            if(mes.contains("thành công")){
                this.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mottrieuActionPerformed

    private void mottramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mottramActionPerformed
        // TODO add your handling code here:
        try {
            long soTienRut = Long.parseLong(mottram.getText());
            System.out.println(soTienRut +" " + taikhoan.getSoTaiKhoan());
            String mes = tt.rutTien(taikhoan.getSoTaiKhoan(),soTienRut );
            JOptionPane.showMessageDialog(rootPane, mes);
            if(mes.contains("thành công")){
                this.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mottramActionPerformed

    private void namtramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namtramActionPerformed
        // TODO add your handling code here:
        try {
            long soTienRut = Long.parseLong(namtram.getText());
            String mes = tt.rutTien(taikhoan.getSoTaiKhoan(),soTienRut );
            JOptionPane.showMessageDialog(rootPane, mes);
            if(mes.contains("thành công")){
                this.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_namtramActionPerformed

    private void muoitrieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muoitrieuActionPerformed
        // TODO add your handling code here:
        try {
            long soTienRut = Long.parseLong(muoitrieu.getText());
            String mes = tt.rutTien(taikhoan.getSoTaiKhoan(),soTienRut );
            JOptionPane.showMessageDialog(rootPane, mes);
            if(mes.contains("thành công")){
                this.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_muoitrieuActionPerformed

    private void haimuoitrieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haimuoitrieuActionPerformed
        // TODO add your handling code here:
        try {
            long soTienRut = Long.parseLong(haimuoitrieu.getText());
            String mes = tt.rutTien(taikhoan.getSoTaiKhoan(),soTienRut );
            JOptionPane.showMessageDialog(rootPane, mes);
            if(mes.contains("thành công")){
                this.setVisible(false);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_haimuoitrieuActionPerformed

    private void nammuoitrieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nammuoitrieuActionPerformed
        // TODO add your handling code here:
        try {
            long soTienRut = Long.parseLong(nammuoitrieu.getText());
            System.out.println(soTienRut +" " + taikhoan.getSoTaiKhoan());
            String mes = tt.rutTien(taikhoan.getSoTaiKhoan(),soTienRut );
            JOptionPane.showMessageDialog(rootPane, mes);
            if(mes.contains("thành công")){
                this.setVisible(false);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_nammuoitrieuActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRuttien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRuttien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRuttien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRuttien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRutTien;
    private javax.swing.JButton haimuoitrieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton mottram;
    private javax.swing.JButton mottrieu;
    private javax.swing.JButton muoitrieu;
    private javax.swing.JButton nammuoitrieu;
    private javax.swing.JButton namtram;
    private javax.swing.JTextField txtSotienRut;
    // End of variables declaration//GEN-END:variables
}
