/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author Admin
 */
public class ThayDoiQuyDinh extends javax.swing.JFrame {

    /**
     * Creates new form ThayDoiQuyDinh
     */
    public ThayDoiQuyDinh() {
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

        PN_thaydoiquydinh_mainmenu = new javax.swing.JPanel();
        BT_trangchu = new javax.swing.JButton();
        BT_sach = new javax.swing.JButton();
        BT_docgia = new javax.swing.JButton();
        BT_muontrasach = new javax.swing.JButton();
        BT_thongke = new javax.swing.JButton();
        BT_hethong = new javax.swing.JButton();
        BT_taikhoan = new javax.swing.JButton();
        BT_dangxuat = new javax.swing.JButton();
        PN_thaydoiquydinh_menu = new javax.swing.JPanel();
        LB_hethong_menu = new javax.swing.JLabel();
        BT_thaydoiquydinh = new javax.swing.JButton();
        BT_thongtinphienban = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PN_thaydoiquydinh_mainmenu.setBackground(new java.awt.Color(51, 51, 255));
        PN_thaydoiquydinh_mainmenu.setAlignmentX(0.0F);
        PN_thaydoiquydinh_mainmenu.setAlignmentY(0.0F);

        BT_trangchu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_trangchu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trangchu.png"))); // NOI18N
        BT_trangchu.setText("Trang Chủ");
        BT_trangchu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BT_trangchu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_trangchuActionPerformed(evt);
            }
        });

        BT_sach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_sach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sach.png"))); // NOI18N
        BT_sach.setText("Sách");
        BT_sach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        BT_docgia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_docgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/docgia.png"))); // NOI18N
        BT_docgia.setText("Độc Giả");
        BT_docgia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        BT_muontrasach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_muontrasach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/muonsach.png"))); // NOI18N
        BT_muontrasach.setText("Mượn Trả Sách");
        BT_muontrasach.setAlignmentY(0.0F);
        BT_muontrasach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        BT_thongke.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_thongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/thongke.png"))); // NOI18N
        BT_thongke.setText("Thống Kê");
        BT_thongke.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        BT_hethong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_hethong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hethong.png"))); // NOI18N
        BT_hethong.setText("Hệ Thống");
        BT_hethong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BT_hethong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_hethongActionPerformed(evt);
            }
        });

        BT_taikhoan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_taikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/taikhoan.png"))); // NOI18N
        BT_taikhoan.setText("Tài Khoản");
        BT_taikhoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        BT_dangxuat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_dangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dangxuat.png"))); // NOI18N
        BT_dangxuat.setText("Đăng Xuất");
        BT_dangxuat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout PN_thaydoiquydinh_mainmenuLayout = new javax.swing.GroupLayout(PN_thaydoiquydinh_mainmenu);
        PN_thaydoiquydinh_mainmenu.setLayout(PN_thaydoiquydinh_mainmenuLayout);
        PN_thaydoiquydinh_mainmenuLayout.setHorizontalGroup(
            PN_thaydoiquydinh_mainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BT_sach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_docgia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_muontrasach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_thongke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_hethong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_taikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_dangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BT_trangchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PN_thaydoiquydinh_mainmenuLayout.setVerticalGroup(
            PN_thaydoiquydinh_mainmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_thaydoiquydinh_mainmenuLayout.createSequentialGroup()
                .addComponent(BT_trangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_sach, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_docgia, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_muontrasach, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_hethong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_taikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BT_dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PN_thaydoiquydinh_menu.setBackground(new java.awt.Color(102, 153, 255));

        LB_hethong_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hethongmain.png"))); // NOI18N

        BT_thaydoiquydinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_thaydoiquydinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/thaydoiquydinh.png"))); // NOI18N
        BT_thaydoiquydinh.setText("Thay Đổi Quy Định");
        BT_thaydoiquydinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_thaydoiquydinhActionPerformed(evt);
            }
        });

        BT_thongtinphienban.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BT_thongtinphienban.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/thongtinphienban.png"))); // NOI18N
        BT_thongtinphienban.setText("Thông Tin Phiên Bản");

        javax.swing.GroupLayout PN_thaydoiquydinh_menuLayout = new javax.swing.GroupLayout(PN_thaydoiquydinh_menu);
        PN_thaydoiquydinh_menu.setLayout(PN_thaydoiquydinh_menuLayout);
        PN_thaydoiquydinh_menuLayout.setHorizontalGroup(
            PN_thaydoiquydinh_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_thaydoiquydinh_menuLayout.createSequentialGroup()
                .addComponent(LB_hethong_menu)
                .addGap(107, 107, 107)
                .addComponent(BT_thaydoiquydinh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(BT_thongtinphienban)
                .addGap(107, 107, 107))
        );
        PN_thaydoiquydinh_menuLayout.setVerticalGroup(
            PN_thaydoiquydinh_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PN_thaydoiquydinh_menuLayout.createSequentialGroup()
                .addComponent(LB_hethong_menu)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PN_thaydoiquydinh_menuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PN_thaydoiquydinh_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_thongtinphienban, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_thaydoiquydinh, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PN_thaydoiquydinh_mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PN_thaydoiquydinh_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PN_thaydoiquydinh_mainmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PN_thaydoiquydinh_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_trangchuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_trangchuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_trangchuActionPerformed

    private void BT_hethongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_hethongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_hethongActionPerformed

    private void BT_thaydoiquydinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_thaydoiquydinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_thaydoiquydinhActionPerformed

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
            java.util.logging.Logger.getLogger(ThayDoiQuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThayDoiQuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThayDoiQuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThayDoiQuyDinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThayDoiQuyDinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_dangxuat;
    private javax.swing.JButton BT_docgia;
    private javax.swing.JButton BT_hethong;
    private javax.swing.JButton BT_muontrasach;
    private javax.swing.JButton BT_sach;
    private javax.swing.JButton BT_taikhoan;
    private javax.swing.JButton BT_thaydoiquydinh;
    private javax.swing.JButton BT_thongke;
    private javax.swing.JButton BT_thongtinphienban;
    private javax.swing.JButton BT_trangchu;
    private javax.swing.JLabel LB_hethong_menu;
    private javax.swing.JPanel PN_thaydoiquydinh_mainmenu;
    private javax.swing.JPanel PN_thaydoiquydinh_menu;
    // End of variables declaration//GEN-END:variables
}
