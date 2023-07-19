/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Library;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

public class AddBook extends javax.swing.JFrame {
public static String username;
    /**
     * Creates new form Main
     */
    public AddBook(String username) {
        initComponents();
        this.username = username;
        DbConnect.Connect();
        Book_Load();
    }
    
    PreparedStatement pst;
    ResultSet rs;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        comboTur = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(213, 181, 156));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kitaplar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        txtName.setNextFocusableComponent(txtAuthor);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 234, 37));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Yazar Adı :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtAuthor.setNextFocusableComponent(txtPage);
        jPanel1.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 234, 37));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sayfa Sayısı :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        txtPage.setNextFocusableComponent(comboTur);
        txtPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPageActionPerformed(evt);
            }
        });
        txtPage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPageKeyTyped(evt);
            }
        });
        jPanel1.add(txtPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 234, 37));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kitap Türü :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/updated.png"))); // NOI18N
        btnUpdate.setText("Güncelle");
        btnUpdate.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 102, 102)));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, 160, 56));

        comboTur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "        ", "Anı", "Araştırma-İnceleme", "Bilim", "Biyografi", "Çizgi Roman", "Deneme", "Edebiyat", "Eğitim", "Felsefe", "Gençlik", "Gezi", "Hikaye", "Hobi", "İnceleme", "İş Ekonomi - Hukuk", "Kişisel Gelişim", "Konuşmalar", "Masal", "Mektup", "Mizah", "Öykü", "Polisiye", "Psikoloji", "Resimli Öykü", "Roman", "Sağlık", "Sanat - Tasarım", "Sanat- Müzik", "Sinema Tarihi", "Söyleşi", "Şiir", "Tarih", "Yemek" }));
        comboTur.setNextFocusableComponent(btnAdd);
        jPanel1.add(comboTur, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 234, 37));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-user.png"))); // NOI18N
        btnAdd.setText("Ekle");
        btnAdd.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 102, 102)));
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 160, 56));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        btnDelete.setText("Sil");
        btnDelete.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 102, 102)));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 160, 56));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                      Kitap Adı", "                         Yazar ", "                   Sayfa Sayısı", "                            Tür"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEditingRow(0);
        jTable1.setRowHeight(40);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 770, 580));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kitap Adı :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 50, 130, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ara :");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String name = txtName.getText();
        String author = txtAuthor.getText();
        String page = txtPage.getText();
        String category = comboTur.getSelectedItem().toString();
        String id = "";
        
        try {
            int column = 0;
            int row = jTable1.getSelectedRow();
            String value = jTable1.getModel().getValueAt(row, column).toString();
            String value2 = jTable1.getModel().getValueAt(row, column+2).toString();

            pst = DbConnect.con.prepareStatement("select id from books where name=? and pages=?");
            pst.setString(1, value.toLowerCase());
            pst.setString(2, value2);

            rs = pst.executeQuery();
            while(rs.next()){
                id = rs.getString("id");
            }
        pst.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Book_Load();
        Temizle();
        
        if(name.isEmpty()|| author.isEmpty() || page.isEmpty() || comboTur.getSelectedIndex()==0)
            JOptionPane.showMessageDialog(this, "Lütfen bilgileri eksiksiz giriniz");
        else{try {
            pst = DbConnect.con.prepareStatement("update books set name = ?, author = ?, pages = ?, category = ? where id=?");
            pst.setString(1, name.toLowerCase());
            pst.setString(2, author.toLowerCase());
            pst.setString(3, page.toLowerCase());
            pst.setString(4, category.toLowerCase());
            pst.setString(5, id);
            
            int k = pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(this, "Kitap Güncellendi");
                Temizle();
            }
            pst.close();
            rs.close();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e);
            }
            Book_Load();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

  public static String capitalize(String str) {
    StringBuilder sb = new StringBuilder();
    String[] kelimeler = str.split(" ");
    
    for (int i = 0; i < kelimeler.length; i++) {
        String kelime = kelimeler[i];
        if (!kelime.isEmpty()) {
            char ilkHarf = Character.toUpperCase(kelime.charAt(0));
            String digerHarfler = kelime.substring(1);
            String yeniKelime = ilkHarf + digerHarfler;
            sb.append(yeniKelime);
        }
        
        if (i < kelimeler.length - 1) {
            sb.append(" ");
        }
    }
    
    return sb.toString();
}
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name = txtName.getText();
        String author = txtAuthor.getText();
        String page = txtPage.getText();
        String category = comboTur.getSelectedItem().toString();
        
        if(name.isEmpty()|| author.isEmpty() || page.isEmpty() || comboTur.getSelectedIndex()==0)
            JOptionPane.showMessageDialog(this, "Lütfen bilgileri eksiksiz giriniz");
        else{try {
            pst = DbConnect.con.prepareStatement("insert into books(name, author, pages, category) values (?,?,?,?)");
            pst.setString(1, kes(name.toLowerCase()));
            pst.setString(2, kes(author.toLowerCase()));
            pst.setString(3, kes(page.toLowerCase()));
            pst.setString(4, category.toLowerCase());
            
            int k = pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(this, "Kitap Eklendi");
                Temizle();
                Random r = new Random();
                String random = Integer.toString(r.nextInt(150,350));
                txtPage.setText(random);
            }
            pst.close();
            rs.close();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e);
            }
            Book_Load();
        }
            
    }//GEN-LAST:event_btnAddActionPerformed

    public String kes(String str){
        String[] kelimeler = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < kelimeler.length; i++) {
            sb.append(kelimeler[i]);
            if (i < kelimeler.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            int column = 0;
            int row = jTable1.getSelectedRow();
            String value = jTable1.getModel().getValueAt(row, column).toString();
            String value2 = jTable1.getModel().getValueAt(row, column+2).toString();

            pst = DbConnect.con.prepareStatement("select id from books where name=? and pages=?");
            pst.setString(1, value.toLowerCase());
            pst.setString(2, value2.toLowerCase());

            rs = pst.executeQuery();
            while(rs.next()){
                
                String id = rs.getString("id");

                PreparedStatement pst2 = DbConnect.con.prepareStatement("delete from books where id=?");
                pst2.setString(1, id);
                int a = pst2.executeUpdate();

                if(a==1)
                    JOptionPane.showMessageDialog(this, "Kitap Silindi");

            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Book_Load();
        Temizle();
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void Temizle(){
        txtName.setText("");
                txtAuthor.setText("");
                txtPage.setText("");
                comboTur.setSelectedIndex(-1);
                txtName.requestFocus();
    }
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            int column = source.columnAtPoint( evt.getPoint() );
            String name=source.getModel().getValueAt(row, column)+"";
            String author=source.getModel().getValueAt(row, column+1)+"";
            String page=source.getModel().getValueAt(row, column+2)+"";
            String category=source.getModel().getValueAt(row, column+3)+"";

            txtName.setText(name);
            txtAuthor.setText(author);
            txtPage.setText(page);
            comboTur.setSelectedItem(category);
    }//GEN-LAST:event_jTable1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       Main m = new Main(username);
        this.hide();
        m.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        int c;
        String deger = txtSearch.getText();

        try {
            pst = DbConnect.con.prepareStatement("select * from books where name like '%"+ deger +"%'");
            rs = pst.executeQuery();

            ResultSetMetaData rsd = rs.getMetaData();
            c=rsd.getColumnCount();

            DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);

            while(rs.next())
            {
                Vector v2 = new Vector();

                for (int i = 1; i<=c; i++) {
                    v2.add(capitalize(rs.getString("name")));
                    v2.add(capitalize(rs.getString("author")));
                    v2.add(capitalize(rs.getString("pages")));
                    v2.add(rs.getString("category"));

                }
                d.addRow(v2);
            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        jTable1.setDefaultEditor(Object.class, null);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jTable1.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        jTable1.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jTable1.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        jTable1.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPageActionPerformed

    private void txtPageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPageKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtPageKeyTyped

    public void Book_Load() {
        int c;
        
        try {
            pst = DbConnect.con.prepareStatement("select * from books");
            rs = pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            c=rsd.getColumnCount();
            
            DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                
                for (int i = 1; i<=c; i++) {
                    v2.add(capitalize(rs.getString("name")));
                    v2.add(capitalize(rs.getString("author")));
                    v2.add(rs.getString("pages"));
                    v2.add(capitalize(rs.getString("category")));
                }
                d.addRow(v2);
            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        jTable1.setDefaultEditor(Object.class, null);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jTable1.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        jTable1.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jTable1.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        jTable1.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
    }
    
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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboTur;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPage;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    
}
