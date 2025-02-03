package org.ertugrul.kayali.gym;

import java.sql.*;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.swing.JOptionPane;

/*
    @Author ErtugrulKayali
    --SAYFA TAMAMLANDI--
*/

public class F_KullaniciGirisKayit extends javax.swing.JFrame
{
    static String kullaniciAdi;
    static String kullaniciSifresi;
    String kullanicisifresi="GYMYeniUye";
    String onaybekleme="Beklemede";
    Date tarih;
    DateFormat tarihformati;
    Random d_kodu=new Random();
        int rastgelekodbir;
        int rastgelekodiki;
        int rastgelekoduc;
        int rastgelekoddort;
        int rastgelekodbes;
        int rastgelekodalti;
    String emailValidate;
    
    public F_KullaniciGirisKayit()
    {
        initComponents();
        this.setTitle("ErtugrulKayali_GYM v1.0 JavaFit");
        this.setSize(710, 475);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        txtKullaniciSifresiK.setText("Kayıt Onayı Gerekir.");
        txtKullaniciSifresiK.setEnabled(false);
        txtKayitTarihi.enable(false);
        tarih = new Date();
        tarihformati = new SimpleDateFormat("yyyy-MM-dd");
        txtKayitTarihi.setText(tarihformati.format(tarih));
        txtDogrulamaKoduR.enable(false);
        rastgelekodbir=d_kodu.nextInt(10);
        rastgelekodiki=d_kodu.nextInt(10);
        rastgelekoduc=d_kodu.nextInt(10);
        rastgelekoddort=d_kodu.nextInt(10);
        rastgelekodbes=d_kodu.nextInt(10);
        rastgelekodalti=d_kodu.nextInt(10);
        txtDogrulamaKoduR.setText(String.valueOf(rastgelekodbir) + String.valueOf(rastgelekodiki) + String.valueOf(rastgelekoduc) + String.valueOf(rastgelekoddort) + String.valueOf(rastgelekodbes) + String.valueOf(rastgelekodalti));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblKullaniciAdiK = new javax.swing.JLabel();
        lblKullaniciSifresiK = new javax.swing.JLabel();
        lblAdi = new javax.swing.JLabel();
        lblSoyadi = new javax.swing.JLabel();
        lblTcKimlikNo = new javax.swing.JLabel();
        lblTelefonNumarasi = new javax.swing.JLabel();
        lblEmailAdresi = new javax.swing.JLabel();
        lblSistemRolu = new javax.swing.JLabel();
        lblKayitTarihi = new javax.swing.JLabel();
        txtKullaniciAdiK = new javax.swing.JTextField();
        txtKullaniciSifresiK = new javax.swing.JTextField();
        txtAdi = new javax.swing.JTextField();
        txtSoyadi = new javax.swing.JTextField();
        txtTcKimlikNo = new javax.swing.JTextField();
        txtTelefonNumarasi = new javax.swing.JTextField();
        txtEmailAdresi = new javax.swing.JTextField();
        txtKayitTarihi = new javax.swing.JTextField();
        cmbSistemRolu = new javax.swing.JComboBox<>();
        lblBaslikBir = new javax.swing.JLabel();
        btnKaydol = new javax.swing.JButton();
        lblBaslikIki = new javax.swing.JLabel();
        lblKullaniciAdi = new javax.swing.JLabel();
        lblKullaniciSifresi = new javax.swing.JLabel();
        vsDogrulamaKodu = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        lblDogrulamaKodu = new javax.swing.JLabel();
        txtDogrulamaKoduR = new javax.swing.JTextField();
        txtKullaniciAdi = new javax.swing.JTextField();
        txtDogrulamaKodu = new javax.swing.JTextField();
        btnGiris = new javax.swing.JButton();
        rbSifreGoster = new javax.swing.JRadioButton();
        txtKullaniciSifresi = new javax.swing.JPasswordField();
        btnCikis = new javax.swing.JButton();
        btnTemizle = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblKullaniciAdiK.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblKullaniciAdiK.setText("Kullanıcı Adı:");
        getContentPane().add(lblKullaniciAdiK, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 80, -1));

        lblKullaniciSifresiK.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblKullaniciSifresiK.setText("Kullanıcı Şifresi:");
        getContentPane().add(lblKullaniciSifresiK, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 100, -1));

        lblAdi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblAdi.setText("Adı:");
        getContentPane().add(lblAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 30, -1));

        lblSoyadi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblSoyadi.setText("Soyadı:");
        getContentPane().add(lblSoyadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 50, -1));

        lblTcKimlikNo.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblTcKimlikNo.setText("T.C. Kimlik Numarası:");
        getContentPane().add(lblTcKimlikNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 130, -1));

        lblTelefonNumarasi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblTelefonNumarasi.setText("Cep Telefonu Numarası:");
        getContentPane().add(lblTelefonNumarasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 140, -1));

        lblEmailAdresi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblEmailAdresi.setText("e-Mail Adresi:");
        getContentPane().add(lblEmailAdresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 80, -1));

        lblSistemRolu.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblSistemRolu.setText("Talep Edilen Sistem Rolü:");
        getContentPane().add(lblSistemRolu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 150, -1));

        lblKayitTarihi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblKayitTarihi.setText("Kayıt Tarihi:");
        getContentPane().add(lblKayitTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 70, -1));

        txtKullaniciAdiK.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        txtKullaniciAdiK.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtKullaniciAdiKFocusLost(evt);
            }
        });
        getContentPane().add(txtKullaniciAdiK, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 220, -1));

        txtKullaniciSifresiK.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        txtKullaniciSifresiK.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtKullaniciSifresiKFocusLost(evt);
            }
        });
        getContentPane().add(txtKullaniciSifresiK, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 220, -1));

        txtAdi.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        txtAdi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAdiFocusLost(evt);
            }
        });
        getContentPane().add(txtAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 220, -1));

        txtSoyadi.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        txtSoyadi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSoyadiFocusLost(evt);
            }
        });
        getContentPane().add(txtSoyadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 220, -1));

        txtTcKimlikNo.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
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
        getContentPane().add(txtTcKimlikNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 220, -1));

        txtTelefonNumarasi.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        txtTelefonNumarasi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonNumarasiFocusLost(evt);
            }
        });
        txtTelefonNumarasi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonNumarasiKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefonNumarasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 220, -1));

        txtEmailAdresi.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        txtEmailAdresi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailAdresiFocusLost(evt);
            }
        });
        txtEmailAdresi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAdresiActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmailAdresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 220, -1));

        txtKayitTarihi.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        getContentPane().add(txtKayitTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 220, -1));

        cmbSistemRolu.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        cmbSistemRolu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yonetici", "Muhasebe", "InsanKaynaklari", "SalonPersoneli", "CafePersoneli" }));
        getContentPane().add(cmbSistemRolu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 220, -1));

        lblBaslikBir.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblBaslikBir.setText("YENİ KAYIT TALEBİ OLUŞTURMAK İÇİN FORMU DOLDURUN");
        getContentPane().add(lblBaslikBir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        btnKaydol.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnKaydol.setText("KAYDOL");
        btnKaydol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydolActionPerformed(evt);
            }
        });
        getContentPane().add(btnKaydol, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 130, 30));

        lblBaslikIki.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblBaslikIki.setText("GİRİŞ YAP");
        getContentPane().add(lblBaslikIki, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        lblKullaniciAdi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblKullaniciAdi.setText("Kullanıcı Adı:");
        getContentPane().add(lblKullaniciAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 80, -1));

        lblKullaniciSifresi.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblKullaniciSifresi.setText("Kullanıcı Şifresi:");
        getContentPane().add(lblKullaniciSifresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 100, -1));
        getContentPane().add(vsDogrulamaKodu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 180, 70));

        lblDogrulamaKodu.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        lblDogrulamaKodu.setText("Resimdeki Rakamlar:");
        getContentPane().add(lblDogrulamaKodu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        txtDogrulamaKoduR.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        txtDogrulamaKoduR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtDogrulamaKoduR, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 180, 70));

        txtKullaniciAdi.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        getContentPane().add(txtKullaniciAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 180, -1));

        txtDogrulamaKodu.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        txtDogrulamaKodu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDogrulamaKoduActionPerformed(evt);
            }
        });
        txtDogrulamaKodu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDogrulamaKoduKeyTyped(evt);
            }
        });
        getContentPane().add(txtDogrulamaKodu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 180, -1));

        btnGiris.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnGiris.setText("GİRİŞ");
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });
        getContentPane().add(btnGiris, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 120, 30));

        rbSifreGoster.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        rbSifreGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSifreGosterActionPerformed(evt);
            }
        });
        getContentPane().add(rbSifreGoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 20, 20));
        getContentPane().add(txtKullaniciSifresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 180, -1));

        btnCikis.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        btnCikis.setText("ÇIKIŞ");
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });
        getContentPane().add(btnCikis, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 120, 30));

        btnTemizle.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnTemizle.setText("TEMİZLE");
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });
        getContentPane().add(btnTemizle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 130, 30));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaydolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydolActionPerformed
        emailValidate=txtEmailAdresi.getText();
        if(txtEmailAdresi.getText().length()>0 && "Valid".equals(lblBaslikBir.getText()) && txtKullaniciAdiK.getText().length()>0 && txtAdi.getText().length()>0 && txtSoyadi.getText().length()>0 && "Valid".equals(lblBaslikBir.getText()) && emailValidate.contains("@") && emailValidate.contains(".com") || emailValidate.contains(".tr"))
        {
            ResultSet kaydolRS=C_KullanicilarSQL.k_PGBaglan();
            kaydolRS=C_KullanicilarSQL.k_ekle(txtKullaniciAdiK.getText(), kullanicisifresi, txtAdi.getText(), txtSoyadi.getText(), txtTcKimlikNo.getText(), txtTelefonNumarasi.getText(), txtEmailAdresi.getText(), String.valueOf(cmbSistemRolu.getSelectedItem()), java.sql.Date.valueOf(txtKayitTarihi.getText()), onaybekleme);
            btnKaydol.setText("BAŞARILI");
            lblBaslikBir.setText("YENİ KAYIT TALEBİ OLUŞTURMAK İÇİN FORMU DOLDURUN");
        }
        else
        {
            lblBaslikBir.setText("TÜM BİLGİLERİN DOĞRULUĞUNU KONTROL ETMELİSİNİZ");
            btnKaydol.setText("BAŞARISIZ");
        }
    }//GEN-LAST:event_btnKaydolActionPerformed

    private void txtTcKimlikNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTcKimlikNoFocusLost

    }//GEN-LAST:event_txtTcKimlikNoFocusLost

    private void txtTcKimlikNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTcKimlikNoKeyTyped
        char karakter = evt.getKeyChar();
        if(((karakter<'0') || (karakter>'9')) && (karakter!='\b'))
        {
            evt.consume();
        }  
        if(txtTcKimlikNo.getText().length()<11)
        {
          lblBaslikBir.setText("Invalid");
        }
        else if((txtTcKimlikNo.getText()+evt.getKeyChar()).length()>11)
        {
          evt.consume();
          lblBaslikBir.setText("Valid");
        }
    }//GEN-LAST:event_txtTcKimlikNoKeyTyped

    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisActionPerformed
        kullaniciAdi=txtKullaniciAdi.getText();
        kullaniciSifresi=txtKullaniciSifresi.getText();
        String girisBilgileri="Select COUNT(kullaniciid) as kullaniciid FROM public.table_kullanicilar WHERE kullaniciadi='" + kullaniciAdi + "' and kullanicisifresi='" + kullaniciSifresi + "'";
        ResultSet girisRS=C_KullanicilarSQL.k_PGBaglan();
        girisRS=C_KullanicilarSQL.k_listele(girisBilgileri);
        try
        {
            while(girisRS.next())
            {
                if(girisRS.getInt("kullaniciid")==1 && txtDogrulamaKodu.getText().equals(txtDogrulamaKoduR.getText()))
                {
                    F_ErtugrulKayaliGYM_HomePage ekghp=new F_ErtugrulKayaliGYM_HomePage();
                    ekghp.setVisible(true);
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Kullanıcı Adı, Şifresi veya Resimdeki Rakamlar Yanlış", "GİRİŞ HATASI", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(SQLException ex)
        {
            lblBaslikBir.setText(ex.getMessage());
        }
    }//GEN-LAST:event_btnGirisActionPerformed

    private void txtKullaniciAdiKFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKullaniciAdiKFocusLost
        //if(txtKullaniciAdiK.getText().length() == 0) // Kayıt tarafındaki kullanıcı adı textfield'ı boş ise...
        //{
           //lblKullaniciAdiK.setForeground(Color.red); // İlgili label'ı kırmızıya boya.
           //txtKullaniciAdiK.requestFocus();
           /*
           Bu metodu hiçbiryerde kullanmadım. Önemli olabileceği için not olarak bırakıyorum. Tüm nesnelerin FocusLost event'ında tam olarak
           burada kullanılabilir. Bu kullanıcı tıkladığı bir nesneye değer girişi yapmadığında başka bir nesneye tıkladığında bile tekrar
           ilgili nesneye focuslar yani oraya giriş yapmasını zorunlu bırakır. Doldurulması zorunlu olmayan yerler için kullanılmaması gerekir.
           */
        //}
        //else
        //{
            //lblKullaniciAdiK.setForeground(Color.green); // Input yapıldıysa ilgili label'ı yeşile boyar.
        //}
    }//GEN-LAST:event_txtKullaniciAdiKFocusLost

    private void txtTelefonNumarasiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonNumarasiKeyTyped
        char karakter = evt.getKeyChar();
        if(((karakter<'0') || (karakter>'9')) && (karakter!='\b'))
        {
            evt.consume();
        }  
        if(txtTelefonNumarasi.getText().length()<11)
        {
          lblBaslikBir.setText("Invalid");
        }
        else if((txtTelefonNumarasi.getText()+evt.getKeyChar()).length()>11)
        {
          evt.consume();
          lblBaslikBir.setText("Valid");
        }
    }//GEN-LAST:event_txtTelefonNumarasiKeyTyped

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

    private void txtKullaniciSifresiKFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKullaniciSifresiKFocusLost
        
    }//GEN-LAST:event_txtKullaniciSifresiKFocusLost

    private void txtAdiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAdiFocusLost

    }//GEN-LAST:event_txtAdiFocusLost

    private void txtSoyadiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSoyadiFocusLost

    }//GEN-LAST:event_txtSoyadiFocusLost

    private void txtTelefonNumarasiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonNumarasiFocusLost

    }//GEN-LAST:event_txtTelefonNumarasiFocusLost

    private void txtEmailAdresiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailAdresiFocusLost

    }//GEN-LAST:event_txtEmailAdresiFocusLost

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        int message=JOptionPane.showConfirmDialog(null, "Çıkış Yapmak İstiyor musunuz?", "ÇIKIŞ", JOptionPane.YES_NO_OPTION);
        switch(message)
        {
            case JOptionPane.YES_OPTION -> System.exit(0);
            case JOptionPane.NO_OPTION -> JOptionPane.showMessageDialog(null, "Çıkış İşlemi İptal Edildi", "ÇIKIŞ", JOptionPane.INFORMATION_MESSAGE);
            default -> 
            {
            }
        }
    }//GEN-LAST:event_btnCikisActionPerformed

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        lblBaslikBir.setText("YENİ KAYIT TALEBİ OLUŞTURMAK İÇİN FORMU DOLDURUN");
        txtKullaniciAdiK.setText(null);
        txtAdi.setText(null);
        txtSoyadi.setText(null);
        txtTcKimlikNo.setText(null);
        txtTelefonNumarasi.setText(null);
        txtEmailAdresi.setText(null);
        cmbSistemRolu.setSelectedItem(null);
        btnKaydol.setText("KAYDOL");
        txtKullaniciAdi.setText(null);
        txtKullaniciSifresi.setText(null);
        txtDogrulamaKodu.setText(null);
    }//GEN-LAST:event_btnTemizleActionPerformed

    private void txtDogrulamaKoduKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDogrulamaKoduKeyTyped
        char karakter=evt.getKeyChar();
        if(((karakter<'0') || (karakter>'9')) && (karakter!='\b'))
        {
            evt.consume();
        }
        if(txtDogrulamaKodu.getText().length()<6)
        {
        }
        else if((txtDogrulamaKodu.getText()+evt.getKeyChar()).length()>6)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtDogrulamaKoduKeyTyped

    private void txtEmailAdresiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAdresiActionPerformed
        
    }//GEN-LAST:event_txtEmailAdresiActionPerformed

    private void txtDogrulamaKoduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDogrulamaKoduActionPerformed
        
    }//GEN-LAST:event_txtDogrulamaKoduActionPerformed

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
            java.util.logging.Logger.getLogger(F_KullaniciGirisKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_KullaniciGirisKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_KullaniciGirisKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_KullaniciGirisKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new F_KullaniciGirisKayit().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnGiris;
    private javax.swing.JButton btnKaydol;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JComboBox<String> cmbSistemRolu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdi;
    private javax.swing.JLabel lblBaslikBir;
    private javax.swing.JLabel lblBaslikIki;
    private javax.swing.JLabel lblDogrulamaKodu;
    private javax.swing.JLabel lblEmailAdresi;
    private javax.swing.JLabel lblKayitTarihi;
    private javax.swing.JLabel lblKullaniciAdi;
    private javax.swing.JLabel lblKullaniciAdiK;
    private javax.swing.JLabel lblKullaniciSifresi;
    private javax.swing.JLabel lblKullaniciSifresiK;
    private javax.swing.JLabel lblSistemRolu;
    private javax.swing.JLabel lblSoyadi;
    private javax.swing.JLabel lblTcKimlikNo;
    private javax.swing.JLabel lblTelefonNumarasi;
    private javax.swing.JRadioButton rbSifreGoster;
    private javax.swing.JTextField txtAdi;
    private javax.swing.JTextField txtDogrulamaKodu;
    private javax.swing.JTextField txtDogrulamaKoduR;
    private javax.swing.JTextField txtEmailAdresi;
    private javax.swing.JTextField txtKayitTarihi;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JTextField txtKullaniciAdiK;
    private javax.swing.JPasswordField txtKullaniciSifresi;
    private javax.swing.JTextField txtKullaniciSifresiK;
    private javax.swing.JTextField txtSoyadi;
    private javax.swing.JTextField txtTcKimlikNo;
    private javax.swing.JTextField txtTelefonNumarasi;
    private javax.swing.Box.Filler vsDogrulamaKodu;
    // End of variables declaration//GEN-END:variables
}