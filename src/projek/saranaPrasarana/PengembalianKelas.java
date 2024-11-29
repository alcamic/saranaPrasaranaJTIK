/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projek.saranaPrasarana;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;

/**
 *
 * @author AlCaMiC
 */
public class PengembalianKelas extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private DefaultTableModel model;
    public PengembalianKelas() {
        initComponents();
        scaleImage();
        scaleImage1();
        loadKelas();
        
    }
    public void loadKelas(){
        try {
        Connection c = KoneksiDatabase.getKoneksi();
        Statement s = c.createStatement();
        
        String sql = "SELECT nama_kelas from datakelas WHERE status = 'Terpakai';";
        ResultSet r = s.executeQuery(sql);
        while (r.next()){
            String datakelas = r.getString("nama_kelas");
            ComboKelas.addItem(datakelas);          
        }
        r.close();
        s.close();
        }catch(Exception e){
            
        }
    }
    
    private void scaleImage(){
        ImageIcon icon = new ImageIcon((getClass().getResource("logo1.png")));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(icon1.getWidth(), icon1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        icon1.setIcon(scaledIcon);

    }
    private void scaleImage1(){
        ImageIcon icon = new ImageIcon((getClass().getResource("logo3.png")));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(icon2.getWidth(), icon2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        icon2.setIcon(scaledIcon);

    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        beranda = new javax.swing.JButton();
        barang = new javax.swing.JButton();
        Kelas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        ComboKelas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        pinjamKelas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(58, 130, 255));

        icon1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sarana Prasarana JTIK");

        beranda.setBackground(new java.awt.Color(58, 130, 255));
        beranda.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        beranda.setForeground(new java.awt.Color(255, 255, 255));
        beranda.setText("Beranda");
        beranda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        beranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berandaActionPerformed(evt);
            }
        });

        barang.setBackground(new java.awt.Color(58, 130, 255));
        barang.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        barang.setForeground(new java.awt.Color(255, 255, 255));
        barang.setText("Barang");
        barang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barang.setMaximumSize(new java.awt.Dimension(63, 36));
        barang.setMinimumSize(new java.awt.Dimension(63, 36));
        barang.setPreferredSize(new java.awt.Dimension(63, 36));
        barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barangActionPerformed(evt);
            }
        });

        Kelas.setBackground(new java.awt.Color(58, 130, 255));
        Kelas.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        Kelas.setForeground(new java.awt.Color(255, 255, 255));
        Kelas.setText("Kelas");
        Kelas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KelasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 672, Short.MAX_VALUE)
                .addComponent(beranda, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barang, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beranda)
                    .addComponent(barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(58, 130, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pengembalian Kelas");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 48));

        icon2.setText("jLabel1");
        jPanel4.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 64));

        jPanel4.add(ComboKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 254, -1));

        jLabel3.setText("Pilih Kelas");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        pinjamKelas.setText("Submit");
        pinjamKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinjamKelasActionPerformed(evt);
            }
        });
        jPanel4.add(pinjamKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 520, 230));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(927, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 84, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void berandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berandaActionPerformed
        // TODO add your handling code here:
         new Beranda().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_berandaActionPerformed

    private void barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barangActionPerformed
        // TODO add your handling code here:
        new DaftarBarang().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_barangActionPerformed

    private void refreshComboBox() {
    ComboKelas.removeAllItems(); // Clear existing items
    loadKelas(); // Reload the available classes
}
    
    private void pinjamKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinjamKelasActionPerformed
        // TODO add your handling code here:
           // Retrieve data from input fields
    String nama_peminjam = "Kosong";
    String nama_kelas = ComboKelas.getSelectedItem().toString();
    String status = "Tidak Terpakai";
    int id_kelas = -1; // Default value to check if ID is retrieved

    try {
        Connection c = KoneksiDatabase.getKoneksi();

        // Step 1: Fetch the id_kelas for the selected nama_kelas
        String fetchIdQuery = "SELECT id_kelas FROM datakelas WHERE nama_kelas = ?;";
        PreparedStatement fetchIdStmt = c.prepareStatement(fetchIdQuery);
        fetchIdStmt.setString(1, nama_kelas);
        ResultSet rs = fetchIdStmt.executeQuery();

        if (rs.next()) {
            id_kelas = rs.getInt("id_kelas");
        } else {
            System.out.println("Error: Kelas tidak ditemukan.");
            return; // Exit the method if no matching class is found
        }

        rs.close();
        fetchIdStmt.close();

        // Step 2: Update the datakelas table with the new data
        String updateQuery = "UPDATE datakelas SET peminjam = ?, status = ? WHERE id_kelas = ?";
        PreparedStatement updateStmt = c.prepareStatement(updateQuery);
        updateStmt.setString(1, nama_peminjam);
        updateStmt.setString(2, status);
        updateStmt.setInt(3, id_kelas);
        updateStmt.executeUpdate();

        updateStmt.close();
        System.out.println("Kelas berhasil diupdate!");
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Terjadi Error");
    }finally{
        refreshComboBox();
        
    }
    }//GEN-LAST:event_pinjamKelasActionPerformed

    private void KelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KelasActionPerformed
        // TODO add your handling code here:
        new DaftarKelas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KelasActionPerformed

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
            java.util.logging.Logger.getLogger(PengembalianKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PengembalianKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PengembalianKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PengembalianKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PengembalianKelas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboKelas;
    private javax.swing.JButton Kelas;
    private javax.swing.JButton barang;
    private javax.swing.JButton beranda;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton pinjamKelas;
    // End of variables declaration//GEN-END:variables
}
