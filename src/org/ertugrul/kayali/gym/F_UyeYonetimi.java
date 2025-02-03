package org.ertugrul.kayali.gym;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
    @Author ErtugrulKayali
    --TAMAMLANDI--
*/

public class F_UyeYonetimi extends javax.swing.JInternalFrame
{
    java.util.Date tarih;
    DateFormat tarihformati;
    DefaultTableModel uyeTablosu=new DefaultTableModel();
    Object[] kolonlar={"ID", "T.C.", "Adı", "Soyadı", "Telefon Numarası", "Ev Adresi", "Doğum Tarihi", "Branşı", "Kayıt Süresi", "Toplam Ücret", "Kayıt Tarihi", "İşlem Yapan", "İşlem Adı"};
    Object[] satirlar=new Object[13];
    DefaultTableModel uyeTablosuFilter=new DefaultTableModel();
    Object[] kolonlarFilter={"T.C.", "Adı", "Soyadı", "Telefon Numarası", "Ev Adresi", "Doğum Tarihi", "Branşı", "Kayıt Süresi", "Toplam Ücret", "Kayıt Tarihi", "İşlem Yapan", "İşlem Adı"};
    Object[] satirlarFilter=new Object[12];
        
    public F_UyeYonetimi()
    {
        initComponents();
        this.setTitle("Üye Yönetim Sistemi");
        this.setSize(842,615);
        tarih = new java.util.Date();
        tarihformati = new SimpleDateFormat("yyyy-MM-dd");
        lblTarih.setText(tarihformati.format(tarih));
        C_UyelerSQL.u_PGBaglan();
        String cbIDListele="Select uyeid FROM public.table_uyeler";
        ResultSet cbIDListeleRS=C_UyelerSQL.u_listele(cbIDListele);
        try
        {
            while(cbIDListeleRS.next())
            {
                cbID.addItem(String.valueOf(cbIDListeleRS.getInt("uyeid")));
            }
        }
        catch(SQLException ex)
        {
            lblYapilanIslemDurumu.setText(ex.getMessage());
        }
        C_BranslarSQL.b_PGBaglan();
        String cbBransListele="Select bransadi FROM public.table_branslar";
        ResultSet cbBransListeleRS=C_BranslarSQL.b_listele(cbBransListele);
        try
        {
            while(cbBransListeleRS.next())
            {
                cbBransi.addItem(String.valueOf(cbBransListeleRS.getString("bransadi")));
            }
        }
        catch(SQLException ex)
        {
            lblYapilanIslemDurumu.setText(ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLeft = new javax.swing.JPanel();
        btnListele = new javax.swing.JButton();
        btnEkle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        btnFiltrele = new javax.swing.JButton();
        btnDokumanAl = new javax.swing.JButton();
        btnTemizle = new javax.swing.JButton();
        pnlBanner = new javax.swing.JPanel();
        lblYapilanIslemDurumu = new javax.swing.JLabel();
        lblTarih = new javax.swing.JLabel();
        pnlFooter = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        cbID = new javax.swing.JComboBox<>();
        lblAdi = new javax.swing.JLabel();
        txtTcKimlikNo = new javax.swing.JTextField();
        lblSoyadi = new javax.swing.JLabel();
        txtAdi = new javax.swing.JTextField();
        lblTelefonNumarasi = new javax.swing.JLabel();
        txtSoyadi = new javax.swing.JTextField();
        lblTcKimlikNo = new javax.swing.JLabel();
        lblDogumTarihi = new javax.swing.JLabel();
        lblBransi = new javax.swing.JLabel();
        lblEvAdresi = new javax.swing.JLabel();
        lblKayitSuresi = new javax.swing.JLabel();
        cbBransi = new javax.swing.JComboBox<>();
        txtTelefonNumarasi = new javax.swing.JTextField();
        txtEvAdresi = new javax.swing.JTextField();
        txtDogumTarihi = new javax.swing.JTextField();
        txtKayitSuresi = new javax.swing.JTextField();
        lblUcretHesapla = new javax.swing.JLabel();
        btnUcretHesapla = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        spUyeTable = new javax.swing.JScrollPane();
        tblUyeYonetimi = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);

        pnlLeft.setBackground(new java.awt.Color(0, 0, 0));
        pnlLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnListele.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnListele.setText("LİSTELE");
        btnListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListeleActionPerformed(evt);
            }
        });
        pnlLeft.add(btnListele, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 136, 30));

        btnEkle.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnEkle.setText("EKLE");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });
        pnlLeft.add(btnEkle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 136, 30));

        btnSil.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnSil.setText("SİL");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });
        pnlLeft.add(btnSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 136, 30));

        btnGuncelle.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnGuncelle.setText("GÜNCELLE");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });
        pnlLeft.add(btnGuncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 136, 30));

        btnFiltrele.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnFiltrele.setText("FİLTRELE (ID)");
        btnFiltrele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltreleActionPerformed(evt);
            }
        });
        pnlLeft.add(btnFiltrele, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 136, 30));

        btnDokumanAl.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnDokumanAl.setText("DOKÜMAN AL");
        btnDokumanAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDokumanAlActionPerformed(evt);
            }
        });
        pnlLeft.add(btnDokumanAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 136, 30));

        btnTemizle.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnTemizle.setText("TEMİZLE");
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });
        pnlLeft.add(btnTemizle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 136, 30));

        getContentPane().add(pnlLeft, java.awt.BorderLayout.LINE_START);

        pnlBanner.setBackground(new java.awt.Color(102, 153, 255));
        pnlBanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblYapilanIslemDurumu.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblYapilanIslemDurumu.setText("YAPILAN İŞLEM DURUMU");
        pnlBanner.add(lblYapilanIslemDurumu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        lblTarih.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        lblTarih.setText("Tarih:");
        pnlBanner.add(lblTarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, -1, -1));

        getContentPane().add(pnlBanner, java.awt.BorderLayout.PAGE_START);

        pnlFooter.setBackground(new java.awt.Color(102, 153, 255));
        pnlFooter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblID.setText("ID:");
        pnlFooter.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cbID.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        pnlFooter.add(cbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 20));

        lblAdi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblAdi.setText("Adı:");
        pnlFooter.add(lblAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        txtTcKimlikNo.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        txtTcKimlikNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTcKimlikNoKeyTyped(evt);
            }
        });
        pnlFooter.add(txtTcKimlikNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 20));

        lblSoyadi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblSoyadi.setText("Soyadı:");
        pnlFooter.add(lblSoyadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        txtAdi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        pnlFooter.add(txtAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 130, -1));

        lblTelefonNumarasi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblTelefonNumarasi.setText("Telefon Numarası:");
        pnlFooter.add(lblTelefonNumarasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        txtSoyadi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        pnlFooter.add(txtSoyadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 130, 20));

        lblTcKimlikNo.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblTcKimlikNo.setText("T.C. Kimlik Numarası:");
        pnlFooter.add(lblTcKimlikNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblDogumTarihi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblDogumTarihi.setText("Doğum Tarihi:");
        pnlFooter.add(lblDogumTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        lblBransi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblBransi.setText("Branşı:");
        pnlFooter.add(lblBransi, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        lblEvAdresi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblEvAdresi.setText("Ev Adresi:");
        pnlFooter.add(lblEvAdresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        lblKayitSuresi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblKayitSuresi.setText("Kayıt Süresi (AY):");
        pnlFooter.add(lblKayitSuresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        cbBransi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        pnlFooter.add(cbBransi, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 130, 20));

        txtTelefonNumarasi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        txtTelefonNumarasi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonNumarasiKeyTyped(evt);
            }
        });
        pnlFooter.add(txtTelefonNumarasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 130, 20));

        txtEvAdresi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        pnlFooter.add(txtEvAdresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 130, 20));

        txtDogumTarihi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        pnlFooter.add(txtDogumTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 130, 20));

        txtKayitSuresi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        txtKayitSuresi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKayitSuresiKeyTyped(evt);
            }
        });
        pnlFooter.add(txtKayitSuresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 130, 20));

        lblUcretHesapla.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblUcretHesapla.setText("Ücret Hesapla:");
        pnlFooter.add(lblUcretHesapla, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        btnUcretHesapla.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnUcretHesapla.setText("ÜCRET HESAPLA");
        btnUcretHesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUcretHesaplaActionPerformed(evt);
            }
        });
        pnlFooter.add(btnUcretHesapla, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 130, 20));

        getContentPane().add(pnlFooter, java.awt.BorderLayout.PAGE_END);

        pnlCenter.setBackground(new java.awt.Color(0, 0, 0));
        pnlCenter.setLayout(new java.awt.BorderLayout());

        tblUyeYonetimi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        spUyeTable.setViewportView(tblUyeYonetimi);

        pnlCenter.add(spUyeTable, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListeleActionPerformed
        C_UyelerSQL.u_PGBaglan();
        String u_list="Select uyeid, tckimlikno, adi, soyadi, telefonno, evadresi, dogumtarihi, bransi, kayitsuresiay, toplamucret, kayittarihi, islemyapan, islemadi FROM public.table_uyeler";
        uyeTablosu.setColumnCount(0);
        uyeTablosu.setRowCount(0);
        uyeTablosu.setColumnIdentifiers(kolonlar);
        ResultSet u_listRS=C_UyelerSQL.u_listele(u_list);
        try
        {
            while(u_listRS.next())
            {
                satirlar[0]=u_listRS.getInt("uyeid");
                satirlar[1]=u_listRS.getString("tckimlikno");
                satirlar[2]=u_listRS.getString("adi");
                satirlar[3]=u_listRS.getString("soyadi");
                satirlar[4]=u_listRS.getString("telefonno");
                satirlar[5]=u_listRS.getString("evadresi");
                satirlar[6]=u_listRS.getDate("dogumtarihi");
                satirlar[7]=u_listRS.getString("bransi");
                satirlar[8]=u_listRS.getInt("kayitsuresiay");
                satirlar[9]=u_listRS.getInt("toplamucret");
                satirlar[10]=u_listRS.getDate("kayittarihi");
                satirlar[11]=u_listRS.getString("islemyapan");
                satirlar[12]=u_listRS.getString("islemadi");
                uyeTablosu.addRow(satirlar);
            }
            tblUyeYonetimi.setModel(uyeTablosu);
            lblYapilanIslemDurumu.setText("Listeleme İşlemi");
        }
        catch(SQLException ex)
        {
            lblYapilanIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnListeleActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        if("Valid".equals(lblYapilanIslemDurumu.getText()) && "Valid".equals(lblYapilanIslemDurumu.getText()) && txtTcKimlikNo.getText().length()>0 && txtAdi.getText().length()>0 && txtSoyadi.getText().length()>0 && txtTelefonNumarasi.getText().length()>0 && txtEvAdresi.getText().length()>0 && txtKayitSuresi.getText().length()>0)
        {
            ResultSet ekleRS=C_UyelerSQL.u_PGBaglan();
            ekleRS=C_UyelerSQL.u_ekle(txtTcKimlikNo.getText(), txtAdi.getText(), txtSoyadi.getText(), txtTelefonNumarasi.getText(), txtEvAdresi.getText(), Date.valueOf(txtDogumTarihi.getText()), String.valueOf(cbBransi.getSelectedItem()), Integer.parseInt(txtKayitSuresi.getText()), Integer.parseInt(btnUcretHesapla.getText()), Date.valueOf(lblTarih.getText()), F_KullaniciGirisKayit.kullaniciAdi, "Ekle");
            lblYapilanIslemDurumu.setText("Ekleme İşlemi");
        }
        else
        {
            lblYapilanIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        int messageSil=JOptionPane.showConfirmDialog(null, "Kayıt Silinecek?", "SİL", JOptionPane.YES_NO_OPTION);
        C_UyelerSQL.u_PGBaglan();
        String u_sil="Delete FROM public.table_uyeler WHERE uyeid='"+ String.valueOf(cbID.getSelectedItem()) +"'";
        switch(messageSil)
        {
            case JOptionPane.YES_OPTION -> C_UyelerSQL.u_sil(u_sil);
            case JOptionPane.NO_OPTION -> JOptionPane.showMessageDialog(null, "Silme İşlemi İptal Edildi", "SİL", JOptionPane.INFORMATION_MESSAGE);
            default ->
            {}
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        if("Valid".equals(lblYapilanIslemDurumu.getText()) && "Valid".equals(lblYapilanIslemDurumu.getText()) && txtTcKimlikNo.getText().length()>0 && txtAdi.getText().length()>0 && txtSoyadi.getText().length()>0 && txtTelefonNumarasi.getText().length()>0 && txtEvAdresi.getText().length()>0 && txtKayitSuresi.getText().length()>0)
        {
            C_UyelerSQL.u_PGBaglan();
            String u_guncelle="Update public.table_uyeler SET tckimlikno='"+ txtTcKimlikNo.getText() +"', adi='"+ txtAdi.getText() +"', soyadi='"+ txtSoyadi.getText() +"', telefonno='"+ txtTelefonNumarasi.getText() +"', evadresi='"+ txtEvAdresi.getText() +"', dogumtarihi='"+ Date.valueOf(txtDogumTarihi.getText()) +"', bransi='"+ String.valueOf(cbBransi.getSelectedItem()) +"', kayitsuresiay='"+ Integer.parseInt(txtKayitSuresi.getText()) +"', toplamucret='"+ Integer.parseInt(btnUcretHesapla.getText()) +"', kayittarihi='"+ Date.valueOf(lblTarih.getText()) +"', islemyapan='"+ F_KullaniciGirisKayit.kullaniciAdi +"', islemadi='"+ "Güncelle" +"' WHERE uyeid='"+ String.valueOf(cbID.getSelectedItem()) +"'";
            C_UyelerSQL.u_guncelle(u_guncelle);
            lblYapilanIslemDurumu.setText("Güncelleme İşlemi");
        }
        else
        {
            lblYapilanIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnFiltreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltreleActionPerformed
        C_UyelerSQL.u_PGBaglan();
        String filter="Select tckimlikno, adi, soyadi, telefonno, evadresi, dogumtarihi, bransi, kayitsuresiay, toplamucret, kayittarihi, islemyapan, islemadi FROM public.table_uyeler WHERE uyeid='"+ String.valueOf(cbID.getSelectedItem()) +"'";
        uyeTablosuFilter.setColumnCount(0);
        uyeTablosuFilter.setRowCount(0);
        uyeTablosuFilter.setColumnIdentifiers(kolonlarFilter);
        ResultSet filterRS=C_UyelerSQL.u_listele(filter);
        try
        {
            while(filterRS.next())
            {
                satirlarFilter[0]=filterRS.getString("tckimlikno");
                satirlarFilter[1]=filterRS.getString("adi");
                satirlarFilter[2]=filterRS.getString("soyadi");
                satirlarFilter[3]=filterRS.getString("telefonno");
                satirlarFilter[4]=filterRS.getString("evadresi");
                satirlarFilter[5]=filterRS.getDate("dogumtarihi");
                satirlarFilter[6]=filterRS.getString("bransi");
                satirlarFilter[7]=filterRS.getInt("kayitsuresiay");
                satirlarFilter[8]=filterRS.getInt("toplamucret");
                satirlarFilter[9]=filterRS.getDate("kayittarihi");
                satirlarFilter[10]=filterRS.getString("islemyapan");
                satirlarFilter[11]=filterRS.getString("islemadi");
                uyeTablosuFilter.addRow(satirlarFilter);
                txtTcKimlikNo.setText(filterRS.getString("tckimlikno"));
                txtAdi.setText(filterRS.getString("adi"));
                txtSoyadi.setText(filterRS.getString("soyadi"));
                txtTelefonNumarasi.setText(filterRS.getString("telefonno"));
                txtEvAdresi.setText(filterRS.getString("evadresi"));
                txtDogumTarihi.setText(String.valueOf(filterRS.getDate("dogumtarihi")));
                cbBransi.setSelectedItem(filterRS.getString("bransi"));
                txtKayitSuresi.setText(String.valueOf(filterRS.getInt("kayitsuresiay")));
                btnUcretHesapla.setText(String.valueOf(filterRS.getInt("toplamucret")));
            }
            tblUyeYonetimi.setModel(uyeTablosuFilter);
            lblYapilanIslemDurumu.setText("Filtreleme İşlemi");
        }
        catch(SQLException ex)
        {
            lblYapilanIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnFiltreleActionPerformed

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        cbID.setSelectedItem(null);
        txtTcKimlikNo.setText(null);
        txtAdi.setText(null);
        txtSoyadi.setText(null);
        txtTelefonNumarasi.setText(null);
        txtEvAdresi.setText(null);
        txtDogumTarihi.setText(null);
        cbBransi.setSelectedItem(null);
        txtKayitSuresi.setText(null);
        btnUcretHesapla.setText("ÜCRET HESAPLA");
        lblYapilanIslemDurumu.setText("YAPILAN İŞLEM DURUMU");
    }//GEN-LAST:event_btnTemizleActionPerformed

    private void btnUcretHesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUcretHesaplaActionPerformed
        C_BranslarSQL.b_PGBaglan();
        String ucretHesapla="Select bransucreti * '"+ Integer.parseInt(txtKayitSuresi.getText()) +"' as hesaplanmis_Ucret FROM public.table_branslar WHERE bransadi='"+ String.valueOf(cbBransi.getSelectedItem()) +"'";
        ResultSet ucretHesaplaRS=C_BranslarSQL.b_listele(ucretHesapla);
        try
        {
            while(ucretHesaplaRS.next())
            {
                btnUcretHesapla.setText(String.valueOf(ucretHesaplaRS.getInt("hesaplanmis_Ucret")));
                lblYapilanIslemDurumu.setText("Ücret Hesaplandı");
            }
        }
        catch(SQLException ex)
        {
            lblYapilanIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnUcretHesaplaActionPerformed

    private void btnDokumanAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDokumanAlActionPerformed
        try
        {
            File dokumanAl=new File("'"+ txtAdi.getText() + txtSoyadi.getText() + "_" + String.valueOf(cbBransi.getSelectedItem()) + "'.txt");
            if(dokumanAl.exists()==false)
            {
                dokumanAl.createNewFile();
                lblYapilanIslemDurumu.setText("Doküman Alındı");
            }
            else
            {
                lblYapilanIslemDurumu.setText("Başarısız");
            }
            FileWriter dokumanYaz=new FileWriter(dokumanAl);
            try(BufferedWriter dokumanYaz_BW=new BufferedWriter(dokumanYaz))
            {
                dokumanYaz_BW.write(
                        "Sporcu Kayıt Tarihi: " + lblTarih.getText() + "\n" + "=============================" + "\n" +
                        "Sporu T.C. Kimlik Numarası: " + txtTcKimlikNo.getText() + "\n" + "==============================" + "\n" + 
                        "Sporcu Adı: " + txtAdi.getText() + "\n" + "==============================" + "\n" + 
                        "Sporcu Soyadı: " + txtSoyadi.getText() + "\n" + "==============================" + "\n" +
                        "Sporcu Telefon Numarası: " + txtTelefonNumarasi.getText() + "\n" + "==============================" + "\n" +
                        "Sporcu Ev Adresi: " + txtEvAdresi.getText() + "\n" + "==============================" + "\n" + 
                        "Sporcu Doğum Tarihi: " + String.valueOf(txtDogumTarihi.getText()) + "\n" + "==============================" + "\n" +
                        "Sporcu Kayıt Branşı: " + String.valueOf(cbBransi.getSelectedItem()) + "\n" + "==============================" + "\n" +
                        "Sporcu Kayıt Süresi (AY): " + String.valueOf(txtKayitSuresi.getText()) + "\n" + "==============================" + "\n" +
                        "Sporcu Toplam Kayıt Ücreti: " + String.valueOf(btnUcretHesapla.getText()) + "\n" + "==============================" + "\n" +
                        "İşlem Yapan Salon Personeli: " + F_KullaniciGirisKayit.kullaniciAdi);
            }
        }
        catch(IOException exception)
        {
            lblYapilanIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnDokumanAlActionPerformed

    private void txtTcKimlikNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTcKimlikNoKeyTyped
        char karakter=evt.getKeyChar();
        if(((karakter<'0') || (karakter>'9')) && (karakter!='\b'))
        {
            evt.consume();
        }
        if(txtTcKimlikNo.getText().length()<11)
        {
            lblYapilanIslemDurumu.setText("Invalid");
        }
        else if((txtTcKimlikNo.getText() + evt.getKeyChar()).length()>11)
        {
            evt.consume();
            lblYapilanIslemDurumu.setText("Valid");
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
            lblYapilanIslemDurumu.setText("Invalid");
        }
        else if((txtTelefonNumarasi.getText() + evt.getKeyChar()).length()>11)
        {
            evt.consume();
            lblYapilanIslemDurumu.setText("Valid");
        }
    }//GEN-LAST:event_txtTelefonNumarasiKeyTyped

    private void txtKayitSuresiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKayitSuresiKeyTyped
        char karakter=evt.getKeyChar();
        if(((karakter<'0') || (karakter>'9')) && (karakter!='\b'))
        {
            evt.consume();
        }
        if(txtKayitSuresi.getText().length()<2)
        {}
        else if((txtKayitSuresi.getText()+ evt.getKeyChar()).length()>2)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtKayitSuresiKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDokumanAl;
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnFiltrele;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnListele;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JButton btnUcretHesapla;
    private javax.swing.JComboBox<String> cbBransi;
    private javax.swing.JComboBox<String> cbID;
    private javax.swing.JLabel lblAdi;
    private javax.swing.JLabel lblBransi;
    private javax.swing.JLabel lblDogumTarihi;
    private javax.swing.JLabel lblEvAdresi;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblKayitSuresi;
    private javax.swing.JLabel lblSoyadi;
    private javax.swing.JLabel lblTarih;
    private javax.swing.JLabel lblTcKimlikNo;
    private javax.swing.JLabel lblTelefonNumarasi;
    private javax.swing.JLabel lblUcretHesapla;
    private javax.swing.JLabel lblYapilanIslemDurumu;
    private javax.swing.JPanel pnlBanner;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JScrollPane spUyeTable;
    private javax.swing.JTable tblUyeYonetimi;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextField txtDogumTarihi;
    private javax.swing.JTextField txtEvAdresi;
    private javax.swing.JTextField txtKayitSuresi;
    private javax.swing.JTextField txtSoyadi;
    private javax.swing.JTextField txtTcKimlikNo;
    private javax.swing.JTextField txtTelefonNumarasi;
    // End of variables declaration//GEN-END:variables
}