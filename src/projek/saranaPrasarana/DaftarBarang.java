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
public class DaftarBarang extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private DefaultTableModel model;
    public DaftarBarang() {
        initComponents();
        scaleImage();
        scaleImage1();
        scaleImage2();
        
        model = new DefaultTableModel();
        
        tabelBarang.setModel(model);
        model.addColumn("ID Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jumlah Total");
        model.addColumn("Jumlah yang Baik");
        model.addColumn("Jumlah yang kurang Baik");
        loadData();
        
    }
    
    private void scaleImage(){
        ImageIcon icon = new ImageIcon((getClass().getResource("logo1.png")));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(icon1.getWidth(), icon1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        icon1.setIcon(scaledIcon);

    }
    private void scaleImage1(){
        ImageIcon icon = new ImageIcon((getClass().getResource("logo2.png")));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(icon2.getWidth(), icon2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        icon2.setIcon(scaledIcon);

    }
    private void scaleImage2(){
        ImageIcon icon = new ImageIcon((getClass().getResource("logo2.png")));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(icon3.getWidth(), icon3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        icon3.setIcon(scaledIcon);

    }
    
    public void loadData(){
        model.getDataVector().removeAllElements();
        
        model.fireTableDataChanged();
        model.setRowCount(0);
        
        try{
            Connection c = KoneksiDatabase.getKoneksi();
            Statement s = c.createStatement();
            
            String sql = "SELECT * FROM databarang;";
            ResultSet r = s.executeQuery(sql);
            
            while (r.next()){
                Object[] o = new Object[5];
                o[0] = r.getString("id_barang");
                o[1] = r.getString("nama_barang");
                o[2] = r.getInt("jumlah_total");
                o[3] = r.getInt("jumlah_baik");
                o[4] = r.getInt("jumlah_kurang_baik");
                model.addRow(o);
            }
            r.close();
            s.close(); 
        }catch(SQLException e){
            System.out.println("Terjadi Error");
        }
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
        kelas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        icon2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pinjambarang = new javax.swing.JButton();
        kembalibarang = new javax.swing.JButton();
        riwayatbarang = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        icon3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputBarang = new javax.swing.JTextField();
        inputJmlKbaik = new javax.swing.JTextField();
        inputJmlBaik = new javax.swing.JTextField();
        inputJmlTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tambah = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

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

        kelas.setBackground(new java.awt.Color(58, 130, 255));
        kelas.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        kelas.setForeground(new java.awt.Color(255, 255, 255));
        kelas.setText("Kelas");
        kelas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelasActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(beranda, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(360, 360, 360))
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
                    .addComponent(kelas))
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(58, 130, 255));

        tabelBarang.setBackground(new java.awt.Color(255, 255, 255));
        tabelBarang.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        tabelBarang.setForeground(new java.awt.Color(0, 0, 0));
        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Barang", "Nama Barang", "Jumlah Total", "Jumlah yang Baik", "Jumlah yang Kurang Baik"
            }
        ));
        tabelBarang.setDropMode(javax.swing.DropMode.INSERT);
        tabelBarang.setGridColor(new java.awt.Color(0, 0, 0));
        tabelBarang.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabelBarang.setShowHorizontalLines(true);
        tabelBarang.setShowVerticalLines(true);
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        icon2.setText("jLabel1");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Daftar Barang");

        pinjambarang.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        pinjambarang.setText("Pinjam Barang");
        pinjambarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinjambarangActionPerformed(evt);
            }
        });

        kembalibarang.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        kembalibarang.setText("Kembalikan Barang");
        kembalibarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalibarangActionPerformed(evt);
            }
        });

        riwayatbarang.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        riwayatbarang.setText("Lihat Riwayat Peminjaman");
        riwayatbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riwayatbarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(pinjambarang)
                        .addGap(18, 18, 18)
                        .addComponent(kembalibarang)
                        .addGap(18, 18, 18)
                        .addComponent(riwayatbarang)))
                .addContainerGap(409, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(riwayatbarang)
                    .addComponent(kembalibarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pinjambarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jPanel4.setBackground(new java.awt.Color(58, 130, 255));

        icon3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Input Barang");

        inputJmlKbaik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJmlKbaikActionPerformed(evt);
            }
        });
        inputJmlKbaik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputJmlKbaikKeyReleased(evt);
            }
        });

        inputJmlBaik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputJmlBaikKeyReleased(evt);
            }
        });

        jLabel5.setText("Nama Barang");

        jLabel6.setText("Jumlah yang Kurang Baik");

        jLabel7.setText("Jumlah yang Baik");

        jLabel8.setText("Jumlah Total");

        tambah.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(inputBarang)
                        .addComponent(inputJmlKbaik)
                        .addComponent(inputJmlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addComponent(inputJmlBaik))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tambah)
                        .addGap(18, 18, 18)
                        .addComponent(edit)
                        .addGap(18, 18, 18)
                        .addComponent(hapus)))
                .addGap(31, 31, 31))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputJmlKbaik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputJmlBaik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputJmlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah)
                    .addComponent(edit)
                    .addComponent(hapus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputJmlKbaik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                previewJumlahTotal();
            }
        });
        inputJmlBaik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                previewJumlahTotal();
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previewJumlahTotal() {
    try {
        // Ambil nilai dari input
        String jml_baik = inputJmlBaik.getText();
        int jumlah_baik = jml_baik.isEmpty() ? 0 : Integer.parseInt(jml_baik);

        String jml_kbaik = inputJmlKbaik.getText();
        int jumlah_kbaik = jml_kbaik.isEmpty() ? 0 : Integer.parseInt(jml_kbaik);

        // Hitung jumlah_total
        int jumlah_total = jumlah_baik + jumlah_kbaik;

        // Tampilkan hasil ke inputJmlTotal
        inputJmlTotal.setText(String.valueOf(jumlah_total));
    } catch (NumberFormatException e) {
        // Jika input bukan angka, kosongkan jumlah_total
        inputJmlTotal.setText("");
    }
}
    
    private void berandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berandaActionPerformed
        // TODO add your handling code here:
        new Beranda().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_berandaActionPerformed

    private void kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasActionPerformed
        // TODO add your handling code here:
        new DaftarKelas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kelasActionPerformed

    private void inputJmlKbaikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJmlKbaikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputJmlKbaikActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        String nama_barang = inputBarang.getText();
        
        String jml_baik =  inputJmlBaik.getText();
        int jumlah_baik = Integer.parseInt(jml_baik); 
        
        String jml_kbaik = inputJmlKbaik.getText();
        int jumlah_kbaik = Integer.parseInt(jml_kbaik); 
        
        int jumlah_total = jumlah_baik + jumlah_kbaik;
        inputJmlTotal.setText(String.valueOf(jumlah_total));
        
        try{
            Connection c = KoneksiDatabase.getKoneksi();
            String sql = "INSERT INTO databarang (nama_barang,jumlah_total,jumlah_baik,jumlah_kurang_baik) VALUES (?,?,?,?);";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, nama_barang);
            p.setInt(2, jumlah_total);
            p.setInt(3, jumlah_baik);
            p.setInt(4, jumlah_kbaik);
            p.executeUpdate();
            p.close();
        }catch(SQLException e){
            System.out.println("Terjadi Error");
        }finally{
            loadData();
        }
    }//GEN-LAST:event_tambahActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        int i = tabelBarang.getSelectedRow();
        if (i == -1){
            return;
        }
        
        String id_barang = model.getValueAt(i, 0).toString();
        int idBarang = Integer.parseInt(id_barang);
        
        String nama_barang  = inputBarang.getText();
        
        String jml_total = inputJmlTotal.getText();
        int jumlah_total = Integer.parseInt(jml_total);
        
        String jml_baik = inputJmlBaik.getText();
        int jumlah_baik = Integer.parseInt(jml_baik);
        
        String jml_kbaik = inputJmlKbaik.getText();
        int jumlah_kbaik = Integer.parseInt(jml_kbaik);
        
        try{
            Connection c = KoneksiDatabase.getKoneksi();
            String sql = "UPDATE databarang SET nama_barang = ?, jumlah_total = ?, jumlah_baik = ?, jumlah_kurang_baik = ? WHERE id_barang = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, nama_barang);
            p.setInt(2,jumlah_total);
            p.setInt(3,jumlah_baik);
            p.setInt(4,jumlah_kbaik);
            p.setInt(5, idBarang);
            
            p.executeUpdate();
            p.close();
        }catch(SQLException e){
            System.out.println("Terjadi Error" + e.getMessage());
        }finally{
            loadData();
        }
        
        
    }//GEN-LAST:event_editActionPerformed

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        // TODO add your handling code here:
        int i = tabelBarang.getSelectedRow();
        if (i == -1){
            return;
        }
        
        String idBarangStr = model.getValueAt(i, 0).toString(); 
        int idBarang = Integer.parseInt(idBarangStr); 
        
        String nama_barang = model.getValueAt(i, 1).toString();
        inputBarang.setText(nama_barang);
        int jumlah_total = (int) model.getValueAt(i, 2);
        inputJmlTotal.setText(String.valueOf(jumlah_total));
        int jumlah_baik = (int) model.getValueAt(i, 3);
        inputJmlBaik.setText(String.valueOf(jumlah_baik));
        int jumlah_kbaik = (int) model.getValueAt(i, 4);
        inputJmlKbaik.setText(String.valueOf(jumlah_kbaik));
        
    }//GEN-LAST:event_tabelBarangMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        int i = tabelBarang.getSelectedRow();
        if (i == -1){
            return;
        }
        
        String idBarangStr = model.getValueAt(i, 0).toString();
        int idBarang = Integer.parseInt(idBarangStr); 
        try{
            Connection c = KoneksiDatabase.getKoneksi();
            String sql = "DELETE FROM databarang WHERE id_barang = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setInt(1, idBarang);
            p.executeUpdate();
            p.close();
        }catch(SQLException e){
            System.out.println("Terjadi Error");
        }finally{
            loadData();
        }
        
    }//GEN-LAST:event_hapusActionPerformed

    private void inputJmlKbaikKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputJmlKbaikKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_inputJmlKbaikKeyReleased

    private void inputJmlBaikKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputJmlBaikKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_inputJmlBaikKeyReleased

    private void riwayatbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayatbarangActionPerformed
        // TODO add your handling code here:
        new DaftarPeminjamanBarang().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_riwayatbarangActionPerformed

    private void kembalibarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalibarangActionPerformed
        // TODO add your handling code here:
        new PengembalianBarang().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kembalibarangActionPerformed

    private void pinjambarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinjambarangActionPerformed
        // TODO add your handling code here:
        new PeminjamanBarang().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pinjambarangActionPerformed

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
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beranda;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JTextField inputBarang;
    private javax.swing.JTextField inputJmlBaik;
    private javax.swing.JTextField inputJmlKbaik;
    private javax.swing.JTextField inputJmlTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kelas;
    private javax.swing.JButton kembalibarang;
    private javax.swing.JButton pinjambarang;
    private javax.swing.JButton riwayatbarang;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables
}
