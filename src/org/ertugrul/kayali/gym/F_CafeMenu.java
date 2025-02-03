package org.ertugrul.kayali.gym;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
    @Author ErtugrulKayali
    --TAMAMLANDI--
*/

public class F_CafeMenu extends javax.swing.JInternalFrame
{
    DefaultTableModel menuTablosu=new DefaultTableModel();
    Object[] kolonlar={"Ürün ID", "Ürün Adı", "Kategori", "Ürün Fiyatı"};
    Object[] satirlar=new Object[4];
    DefaultTableModel menuTablosuFilter=new DefaultTableModel();
    Object[] kolonlarFilter={"Ürün Adı", "Kategori", "Ürün Fiyatı"};
    Object[] satirlarFilter=new Object[3];
    
    public F_CafeMenu()
    {
        initComponents();
        this.setTitle("Cafe Menü Yönetim Sistemi");
        this.setSize(670, 466);
        C_CafeMenuSQL.cm_PGBaglan();
        String cmbIDListele="Select urunid FROM public.table_cafemenu";
        ResultSet cmbIDListeleRS=C_CafeMenuSQL.cm_listele(cmbIDListele);
        try
        {
            while(cmbIDListeleRS.next())
            {
                cmbID.addItem(String.valueOf(cmbIDListeleRS.getInt("urunid")));
            }
        }
        catch(SQLException ex)
        {}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCenter = new javax.swing.JPanel();
        spCafeMenu = new javax.swing.JScrollPane();
        tblCafeMenu = new javax.swing.JTable();
        pnlRight = new javax.swing.JPanel();
        btnListele = new javax.swing.JButton();
        btnEkle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        btnFiltrele = new javax.swing.JButton();
        btnTemizle = new javax.swing.JButton();
        lblIslem = new javax.swing.JLabel();
        pnlDown = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblUrunAdi = new javax.swing.JLabel();
        lblKategori = new javax.swing.JLabel();
        lblFiyat = new javax.swing.JLabel();
        txtUrunAdi = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<>();
        txtFiyat = new javax.swing.JTextField();
        cmbID = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);

        pnlCenter.setBackground(new java.awt.Color(153, 153, 255));
        pnlCenter.setLayout(new java.awt.BorderLayout());

        tblCafeMenu.setBackground(new java.awt.Color(0, 0, 0));
        tblCafeMenu.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        tblCafeMenu.setForeground(new java.awt.Color(255, 255, 255));
        spCafeMenu.setViewportView(tblCafeMenu);

        pnlCenter.add(spCafeMenu, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        pnlRight.setBackground(new java.awt.Color(0, 0, 0));
        pnlRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnListele.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnListele.setText("LİSTELE");
        btnListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListeleActionPerformed(evt);
            }
        });
        pnlRight.add(btnListele, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 100, 30));

        btnEkle.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnEkle.setText("EKLE");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });
        pnlRight.add(btnEkle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        btnSil.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnSil.setText("SİL");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });
        pnlRight.add(btnSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, 30));

        btnGuncelle.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnGuncelle.setText("GÜNCELLE");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });
        pnlRight.add(btnGuncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 100, 30));

        btnFiltrele.setFont(new java.awt.Font("Arial Black", 1, 8)); // NOI18N
        btnFiltrele.setText("FİLTRELE (ID)");
        btnFiltrele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltreleActionPerformed(evt);
            }
        });
        pnlRight.add(btnFiltrele, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 30));

        btnTemizle.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnTemizle.setText("TEMİZLE");
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });
        pnlRight.add(btnTemizle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 100, 30));

        lblIslem.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblIslem.setForeground(new java.awt.Color(255, 255, 255));
        lblIslem.setText("İŞLEM");
        pnlRight.add(lblIslem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 100, 30));

        getContentPane().add(pnlRight, java.awt.BorderLayout.LINE_END);

        pnlDown.setBackground(new java.awt.Color(102, 153, 255));
        pnlDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblID.setText("Ürün ID:");
        pnlDown.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        lblUrunAdi.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblUrunAdi.setText("Ürün Adı:");
        pnlDown.add(lblUrunAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        lblKategori.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblKategori.setText("Kategori:");
        pnlDown.add(lblKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        lblFiyat.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblFiyat.setText("Ürün Fiyatı:");
        pnlDown.add(lblFiyat, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        txtUrunAdi.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        pnlDown.add(txtUrunAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 120, -1));

        cmbKategori.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yiyecek", "İçecek", "Tatlı" }));
        pnlDown.add(cmbKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 120, -1));

        txtFiyat.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        txtFiyat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiyatKeyTyped(evt);
            }
        });
        pnlDown.add(txtFiyat, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 120, -1));

        cmbID.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        pnlDown.add(cmbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, -1));

        getContentPane().add(pnlDown, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListeleActionPerformed
        C_CafeMenuSQL.cm_PGBaglan();
        String cm_list="Select urunid, urunadi, kategori, urunfiyati FROM public.table_cafemenu";
        menuTablosu.setColumnCount(0);
        menuTablosu.setRowCount(0);
        menuTablosu.setColumnIdentifiers(kolonlar);
        ResultSet cm_listRS=C_CafeMenuSQL.cm_listele(cm_list);
        try
        {
            while(cm_listRS.next())
            {
                satirlar[0]=cm_listRS.getInt("urunid");
                satirlar[1]=cm_listRS.getString("urunadi");
                satirlar[2]=cm_listRS.getString("kategori");
                satirlar[3]=cm_listRS.getInt("urunfiyati");
                menuTablosu.addRow(satirlar);
            }
            tblCafeMenu.setModel(menuTablosu);
            lblIslem.setText("Listele");
        }
        catch(SQLException ex)
        {
            lblIslem.setText("Başarısız");
        }
    }//GEN-LAST:event_btnListeleActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        if(txtUrunAdi.getText().length()>0 && txtFiyat.getText().length()>0)
        {
            ResultSet ekleRS=C_CafeMenuSQL.cm_PGBaglan();
            ekleRS=C_CafeMenuSQL.cm_ekle(txtUrunAdi.getText(), String.valueOf(cmbKategori.getSelectedItem()), Integer.parseInt(txtFiyat.getText()));
            lblIslem.setText("Ekle");
        }
        else
        {
            lblIslem.setText("Başarısız");
        }
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        int messageSil=JOptionPane.showConfirmDialog(null, "Kayıt Silinecek?", "SİL", JOptionPane.YES_NO_OPTION);
        C_CafeMenuSQL.cm_PGBaglan();
        String cm_sil="Delete FROM public.table_cafemenu WHERE urunid='"+ String.valueOf(cmbID.getSelectedItem()) +"'";
        switch(messageSil)
        {
            case JOptionPane.YES_OPTION -> C_CafeMenuSQL.cm_sil(cm_sil);
            case JOptionPane.NO_OPTION -> JOptionPane.showMessageDialog(null, "Silme İşlemi İptal Edildi", "SİL", JOptionPane.INFORMATION_MESSAGE);
            default ->
            {}
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        if(txtUrunAdi.getText().length()>0 && txtFiyat.getText().length()>0)
        {
            C_CafeMenuSQL.cm_PGBaglan();
            String cm_guncelle="Update public.table_cafemenu SET urunadi='"+ txtUrunAdi.getText() +"', kategori='"+ String.valueOf(cmbKategori.getSelectedItem()) +"', urunfiyati='"+ Integer.parseInt(txtFiyat.getText()) +"' WHERE urunid='"+ String.valueOf(cmbID.getSelectedItem()) +"'";
            C_CafeMenuSQL.cm_guncelle(cm_guncelle);
            lblIslem.setText("Güncelle");
        }
        else
        {
            lblIslem.setText("Başarısız");
        }
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnFiltreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltreleActionPerformed
        C_CafeMenuSQL.cm_PGBaglan();
        String filter="Select urunadi, kategori, urunfiyati FROM public.table_cafemenu WHERE urunid='"+ String.valueOf(cmbID.getSelectedItem()) +"'";
        menuTablosuFilter.setColumnCount(0);
        menuTablosuFilter.setRowCount(0);
        menuTablosuFilter.setColumnIdentifiers(kolonlarFilter);
        ResultSet filterRS=C_CafeMenuSQL.cm_listele(filter);
        try
        {
            while(filterRS.next())
            {
                satirlarFilter[0]=filterRS.getString("urunadi");
                satirlarFilter[1]=filterRS.getString("kategori");
                satirlarFilter[2]=filterRS.getInt("urunfiyati");
                menuTablosuFilter.addRow(satirlarFilter);
                txtUrunAdi.setText(filterRS.getString("urunadi"));
                cmbKategori.setSelectedItem(filterRS.getString("kategori"));
                txtFiyat.setText(String.valueOf(filterRS.getInt("urunfiyati")));
            }
            tblCafeMenu.setModel(menuTablosuFilter);
            lblIslem.setText("Filtrele");
        }
        catch(SQLException ex)
        {
            lblIslem.setText("Başarısız");
        }
    }//GEN-LAST:event_btnFiltreleActionPerformed

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        cmbID.setSelectedItem(null);
        txtUrunAdi.setText(null);
        cmbKategori.setSelectedItem(null);
        txtFiyat.setText(null);
        lblIslem.setText("İŞLEM");
    }//GEN-LAST:event_btnTemizleActionPerformed

    private void txtFiyatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiyatKeyTyped
        char karakter=evt.getKeyChar();
        if(((karakter<'0') || (karakter>'9')) && (karakter!='\b'))
        {
            evt.consume();
        }
        if(txtFiyat.getText().length()<4)
        {}
        else if((txtFiyat.getText()+evt.getKeyChar()).length()>4)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtFiyatKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnFiltrele;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnListele;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JComboBox<String> cmbID;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel lblFiyat;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIslem;
    private javax.swing.JLabel lblKategori;
    private javax.swing.JLabel lblUrunAdi;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlDown;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JScrollPane spCafeMenu;
    private javax.swing.JTable tblCafeMenu;
    private javax.swing.JTextField txtFiyat;
    private javax.swing.JTextField txtUrunAdi;
    // End of variables declaration//GEN-END:variables
}