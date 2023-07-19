/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Library;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author emras
 */
public class Main extends javax.swing.JFrame {
public static String username;

    public Main(String username) {
        initComponents();
        this.username = username;
        jLabel5.setText(username);
        DbConnect.Connect();
        Yukle();
    }
    
    public void Yukle(){
        String toplamKitap = "0"; 
        String toplamOgrenci = "0";
        String toplamOdunc = "0";

        PreparedStatement pst;
        PreparedStatement pst2;
        PreparedStatement pst3;

        try {
            pst = DbConnect.con.prepareStatement("select count(id) as toplam from borrow");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
            toplamOdunc = rs.getString("toplam");
                
            }
            rs.close();
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        try {
            pst2 = DbConnect.con.prepareStatement("select count(id) as toplam from student");
            ResultSet rs2 = pst2.executeQuery();
            while(rs2.next()){
            toplamOgrenci = rs2.getString("toplam");
        }
            rs2.close();
            pst2.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        try {
            pst3 = DbConnect.con.prepareStatement("select count(id) as toplam from books");
            ResultSet rs3 = pst3.executeQuery();
            while(rs3.next()){
            toplamKitap = rs3.getString("toplam");
        }
            rs3.close();
            pst3.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        lblToplamKitap.setText(toplamKitap);
        lblBorrowBook.setText(toplamOdunc);
        lblToplamOgrenci.setText(toplamOgrenci);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnBorrow = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnKitaplar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblToplamKitap = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblBorrowBook = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblToplamOgrenci = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnOgrenci = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(213, 181, 156));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExit.setText("Çıkış");
        btnExit.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(213, 181, 156)));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 650, 280, 56));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ANA SAYFA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        btnBorrow.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBorrow.setText("Ödünç Al");
        btnBorrow.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(213, 181, 156)));
        btnBorrow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBorrow.setMaximumSize(new java.awt.Dimension(60, 31));
        btnBorrow.setMinimumSize(new java.awt.Dimension(60, 31));
        btnBorrow.setPreferredSize(new java.awt.Dimension(60, 31));
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 280, 56));

        btnReturn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReturn.setText("İade Et");
        btnReturn.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(213, 181, 156)));
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 280, 56));

        btnKitaplar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnKitaplar.setText("Kitaplar");
        btnKitaplar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(213, 181, 156)));
        btnKitaplar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnKitaplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKitaplarActionPerformed(evt);
            }
        });
        jPanel1.add(btnKitaplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 280, 56));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jPanel2.setBackground(new java.awt.Color(240, 240, 240));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(30, 0, 0, 0, new java.awt.Color(204, 102, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(260, 1));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblToplamKitap.setFont(new java.awt.Font("Segoe UI Black", 0, 50)); // NOI18N
        lblToplamKitap.setForeground(new java.awt.Color(102, 102, 102));
        lblToplamKitap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblToplamKitap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Book_Shelf_50px.png"))); // NOI18N
        lblToplamKitap.setText("50");
        lblToplamKitap.setToolTipText("");
        jPanel2.add(lblToplamKitap, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Toplam Kitap");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, -1, 140));

        jPanel3.setBackground(new java.awt.Color(240, 240, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(30, 0, 0, 0, new java.awt.Color(204, 102, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(260, 1));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBorrowBook.setFont(new java.awt.Font("Segoe UI Black", 0, 50)); // NOI18N
        lblBorrowBook.setForeground(new java.awt.Color(102, 102, 102));
        lblBorrowBook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBorrowBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Sell_50px.png"))); // NOI18N
        lblBorrowBook.setText("50");
        lblBorrowBook.setToolTipText("");
        jPanel3.add(lblBorrowBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ödünç Alınan Kitaplar");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 180, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, -1, 140));

        jPanel4.setBackground(new java.awt.Color(240, 240, 240));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(30, 0, 0, 0, new java.awt.Color(204, 102, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(260, 1));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblToplamOgrenci.setFont(new java.awt.Font("Segoe UI Black", 0, 50)); // NOI18N
        lblToplamOgrenci.setForeground(new java.awt.Color(102, 102, 102));
        lblToplamOgrenci.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblToplamOgrenci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_People_50px.png"))); // NOI18N
        lblToplamOgrenci.setText("50");
        lblToplamOgrenci.setToolTipText("");
        jPanel4.add(lblToplamOgrenci, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Toplam Öğrenci");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 130, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, 140));

        btnOgrenci.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOgrenci.setText("Öğrenciler");
        btnOgrenci.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(213, 181, 156)));
        btnOgrenci.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOgrenci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgrenciActionPerformed(evt);
            }
        });
        jPanel1.add(btnOgrenci, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 280, 56));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pngwing.com.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -20, 1030, 980));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKitaplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKitaplarActionPerformed
        AddBook ab = new AddBook(username);
        this.hide();
        ab.setVisible(true);
    }//GEN-LAST:event_btnKitaplarActionPerformed

    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
        BorrowBook b = new BorrowBook(username);
        this.hide();
        b.setVisible(true);
    }//GEN-LAST:event_btnBorrowActionPerformed

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        ReturnBook r = new ReturnBook(username);
        this.hide();
        r.setVisible(true);
    }//GEN-LAST:event_btnReturnMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Login l = new Login();
        this.hide();
        l.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnOgrenciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgrenciActionPerformed
        Student o = new Student(username);
        this.hide();
        o.setVisible(true);
    }//GEN-LAST:event_btnOgrenciActionPerformed

    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrow;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnKitaplar;
    private javax.swing.JButton btnOgrenci;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblBorrowBook;
    private javax.swing.JLabel lblToplamKitap;
    private javax.swing.JLabel lblToplamOgrenci;
    // End of variables declaration//GEN-END:variables
}
