package org.ertugrul.kayali.gym;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
    @Author ErtugrulKayali
    --TAMAMLANDI--
*/

public class F_SalonMalzemeleri extends javax.swing.JInternalFrame
{
    DefaultTableModel smTablosu=new DefaultTableModel();
    Object[] kolonlar={"ID", "ADI", "ADET", "BRANŞ", "İŞLEM YAPAN", "İŞLEM TÜRÜ"};
    Object[] satirlar=new Object[6];
    DefaultTableModel smTablosuFilter=new DefaultTableModel();
    Object[] kolonlarFilter={"ADI", "ADET", "BRANŞ", "İŞLEM YAPAN", "İŞLEM TÜRÜ"};
    Object[] satirlarFilter=new Object[5];
    int adet=0;
    public F_SalonMalzemeleri()
    {
        initComponents();
        this.setTitle("Salon Malzemeleri Yönetim Sistemi");
        this.setSize(810, 415);
        C_SalonMalzemeleriSQL.sm_PGBaglan();
        String cmbIDListele="Select smid FROM public.table_sm";
        ResultSet cmbIDListeleRS=C_SalonMalzemeleriSQL.sm_listele(cmbIDListele);
        try
        {
            while(cmbIDListeleRS.next())
            {
                cbID.addItem(String.valueOf(cmbIDListeleRS.getInt("smid")));
            }
        }
        catch(SQLException ex)
        {}
        C_BranslarSQL.b_PGBaglan();
        String cmbBransListele="Select bransadi FROM public.table_branslar";
        ResultSet cmbBransListeleRS=C_BranslarSQL.b_listele(cmbBransListele);
        try
        {
            while(cmbBransListeleRS.next())
            {
                cbKullanilanBrans.addItem(String.valueOf(cmbBransListeleRS.getString("bransadi")));
            }
        }
        catch(SQLException ex)
        {}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCenter = new javax.swing.JPanel();
        spSalonMalzemeleri = new javax.swing.JScrollPane();
        tblSalonMalzemeleri = new javax.swing.JTable();
        pnlDown = new javax.swing.JPanel();
        cbID = new javax.swing.JComboBox<>();
        lblID = new javax.swing.JLabel();
        lblAdi = new javax.swing.JLabel();
        txtAdi = new javax.swing.JTextField();
        lblAdet = new javax.swing.JLabel();
        txtAdet = new javax.swing.JTextField();
        btnArti = new javax.swing.JButton();
        btnEksi = new javax.swing.JButton();
        cbKullanilanBrans = new javax.swing.JComboBox<>();
        lblKullanilanBrans = new javax.swing.JLabel();
        lblIslemDurumu = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();
        btnSil = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        btnTemizle = new javax.swing.JButton();
        btnEkle = new javax.swing.JButton();
        btnListele = new javax.swing.JButton();
        btnFiltrele = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        pnlCenter.setBackground(new java.awt.Color(153, 153, 153));
        pnlCenter.setLayout(new java.awt.BorderLayout());

        spSalonMalzemeleri.setBackground(new java.awt.Color(153, 153, 153));
        spSalonMalzemeleri.setForeground(new java.awt.Color(153, 153, 153));

        tblSalonMalzemeleri.setBackground(new java.awt.Color(0, 0, 0));
        tblSalonMalzemeleri.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        tblSalonMalzemeleri.setForeground(new java.awt.Color(255, 255, 255));
        spSalonMalzemeleri.setViewportView(tblSalonMalzemeleri);

        pnlCenter.add(spSalonMalzemeleri, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        pnlDown.setBackground(new java.awt.Color(102, 153, 255));
        pnlDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbID.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        pnlDown.add(cbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, -1));

        lblID.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblID.setText("ID:");
        pnlDown.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        lblAdi.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblAdi.setText("Malzeme Adı:");
        pnlDown.add(lblAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        txtAdi.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        pnlDown.add(txtAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 130, -1));

        lblAdet.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblAdet.setText("Malzeme Adeti:");
        pnlDown.add(lblAdet, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        txtAdet.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        txtAdet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAdetKeyTyped(evt);
            }
        });
        pnlDown.add(txtAdet, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 110, -1));

        btnArti.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnArti.setText("+");
        btnArti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArtiActionPerformed(evt);
            }
        });
        pnlDown.add(btnArti, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 40, -1));

        btnEksi.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnEksi.setText("-");
        btnEksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEksiActionPerformed(evt);
            }
        });
        pnlDown.add(btnEksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 40, -1));

        cbKullanilanBrans.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        pnlDown.add(cbKullanilanBrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 130, -1));

        lblKullanilanBrans.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblKullanilanBrans.setText("Kullanılan Branş:");
        pnlDown.add(lblKullanilanBrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        lblIslemDurumu.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblIslemDurumu.setText("İŞLEM");
        pnlDown.add(lblIslemDurumu, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 100, 20));

        getContentPane().add(pnlDown, java.awt.BorderLayout.PAGE_END);

        pnlRight.setBackground(new java.awt.Color(0, 0, 0));
        pnlRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnTemizle.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnTemizle.setText("TEMİZLE");
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });
        pnlRight.add(btnTemizle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 100, 30));

        btnEkle.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnEkle.setText("EKLE");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });
        pnlRight.add(btnEkle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        btnListele.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnListele.setText("LİSTELE");
        btnListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListeleActionPerformed(evt);
            }
        });
        pnlRight.add(btnListele, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 100, 30));

        btnFiltrele.setFont(new java.awt.Font("Arial Black", 1, 8)); // NOI18N
        btnFiltrele.setText("FİLTRELE (ID)");
        btnFiltrele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltreleActionPerformed(evt);
            }
        });
        pnlRight.add(btnFiltrele, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 30));

        getContentPane().add(pnlRight, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListeleActionPerformed
        C_SalonMalzemeleriSQL.sm_PGBaglan();
        String sm_list="Select smid, smadi, smadet, kullanilanbrans, islemyapan, islemturu FROM public.table_sm";
        smTablosu.setColumnCount(0);
        smTablosu.setRowCount(0);
        smTablosu.setColumnIdentifiers(kolonlar);
        ResultSet sm_listRS=C_SalonMalzemeleriSQL.sm_listele(sm_list);
        try
        {
            while(sm_listRS.next())
            {
                satirlar[0]=sm_listRS.getInt("smid");
                satirlar[1]=sm_listRS.getString("smadi");
                satirlar[2]=sm_listRS.getInt("smadet");
                satirlar[3]=sm_listRS.getString("kullanilanbrans");
                satirlar[4]=sm_listRS.getString("islemyapan");
                satirlar[5]=sm_listRS.getString("islemturu");
                smTablosu.addRow(satirlar);
            }
            tblSalonMalzemeleri.setModel(smTablosu);
            lblIslemDurumu.setText("Listele");
        }
        catch(SQLException ex)
        {
            lblIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnListeleActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        if(txtAdi.getText().length()>0 && txtAdet.getText().length()>0)
        {
            ResultSet sm_ekleRS=C_SalonMalzemeleriSQL.sm_PGBaglan();
            sm_ekleRS=C_SalonMalzemeleriSQL.sm_ekle(txtAdi.getText(), Integer.parseInt(txtAdet.getText()), String.valueOf(cbKullanilanBrans.getSelectedItem()), F_KullaniciGirisKayit.kullaniciAdi, "Ekle");
            lblIslemDurumu.setText("Ekle");
        }
        else
        {
            lblIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        int messageSil=JOptionPane.showConfirmDialog(null, "Kayıt Silinecek?", "SİL", JOptionPane.YES_NO_OPTION);
        C_SalonMalzemeleriSQL.sm_PGBaglan();
        String sm_sil="Delete FROM public.table_sm WHERE smid='"+ cbID.getSelectedItem() +"'";
        switch(messageSil)
        {
            case JOptionPane.YES_OPTION -> C_SalonMalzemeleriSQL.sm_sil(sm_sil);
            case JOptionPane.NO_OPTION -> JOptionPane.showMessageDialog(null, "Silme İşlemi İptal Edildi", "SİL", JOptionPane.INFORMATION_MESSAGE);
            default ->
            {}
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        if(txtAdi.getText().length()>0 && txtAdet.getText().length()>0)
        {
            C_SalonMalzemeleriSQL.sm_PGBaglan();
            String sm_guncelle="Update public.table_sm SET smadi='"+ txtAdi.getText() +"', smadet='"+ txtAdet.getText() +"', kullanilanbrans='"+ String.valueOf(cbKullanilanBrans.getSelectedItem()) +"', islemturu='"+ "Güncelle" + "' WHERE smid='"+ String.valueOf(cbID.getSelectedItem()) +"'";
            C_SalonMalzemeleriSQL.sm_guncelle(sm_guncelle);
            lblIslemDurumu.setText("Güncelle");
        }
        else
        {
            lblIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnFiltreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltreleActionPerformed
        C_SalonMalzemeleriSQL.sm_PGBaglan();
        String filter="Select smadi, smadet, kullanilanbrans, islemyapan, islemturu FROM public.table_sm WHERE smid='"+ String.valueOf(cbID.getSelectedItem()) +"'";
        smTablosuFilter.setColumnCount(0);
        smTablosuFilter.setRowCount(0);
        smTablosuFilter.setColumnIdentifiers(kolonlarFilter);
        ResultSet filterRS=C_SalonMalzemeleriSQL.sm_listele(filter);
        try
        {
            while(filterRS.next())
            {
                satirlarFilter[0]=filterRS.getString("smadi");
                satirlarFilter[1]=filterRS.getInt("smadet");
                satirlarFilter[2]=filterRS.getString("kullanilanbrans");
                satirlarFilter[3]=filterRS.getString("islemyapan");
                satirlarFilter[4]=filterRS.getString("islemturu");
                smTablosuFilter.addRow(satirlarFilter);
                txtAdi.setText(filterRS.getString("smadi"));
                txtAdet.setText(String.valueOf(filterRS.getInt("smadet")));
                cbKullanilanBrans.setSelectedItem(filterRS.getString("kullanilanbrans"));
            }
            tblSalonMalzemeleri.setModel(smTablosuFilter);
            lblIslemDurumu.setText("Filtrele");
        }
        catch(SQLException ex)
        {
            lblIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnFiltreleActionPerformed

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        cbID.setSelectedItem(null);
        txtAdi.setText(null);
        txtAdet.setText(null);
        cbKullanilanBrans.setSelectedItem(null);
        lblIslemDurumu.setText("İŞLEM");
    }//GEN-LAST:event_btnTemizleActionPerformed

    private void btnEksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEksiActionPerformed
        if(adet>0)
        {
            adet--;
            txtAdet.setText(String.valueOf(adet));
        }
    }//GEN-LAST:event_btnEksiActionPerformed

    private void btnArtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArtiActionPerformed
        adet++;
        txtAdet.setText(String.valueOf(adet));
    }//GEN-LAST:event_btnArtiActionPerformed

    private void txtAdetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdetKeyTyped
        char karakter=evt.getKeyChar();
        if(((karakter<'0') || (karakter>'9'))&&(karakter!='\b'))
        {
            evt.consume();
        }
        if(txtAdet.getText().length()<4)
        {}
        else if((txtAdet.getText()+evt.getKeyChar()).length()>4)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtAdetKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArti;
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnEksi;
    private javax.swing.JButton btnFiltrele;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnListele;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JComboBox<String> cbID;
    private javax.swing.JComboBox<String> cbKullanilanBrans;
    private javax.swing.JLabel lblAdet;
    private javax.swing.JLabel lblAdi;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIslemDurumu;
    private javax.swing.JLabel lblKullanilanBrans;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlDown;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JScrollPane spSalonMalzemeleri;
    private javax.swing.JTable tblSalonMalzemeleri;
    private javax.swing.JTextField txtAdet;
    private javax.swing.JTextField txtAdi;
    // End of variables declaration//GEN-END:variables
}