package org.ertugrul.kayali.gym;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class F_MaliDurumlar extends javax.swing.JInternalFrame {
    
    java.util.Date tarih;
    DateFormat tarihFormati;
    
    DefaultTableModel maliDurumlarTablosu=new DefaultTableModel();
    Object[] kolonlar={"ID", "Ürün Adı", "Ürün Fiyatı", "Alış/Satış", "Ürün Durumu", "İşlem Tarihi", "İşlem Yapan", "Üye Borcu"};
    Object[] satirlar=new Object[8];
    
    DefaultTableModel maliDurumlarTablosuFilter=new DefaultTableModel();
    Object[] kolonlarFilter={"Ürün Adı", "Ürün Fiyatı", "Alış/Satış", "Ürün Durumu", "İşlem Tarihi", "İşlem Yapan", "Üye Borcu"};
    Object[] satirlarFilter=new Object[7];

    public F_MaliDurumlar() {
        initComponents();
        
        this.setTitle("Mali Durumlar");
        this.setSize(832, 566);
        
        tarih=new java.util.Date();
        tarihFormati=new SimpleDateFormat("yyyy-MM-dd");
        lblIslemTarihi.setText(tarihFormati.format(tarih));
        
        C_MaliDurumlarSQL.md_PGBaglan();
        String cmbIDListele="Select maliid FROM public.table_malidurumlar";
        ResultSet cmbIDListeleRS=C_MaliDurumlarSQL.md_listele(cmbIDListele);
        try
        {
            while(cmbIDListeleRS.next())
            {
                cmbID.addItem(String.valueOf(cmbIDListeleRS.getInt("maliid")));
            }
            
        }
        catch(SQLException ex)
        {
            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCenter = new javax.swing.JPanel();
        spTablo = new javax.swing.JScrollPane();
        tblMaliDurumlar = new javax.swing.JTable();
        pnlDown = new javax.swing.JPanel();
        lblUrunAdi = new javax.swing.JLabel();
        lblUrunFiyati = new javax.swing.JLabel();
        txtUrunAdi = new javax.swing.JTextField();
        txtUrunFiyati = new javax.swing.JTextField();
        btnGelirHesapla = new javax.swing.JButton();
        txtGelirBaslangic = new javax.swing.JTextField();
        txtGiderBaslangic = new javax.swing.JTextField();
        btnGiderHesapla = new javax.swing.JButton();
        lblUrunDurumu = new javax.swing.JLabel();
        lblAlisSatis = new javax.swing.JLabel();
        lblIslemTarihi = new javax.swing.JLabel();
        txtGelirBitis = new javax.swing.JTextField();
        cmbAlisSatis = new javax.swing.JComboBox<>();
        cmbUrunDurumu = new javax.swing.JComboBox<>();
        txtGiderBitis = new javax.swing.JTextField();
        lblBaslangic = new javax.swing.JLabel();
        lblBitis = new javax.swing.JLabel();
        pnlLeft = new javax.swing.JPanel();
        btnEkle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        btnFiltrele = new javax.swing.JButton();
        btnTemizle = new javax.swing.JButton();
        btnFatura = new javax.swing.JButton();
        btnListele = new javax.swing.JButton();
        cmbID = new javax.swing.JComboBox<>();
        pnlRight = new javax.swing.JPanel();
        cmbUyeAdi = new javax.swing.JComboBox<>();
        txtOdedigiTutar = new javax.swing.JTextField();
        txtUyeBorcu = new javax.swing.JTextField();
        btnOnayla = new javax.swing.JButton();
        lblKalanTutar = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        pnlCenter.setLayout(new java.awt.BorderLayout());

        spTablo.setViewportView(tblMaliDurumlar);

        pnlCenter.add(spTablo, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        pnlDown.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUrunAdi.setText("Ürün Adı:");
        pnlDown.add(lblUrunAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblUrunFiyati.setText("Ürün Fiyatı:");
        pnlDown.add(lblUrunFiyati, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));
        pnlDown.add(txtUrunAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, -1));
        pnlDown.add(txtUrunFiyati, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 150, -1));

        btnGelirHesapla.setText("GELİR");
        pnlDown.add(btnGelirHesapla, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 100, -1));

        txtGelirBaslangic.setText("YYYY-AA-GG");
        pnlDown.add(txtGelirBaslangic, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 100, -1));

        txtGiderBaslangic.setText("YYYY-AA-GG");
        pnlDown.add(txtGiderBaslangic, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 100, -1));

        btnGiderHesapla.setText("GİDER");
        pnlDown.add(btnGiderHesapla, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 100, -1));

        lblUrunDurumu.setText("Ürün Durumu:");
        pnlDown.add(lblUrunDurumu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        lblAlisSatis.setText("Alış / Satış:");
        pnlDown.add(lblAlisSatis, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        lblIslemTarihi.setText("İşlem Tarihi");
        pnlDown.add(lblIslemTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, 20));

        txtGelirBitis.setText("YYYY-AA-GG");
        pnlDown.add(txtGelirBitis, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 90, -1));

        cmbAlisSatis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alış", "Satış" }));
        pnlDown.add(cmbAlisSatis, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 150, -1));

        cmbUrunDurumu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gelir", "Gider" }));
        pnlDown.add(cmbUrunDurumu, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 150, -1));

        txtGiderBitis.setText("YYYY-AA-GG");
        pnlDown.add(txtGiderBitis, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 90, -1));

        lblBaslangic.setText("BAŞLANGIÇ");
        pnlDown.add(lblBaslangic, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, 20));

        lblBitis.setText("BİTİŞ");
        pnlDown.add(lblBitis, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, 20));

        getContentPane().add(pnlDown, java.awt.BorderLayout.PAGE_END);

        pnlLeft.setBackground(new java.awt.Color(0, 0, 0));
        pnlLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEkle.setText("Add");
        pnlLeft.add(btnEkle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 100, 40));

        btnSil.setText("Delete");
        pnlLeft.add(btnSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 100, 40));

        btnGuncelle.setText("Update");
        pnlLeft.add(btnGuncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 100, 40));

        btnFiltrele.setText("Filter");
        btnFiltrele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltreleActionPerformed(evt);
            }
        });
        pnlLeft.add(btnFiltrele, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 100, 40));

        btnTemizle.setText("Clear");
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });
        pnlLeft.add(btnTemizle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 100, 40));

        btnFatura.setText("Invoice");
        pnlLeft.add(btnFatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 100, 40));

        btnListele.setText("List");
        btnListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListeleActionPerformed(evt);
            }
        });
        pnlLeft.add(btnListele, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 100, 40));
        pnlLeft.add(cmbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, -1));

        getContentPane().add(pnlLeft, java.awt.BorderLayout.LINE_START);

        pnlRight.setBackground(new java.awt.Color(0, 0, 0));
        pnlRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlRight.add(cmbUyeAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 100, -1));

        txtOdedigiTutar.setText("jTextField1");
        pnlRight.add(txtOdedigiTutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 100, -1));
        pnlRight.add(txtUyeBorcu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 100, -1));

        btnOnayla.setText("OK");
        pnlRight.add(btnOnayla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 100, -1));

        lblKalanTutar.setForeground(new java.awt.Color(255, 255, 255));
        lblKalanTutar.setText("jLabel1");
        pnlRight.add(lblKalanTutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        getContentPane().add(pnlRight, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListeleActionPerformed
        C_MaliDurumlarSQL.md_PGBaglan();
        String md_list="Select maliid, urunadi, urunfiyati, alissatis, urundurumu, islemtarihi, islemyapan, uyeborcu FROM public.table_malidurumlar";
        maliDurumlarTablosu.setColumnCount(0);
        maliDurumlarTablosu.setRowCount(0);
        maliDurumlarTablosu.setColumnIdentifiers(kolonlar);
        ResultSet md_listRS=C_MaliDurumlarSQL.md_listele(md_list);
        try
        {
            while(md_listRS.next())
            {
                satirlar[0]=md_listRS.getInt("maliid");
                satirlar[1]=md_listRS.getString("urunadi");
                satirlar[2]=md_listRS.getInt("urunfiyati");
                satirlar[3]=md_listRS.getString("alissatis");
                satirlar[4]=md_listRS.getString("urundurumu");
                satirlar[5]=md_listRS.getDate("islemtarihi");
                satirlar[6]=md_listRS.getString("islemyapan");
                satirlar[7]=md_listRS.getInt("uyeborcu");
                maliDurumlarTablosu.addRow(satirlar);
            }
            tblMaliDurumlar.setModel(maliDurumlarTablosu);
            
        }
        catch(SQLException ex)
        {
            
        }
    }//GEN-LAST:event_btnListeleActionPerformed

    private void btnFiltreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltreleActionPerformed
        C_MaliDurumlarSQL.md_PGBaglan();
        String filter="Select urunadi, urunfiyati, alissatis, urundurumu, islemtarihi, islemyapan, uyeborcu FROM public.table_malidurumlar";
        maliDurumlarTablosuFilter.setColumnCount(0);
        maliDurumlarTablosuFilter.setRowCount(0);
        maliDurumlarTablosuFilter.setColumnIdentifiers(kolonlarFilter);
        ResultSet filterRS=C_MaliDurumlarSQL.md_listele(filter);
        try
        {
            while(filterRS.next())
            {
                satirlarFilter[0]=filterRS.getString("urunadi");
                satirlarFilter[1]=filterRS.getInt("urunfiyati");
                satirlarFilter[2]=filterRS.getString("alissatis");
                satirlarFilter[3]=filterRS.getString("urundurumu");
                satirlarFilter[4]=filterRS.getDate("islemtarihi");
                satirlarFilter[5]=filterRS.getString("islemyapan");
                satirlarFilter[6]=filterRS.getInt("uyeborcu");
                maliDurumlarTablosuFilter.addRow(satirlarFilter);
                
                txtUrunAdi.setText(filterRS.getString("urunadi"));
                txtUrunFiyati.setText(String.valueOf(filterRS.getInt("urunfiyati")));
                cmbAlisSatis.setSelectedItem(filterRS.getString("alissatis"));
                cmbUrunDurumu.setSelectedItem(String.valueOf(filterRS.getString("urundurumu")));
                lblIslemTarihi.setText(String.valueOf(filterRS.getDate("islemtarihi")));
                lblKalanTutar.setText(String.valueOf("uyeborcu"));
            }
            tblMaliDurumlar.setModel(maliDurumlarTablosuFilter);
        }
        catch(SQLException ex)
        {
            
        }
    }//GEN-LAST:event_btnFiltreleActionPerformed

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        tarih=new java.util.Date();
        tarihFormati=new SimpleDateFormat("yyyy-MM-dd");
        lblIslemTarihi.setText(tarihFormati.format(tarih));
        
        cmbID.setSelectedItem(null);
        txtUrunAdi.setText(null);
        txtUrunFiyati.setText(null);
        cmbAlisSatis.setSelectedItem(null);
        cmbUrunDurumu.setSelectedItem(null);
        txtGelirBaslangic.setText(null);
        txtGelirBitis.setText(null);
        txtGiderBaslangic.setText(null);
        txtGiderBitis.setText(null);
        btnGelirHesapla.setText("GELİR");
        btnGiderHesapla.setText("GİDER");
    }//GEN-LAST:event_btnTemizleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnFatura;
    private javax.swing.JButton btnFiltrele;
    private javax.swing.JButton btnGelirHesapla;
    private javax.swing.JButton btnGiderHesapla;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnListele;
    private javax.swing.JButton btnOnayla;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JComboBox<String> cmbAlisSatis;
    private javax.swing.JComboBox<String> cmbID;
    private javax.swing.JComboBox<String> cmbUrunDurumu;
    private javax.swing.JComboBox<String> cmbUyeAdi;
    private javax.swing.JLabel lblAlisSatis;
    private javax.swing.JLabel lblBaslangic;
    private javax.swing.JLabel lblBitis;
    private javax.swing.JLabel lblIslemTarihi;
    private javax.swing.JLabel lblKalanTutar;
    private javax.swing.JLabel lblUrunAdi;
    private javax.swing.JLabel lblUrunDurumu;
    private javax.swing.JLabel lblUrunFiyati;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlDown;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JScrollPane spTablo;
    private javax.swing.JTable tblMaliDurumlar;
    private javax.swing.JTextField txtGelirBaslangic;
    private javax.swing.JTextField txtGelirBitis;
    private javax.swing.JTextField txtGiderBaslangic;
    private javax.swing.JTextField txtGiderBitis;
    private javax.swing.JTextField txtOdedigiTutar;
    private javax.swing.JTextField txtUrunAdi;
    private javax.swing.JTextField txtUrunFiyati;
    private javax.swing.JTextField txtUyeBorcu;
    // End of variables declaration//GEN-END:variables
}
