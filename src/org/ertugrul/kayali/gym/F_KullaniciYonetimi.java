package org.ertugrul.kayali.gym;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
    @Author ErtugrulKayali
    --TAMAMLANDI--
*/

public class F_KullaniciYonetimi extends javax.swing.JInternalFrame
{
    DefaultTableModel kullaniciTablosu=new DefaultTableModel();
    Object[] kolonlar={"ID", "Kullanıcı Adı", "Kullanıcı Şifresi", "Ad", "Soyad", "T.C. Kimlik No", "Telefon No", "e-Mail", "Sistem Rolü", "Kayıt Tarihi", "Onay Durumu", "Onaylayan"};
    Object[] satirlar=new Object[12];
    DefaultTableModel kullaniciTablosuFilter=new DefaultTableModel();
    Object[] kolonlarFilter={"Kullanıcı Adı", "Kullanıcı Şifresi", "Ad", "Soyad", "T.C. Kimlik No", "Telefon No", "e-Mail", "Sistem Rolü", "Kayıt Tarihi", "Onay Durumu", "Onaylayan"};
    Object[] satirlarFilter=new Object[11];
    String emailValidate;

    public F_KullaniciYonetimi()
    {
        initComponents();
        this.setTitle("Kullanıcı Yönetim Sistemi");
        this.setSize(700, 520);
        C_KullanicilarSQL.k_PGBaglan();
        String cmbIDListele="Select kullaniciid FROM public.table_kullanicilar";
        ResultSet cmbIDListeleRS=C_KullanicilarSQL.k_listele(cmbIDListele);
        try
        {
            while(cmbIDListeleRS.next())
            {
                cbID.addItem(String.valueOf(cmbIDListeleRS.getInt("kullaniciid")));
            }
        }
        catch(SQLException ex)
        {}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlKullaniciYonetimi = new javax.swing.JPanel();
        spTablo = new javax.swing.JScrollPane();
        tblKullaniciKayit = new javax.swing.JTable();
        lblID = new javax.swing.JLabel();
        lblKullaniciAdi = new javax.swing.JLabel();
        lblKullaniciSifresi = new javax.swing.JLabel();
        lblAd = new javax.swing.JLabel();
        lblSoyad = new javax.swing.JLabel();
        lblTcKimlikNo = new javax.swing.JLabel();
        lblTelefonNumarasi = new javax.swing.JLabel();
        lblEmailAdresi = new javax.swing.JLabel();
        lblSistemRolu = new javax.swing.JLabel();
        lblKayitTarihi = new javax.swing.JLabel();
        lblOnayDurumu = new javax.swing.JLabel();
        cbID = new javax.swing.JComboBox<>();
        txtKullaniciAdi = new javax.swing.JTextField();
        txtAd = new javax.swing.JTextField();
        txtKullaniciSifresi = new javax.swing.JPasswordField();
        txtSoyad = new javax.swing.JTextField();
        txtTcKimlikNo = new javax.swing.JTextField();
        txtTelefonNumarasi = new javax.swing.JTextField();
        txtEmailAdresi = new javax.swing.JTextField();
        cbSistemRolu = new javax.swing.JComboBox<>();
        txtKayitTarihi = new javax.swing.JTextField();
        cbOnayDurumu = new javax.swing.JComboBox<>();
        btnListele = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        btnFiltrele = new javax.swing.JButton();
        rbSifreGoster = new javax.swing.JRadioButton();
        btnTemizle = new javax.swing.JButton();
        lblIslemDurumu = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Kullanıcı İşlemleri");

        pnlKullaniciYonetimi.setBackground(new java.awt.Color(102, 153, 255));
        pnlKullaniciYonetimi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spTablo.setForeground(new java.awt.Color(245, 245, 245));

        tblKullaniciKayit.setBackground(new java.awt.Color(0, 0, 0));
        tblKullaniciKayit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblKullaniciKayit.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        tblKullaniciKayit.setForeground(new java.awt.Color(255, 255, 255));
        spTablo.setViewportView(tblKullaniciKayit);

        pnlKullaniciYonetimi.add(spTablo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 210));

        lblID.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblID.setText("(S/G/F) ID:");
        pnlKullaniciYonetimi.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        lblKullaniciAdi.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblKullaniciAdi.setText("Kullanıcı Adı:");
        pnlKullaniciYonetimi.add(lblKullaniciAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        lblKullaniciSifresi.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblKullaniciSifresi.setText("Kullanıcı Şifresi:");
        pnlKullaniciYonetimi.add(lblKullaniciSifresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        lblAd.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblAd.setText("Ad:");
        pnlKullaniciYonetimi.add(lblAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        lblSoyad.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblSoyad.setText("Soyad:");
        pnlKullaniciYonetimi.add(lblSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        lblTcKimlikNo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTcKimlikNo.setText("T.C. Kimlik Numarası:");
        pnlKullaniciYonetimi.add(lblTcKimlikNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        lblTelefonNumarasi.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTelefonNumarasi.setText("Telefon Numarası:");
        pnlKullaniciYonetimi.add(lblTelefonNumarasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        lblEmailAdresi.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblEmailAdresi.setText("e-Mail Adresi:");
        pnlKullaniciYonetimi.add(lblEmailAdresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        lblSistemRolu.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblSistemRolu.setText("Sistem Rolü:");
        pnlKullaniciYonetimi.add(lblSistemRolu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        lblKayitTarihi.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblKayitTarihi.setText("Kayıt Tarihi (YYYY-AA-GG):");
        pnlKullaniciYonetimi.add(lblKayitTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        lblOnayDurumu.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblOnayDurumu.setText("Onay Durumu:");
        pnlKullaniciYonetimi.add(lblOnayDurumu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        cbID.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        pnlKullaniciYonetimi.add(cbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 140, -1));

        txtKullaniciAdi.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        pnlKullaniciYonetimi.add(txtKullaniciAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 140, -1));

        txtAd.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        pnlKullaniciYonetimi.add(txtAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 140, -1));

        txtKullaniciSifresi.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        pnlKullaniciYonetimi.add(txtKullaniciSifresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 140, -1));

        txtSoyad.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        pnlKullaniciYonetimi.add(txtSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 140, -1));

        txtTcKimlikNo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtTcKimlikNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTcKimlikNoFocusLost(evt);
            }
        });
        txtTcKimlikNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTcKimlikNoKeyTyped(evt);
            }
        });
        pnlKullaniciYonetimi.add(txtTcKimlikNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 140, -1));

        txtTelefonNumarasi.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtTelefonNumarasi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonNumarasiKeyTyped(evt);
            }
        });
        pnlKullaniciYonetimi.add(txtTelefonNumarasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 140, -1));

        txtEmailAdresi.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        pnlKullaniciYonetimi.add(txtEmailAdresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 140, -1));

        cbSistemRolu.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cbSistemRolu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yonetici", "Muhasebe", "InsanKaynaklari", "SalonPersoneli", "CafePersoneli" }));
        pnlKullaniciYonetimi.add(cbSistemRolu, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 140, -1));

        txtKayitTarihi.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        pnlKullaniciYonetimi.add(txtKayitTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 140, -1));

        cbOnayDurumu.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cbOnayDurumu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Onaylandı", "Beklemede", "İptal Edildi" }));
        pnlKullaniciYonetimi.add(cbOnayDurumu, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 140, -1));

        btnListele.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnListele.setText("LİSTELE");
        btnListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListeleActionPerformed(evt);
            }
        });
        pnlKullaniciYonetimi.add(btnListele, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 110, 30));

        btnSil.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnSil.setText("SİL");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });
        pnlKullaniciYonetimi.add(btnSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 110, 30));

        btnGuncelle.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnGuncelle.setText("GÜNCELLE");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });
        pnlKullaniciYonetimi.add(btnGuncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 110, 30));

        btnFiltrele.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnFiltrele.setText("FİLTRELE (ID)");
        btnFiltrele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltreleActionPerformed(evt);
            }
        });
        pnlKullaniciYonetimi.add(btnFiltrele, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 110, 30));

        rbSifreGoster.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rbSifreGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSifreGosterActionPerformed(evt);
            }
        });
        pnlKullaniciYonetimi.add(rbSifreGoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        btnTemizle.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnTemizle.setText("TEMİZLE");
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });
        pnlKullaniciYonetimi.add(btnTemizle, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 110, 30));

        lblIslemDurumu.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblIslemDurumu.setText("İşlem Durumu");
        pnlKullaniciYonetimi.add(lblIslemDurumu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 90, 30));

        getContentPane().add(pnlKullaniciYonetimi, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListeleActionPerformed
        C_KullanicilarSQL.k_PGBaglan();
        String k_list="Select kullaniciid, kullaniciadi, kullanicisifresi, ad, soyad, tckimlikno, telefonnumarasi, emailadresi, sistemrolu, kayittarihi, onaydurumu, onaylayan FROM public.table_kullanicilar ORDER BY kullaniciid";
        kullaniciTablosu.setColumnCount(0);
        kullaniciTablosu.setRowCount(0);
        kullaniciTablosu.setColumnIdentifiers(kolonlar);
        ResultSet k_listRS=C_KullanicilarSQL.k_listele(k_list);
        try
        {
            while(k_listRS.next())
            {
                satirlar[0]=k_listRS.getInt("kullaniciid");
                satirlar[1]=k_listRS.getString("kullaniciadi");
                satirlar[2]=k_listRS.getString("kullanicisifresi");
                satirlar[3]=k_listRS.getString("ad");
                satirlar[4]=k_listRS.getString("soyad");
                satirlar[5]=k_listRS.getString("tckimlikno");
                satirlar[6]=k_listRS.getString("telefonnumarasi");
                satirlar[7]=k_listRS.getString("emailadresi");
                satirlar[8]=k_listRS.getString("sistemrolu");
                satirlar[9]=k_listRS.getDate("kayittarihi");
                satirlar[10]=k_listRS.getString("onaydurumu");
                satirlar[11]=k_listRS.getString("onaylayan");
                kullaniciTablosu.addRow(satirlar);
            }
            tblKullaniciKayit.setModel(kullaniciTablosu);
            lblIslemDurumu.setText("Listele");
        }
        catch(SQLException ex)
        {
            lblIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnListeleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        int messageSil=JOptionPane.showConfirmDialog(null, "Kayıt Silinecek?", "SİL", JOptionPane.YES_NO_OPTION);
        C_KullanicilarSQL.k_PGBaglan();
        String k_sil="Delete FROM public.table_kullanicilar WHERE kullaniciid='"+ cbID.getSelectedItem() +"'";
        switch(messageSil)
        { 
            case JOptionPane.YES_OPTION -> C_KullanicilarSQL.k_sil(k_sil);
            case JOptionPane.NO_OPTION -> JOptionPane.showMessageDialog(null, "Silme İşlemi İptal Edildi", "SİL", JOptionPane.INFORMATION_MESSAGE);
            default -> 
            {}
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        emailValidate=txtEmailAdresi.getText();
        if(txtEmailAdresi.getText().length()>0 && "Uyumlu".equals(lblIslemDurumu.getText()) && "Uyumlu".equals(lblIslemDurumu.getText()) && txtKullaniciAdi.getText().length()>0 && txtKullaniciSifresi.getText().length()>0 && txtAd.getText().length()>0 && txtSoyad.getText().length()>0 && emailValidate.contains("@") && emailValidate.contains(".com") || emailValidate.contains(".tr") && txtKayitTarihi.getText().length()>0)
        {
            C_KullanicilarSQL.k_PGBaglan();
            String k_guncelle="Update public.table_kullanicilar SET kullaniciadi='" + txtKullaniciAdi.getText() + "', kullanicisifresi='"+ String.valueOf(txtKullaniciSifresi.getText()) + "', ad='"+ txtAd.getText() +"', soyad='"+ txtSoyad.getText() +"', tckimlikno='"+ txtTcKimlikNo.getText() +"', telefonnumarasi='"+ txtTelefonNumarasi.getText() +"', emailadresi='" + txtEmailAdresi.getText() +"', sistemrolu='"+ String.valueOf(cbSistemRolu.getSelectedItem()) +"', kayittarihi='"+ Date.valueOf(txtKayitTarihi.getText()) +"', onaydurumu='"+ String.valueOf(cbOnayDurumu.getSelectedItem()) +"', onaylayan='"+ F_KullaniciGirisKayit.kullaniciAdi +"' WHERE kullaniciid='"+ String.valueOf(cbID.getSelectedItem()) +"'";
            C_KullanicilarSQL.k_guncelle(k_guncelle);
            lblIslemDurumu.setText("Güncelle");
        }
        else
        {
            lblIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnFiltreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltreleActionPerformed
        C_KullanicilarSQL.k_PGBaglan();
        String filter="Select kullaniciadi, kullanicisifresi, ad, soyad, tckimlikno, telefonnumarasi, emailadresi, sistemrolu, kayittarihi, onaydurumu, onaylayan FROM public.table_kullanicilar WHERE kullaniciid='"+ String.valueOf(cbID.getSelectedItem()) + "'";
        kullaniciTablosuFilter.setColumnCount(0);
        kullaniciTablosuFilter.setRowCount(0);
        kullaniciTablosuFilter.setColumnIdentifiers(kolonlarFilter);
        ResultSet filterRS=C_KullanicilarSQL.k_listele(filter);
        try
        {
            while(filterRS.next())
            {
                satirlarFilter[0]=filterRS.getString("kullaniciadi");
                satirlarFilter[1]=filterRS.getString("kullanicisifresi");
                satirlarFilter[2]=filterRS.getString("ad");
                satirlarFilter[3]=filterRS.getString("soyad");
                satirlarFilter[4]=filterRS.getString("tckimlikno");
                satirlarFilter[5]=filterRS.getString("telefonnumarasi");
                satirlarFilter[6]=filterRS.getString("emailadresi");
                satirlarFilter[7]=filterRS.getString("sistemrolu");
                satirlarFilter[8]=filterRS.getDate("kayittarihi");
                satirlarFilter[9]=filterRS.getString("onaydurumu");
                satirlarFilter[10]=filterRS.getString("onaylayan");
                kullaniciTablosuFilter.addRow(satirlarFilter);
                txtKullaniciAdi.setText(filterRS.getString("kullaniciadi"));
                txtKullaniciSifresi.setText(filterRS.getString("kullanicisifresi"));
                txtAd.setText(filterRS.getString("ad"));
                txtSoyad.setText(filterRS.getString("soyad"));
                txtTcKimlikNo.setText(filterRS.getString("tckimlikno"));
                txtTelefonNumarasi.setText(filterRS.getString("telefonnumarasi"));
                txtEmailAdresi.setText(filterRS.getString("emailadresi"));
                cbSistemRolu.setSelectedItem(filterRS.getString("sistemrolu"));
                txtKayitTarihi.setText(String.valueOf(filterRS.getDate("kayittarihi")));
                cbOnayDurumu.setSelectedItem(filterRS.getString("onaydurumu"));
            }
            tblKullaniciKayit.setModel(kullaniciTablosuFilter);
            lblIslemDurumu.setText("Filtrele");
        }
        catch(SQLException ex)
        {
            lblIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnFiltreleActionPerformed

    private void rbSifreGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSifreGosterActionPerformed
        if(rbSifreGoster.isSelected())
        {
            txtKullaniciSifresi.setEchoChar((char) 0);
        }
        else
        {
            txtKullaniciSifresi.setEchoChar('*');
        }
    }//GEN-LAST:event_rbSifreGosterActionPerformed

    private void txtTcKimlikNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTcKimlikNoFocusLost
    
    }//GEN-LAST:event_txtTcKimlikNoFocusLost

    private void txtTcKimlikNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTcKimlikNoKeyTyped
        char karakter=evt.getKeyChar();
        if(((karakter<'0') || (karakter>'9')) && (karakter!='\b'))
        {
            evt.consume();
        }
        if(txtTcKimlikNo.getText().length()<11)
        {
            lblIslemDurumu.setText("11 Hane");
        }
        else if((txtTcKimlikNo.getText()+evt.getKeyChar()).length()>11)
        {
            evt.consume();
            lblIslemDurumu.setText("Uyumlu");
        }
    }//GEN-LAST:event_txtTcKimlikNoKeyTyped

    private void txtTelefonNumarasiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonNumarasiKeyTyped
        char karakter=evt.getKeyChar();
        if(((karakter<'0') || (karakter>'9')) && (karakter!='\b'))
        {
            evt.consume();
        }
        if(txtTelefonNumarasi.getText().length()<11)
        {
            lblIslemDurumu.setText("11 Hane");
        }
        else if((txtTelefonNumarasi.getText()+evt.getKeyChar()).length()>11)
        {
            evt.consume();
            lblIslemDurumu.setText("Uyumlu");
        }
    }//GEN-LAST:event_txtTelefonNumarasiKeyTyped

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        cbID.setSelectedItem(null);
        txtKullaniciAdi.setText(null);
        txtKullaniciSifresi.setText(null);
        txtAd.setText(null);
        txtSoyad.setText(null);
        txtTcKimlikNo.setText(null);
        txtTelefonNumarasi.setText(null);
        txtEmailAdresi.setText(null);
        cbSistemRolu.setSelectedItem(null);
        txtKayitTarihi.setText(null);
        cbOnayDurumu.setSelectedItem(null);
        lblIslemDurumu.setText("İşlem Durumu");
    }//GEN-LAST:event_btnTemizleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrele;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnListele;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JComboBox<String> cbID;
    private javax.swing.JComboBox<String> cbOnayDurumu;
    private javax.swing.JComboBox<String> cbSistemRolu;
    private javax.swing.JLabel lblAd;
    private javax.swing.JLabel lblEmailAdresi;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIslemDurumu;
    private javax.swing.JLabel lblKayitTarihi;
    private javax.swing.JLabel lblKullaniciAdi;
    private javax.swing.JLabel lblKullaniciSifresi;
    private javax.swing.JLabel lblOnayDurumu;
    private javax.swing.JLabel lblSistemRolu;
    private javax.swing.JLabel lblSoyad;
    private javax.swing.JLabel lblTcKimlikNo;
    private javax.swing.JLabel lblTelefonNumarasi;
    private javax.swing.JPanel pnlKullaniciYonetimi;
    private javax.swing.JRadioButton rbSifreGoster;
    private javax.swing.JScrollPane spTablo;
    private javax.swing.JTable tblKullaniciKayit;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtEmailAdresi;
    private javax.swing.JTextField txtKayitTarihi;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JPasswordField txtKullaniciSifresi;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtTcKimlikNo;
    private javax.swing.JTextField txtTelefonNumarasi;
    // End of variables declaration//GEN-END:variables
}