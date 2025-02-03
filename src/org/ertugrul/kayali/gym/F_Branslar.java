package org.ertugrul.kayali.gym;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
    @Author ErtugrulKayali
    --TAMAMLANDI--
*/

public class F_Branslar extends javax.swing.JInternalFrame
{
    DefaultTableModel bransTablosu=new DefaultTableModel();
    Object[] kolonlar={"Branş ID", "Branş Adı", "Branş Ücreti", "Kayıtlı Sayısı"};
    Object[] satirlar=new Object[4];
    DefaultTableModel bransTablosuFilter=new DefaultTableModel();
    Object[] kolonlarFilter={"Branş Adı", "Branş Ücreti", "Kayıtlı Sayısı"};
    Object[] satirlarFilter=new Object[3];

    public F_Branslar()
    {
        initComponents();
        this.setTitle("Branşlar/Ücretler Yönetim Sistemi");
        this.setSize(484, 389);
        C_BranslarSQL.b_PGBaglan();
        String cbIDListele="Select bransid FROM public.table_branslar";
        ResultSet cbIDListeleRS=C_BranslarSQL.b_listele(cbIDListele);
        try
        {
            while(cbIDListeleRS.next())
            {
                cbBransID.addItem(String.valueOf(cbIDListeleRS.getInt("bransid")));
            }
        }
        catch(SQLException ex)
        {}
        String cbBransAdiListele="Select bransadi FROM public.table_branslar";
        ResultSet cbBransAdiListeleRS=C_BranslarSQL.b_listele(cbBransAdiListele);
        try
        {
            while(cbBransAdiListeleRS.next())
            {
                cbBransAdi.addItem(String.valueOf(cbBransAdiListeleRS.getString("bransadi")));
            }
        }
        catch(SQLException ex)
        {}
        txtBransAdi.setText(String.valueOf(cbBransAdi.getSelectedItem()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBranslar = new javax.swing.JPanel();
        spBranslar = new javax.swing.JScrollPane();
        tblBranslar = new javax.swing.JTable();
        lblBransID = new javax.swing.JLabel();
        lblBransAdi = new javax.swing.JLabel();
        lblBransUcreti = new javax.swing.JLabel();
        cbBransID = new javax.swing.JComboBox<>();
        txtBransAdi = new javax.swing.JTextField();
        txtBransUcreti = new javax.swing.JTextField();
        btnListele = new javax.swing.JButton();
        btnEkle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        btnFiltrele = new javax.swing.JButton();
        lblKayitliSayisi = new javax.swing.JLabel();
        cbBransAdi = new javax.swing.JComboBox<>();
        lblIslemDurumu = new javax.swing.JLabel();
        btnTemizle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        pnlBranslar.setBackground(new java.awt.Color(102, 153, 255));
        pnlBranslar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblBranslar.setBackground(new java.awt.Color(0, 0, 0));
        tblBranslar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        tblBranslar.setForeground(new java.awt.Color(255, 255, 255));
        spBranslar.setViewportView(tblBranslar);

        pnlBranslar.add(spBranslar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 220));

        lblBransID.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        lblBransID.setText("Branş ID:");
        pnlBranslar.add(lblBransID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        lblBransAdi.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        lblBransAdi.setText("Branş Adı:");
        pnlBranslar.add(lblBransAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        lblBransUcreti.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        lblBransUcreti.setText("Branş Ücreti (Ay):");
        pnlBranslar.add(lblBransUcreti, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 90, -1));

        cbBransID.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        pnlBranslar.add(cbBransID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 60, 20));

        txtBransAdi.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        pnlBranslar.add(txtBransAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 130, 20));

        txtBransUcreti.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        txtBransUcreti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBransUcretiKeyTyped(evt);
            }
        });
        pnlBranslar.add(txtBransUcreti, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 130, 20));

        btnListele.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnListele.setText("LİSTELE");
        btnListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListeleActionPerformed(evt);
            }
        });
        pnlBranslar.add(btnListele, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 100, -1));

        btnEkle.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnEkle.setText("EKLE");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });
        pnlBranslar.add(btnEkle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 100, -1));

        btnSil.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnSil.setText("SİL");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });
        pnlBranslar.add(btnSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 100, -1));

        btnGuncelle.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnGuncelle.setText("GÜNCELLE");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });
        pnlBranslar.add(btnGuncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 100, -1));

        btnFiltrele.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnFiltrele.setText("FİLTRELE (ID)");
        btnFiltrele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltreleActionPerformed(evt);
            }
        });
        pnlBranslar.add(btnFiltrele, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 100, -1));

        lblKayitliSayisi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblKayitliSayisi.setText("0");
        pnlBranslar.add(lblKayitliSayisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        cbBransAdi.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        pnlBranslar.add(cbBransAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 70, 20));

        lblIslemDurumu.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        lblIslemDurumu.setText("İŞLEM DURUMU");
        pnlBranslar.add(lblIslemDurumu, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 80, -1));

        btnTemizle.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnTemizle.setText("TEMİZLE");
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });
        pnlBranslar.add(btnTemizle, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 100, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Üye Sayısı (Güncelle):");
        pnlBranslar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, -1));

        getContentPane().add(pnlBranslar, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListeleActionPerformed
        C_BranslarSQL.b_PGBaglan();
        String b_list="Select bransid, bransadi, bransucreti, kayitlisayisi FROM public.table_branslar";
        bransTablosu.setColumnCount(0);
        bransTablosu.setRowCount(0);
        bransTablosu.setColumnIdentifiers(kolonlar);
        ResultSet b_listRS=C_BranslarSQL.b_listele(b_list);
        try
        {
            while(b_listRS.next())
            {
                satirlar[0]=b_listRS.getInt("bransid");
                satirlar[1]=b_listRS.getString("bransadi");
                satirlar[2]=b_listRS.getInt("bransucreti");
                satirlar[3]=b_listRS.getInt("kayitlisayisi");
                bransTablosu.addRow(satirlar);
            }
            tblBranslar.setModel(bransTablosu);
            lblIslemDurumu.setText("Listele");
        }
        catch(SQLException ex)
        {
            lblIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnListeleActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        if(txtBransAdi.getText().length()>0 && txtBransUcreti.getText().length()>0)
        {
            ResultSet ekleRS=C_BranslarSQL.b_PGBaglan();
            ekleRS=C_BranslarSQL.b_ekle(txtBransAdi.getText(), Integer.parseInt(txtBransUcreti.getText()), Integer.parseInt(lblKayitliSayisi.getText()));
            lblIslemDurumu.setText("Ekle");
        }
        else
        {
            lblIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        int messageSil=JOptionPane.showConfirmDialog(null, "Kayıt Silinecek?", "SİL", JOptionPane.YES_NO_OPTION);
        C_BranslarSQL.b_PGBaglan();
        String b_sil="Delete FROM public.table_branslar WHERE bransid='"+ String.valueOf(cbBransID.getSelectedItem()) +"'";
        switch(messageSil)
        {
            case JOptionPane.YES_OPTION -> C_BranslarSQL.b_sil(b_sil);
            case JOptionPane.NO_OPTION -> JOptionPane.showMessageDialog(null, "Silme İşlemi İptal Edildi", "SİL", JOptionPane.INFORMATION_MESSAGE);
            default ->
            {}
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        if(txtBransAdi.getText().length()>0 && txtBransUcreti.getText().length()>0)
        {
            C_BranslarSQL.b_PGBaglan();
            String b_guncelle="Update public.table_branslar SET bransadi='"+ txtBransAdi.getText() +"', bransucreti='"+ Integer.parseInt(txtBransUcreti.getText()) +"', kayitlisayisi='"+ Integer.parseInt(lblKayitliSayisi.getText()) +"' WHERE bransid='" + String.valueOf(cbBransID.getSelectedItem()) +"'";
            C_BranslarSQL.b_guncelle(b_guncelle);
            lblIslemDurumu.setText("Güncelle");
        }
        else
        {
            lblIslemDurumu.setText("Başarısız");
        }
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnFiltreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltreleActionPerformed
        C_BranslarSQL.b_PGBaglan();
        String filter="Select bransadi, bransucreti, kayitlisayisi FROM public.table_branslar WHERE bransid='"+ String.valueOf(cbBransID.getSelectedItem()) +"'";
        bransTablosuFilter.setColumnCount(0);
        bransTablosuFilter.setRowCount(0);
        bransTablosuFilter.setColumnIdentifiers(kolonlarFilter);
        ResultSet filterRS=C_BranslarSQL.b_listele(filter);
        try
        {
            while(filterRS.next())
            {
                satirlarFilter[0]=filterRS.getString("bransadi");
                satirlarFilter[1]=filterRS.getInt("bransucreti");
                satirlarFilter[2]=filterRS.getInt("kayitlisayisi");
                bransTablosuFilter.addRow(satirlarFilter);
                txtBransAdi.setText(filterRS.getString("bransadi"));
                cbBransAdi.setSelectedItem(filterRS.getString("bransadi"));
                txtBransUcreti.setText(String.valueOf(filterRS.getInt("bransucreti")));
                lblKayitliSayisi.setText(String.valueOf(filterRS.getInt("kayitlisayisi")));
            }
            tblBranslar.setModel(bransTablosuFilter);
            lblIslemDurumu.setText("Filtrele");
        }
        catch(SQLException ex)
        {
            lblIslemDurumu.setText("Başarısız");
        }
        String kayitliSayisi="Select COUNT(*) as bransi FROM public.table_uyeler WHERE bransi='" + String.valueOf(cbBransAdi.getSelectedItem()) + "'";
        ResultSet ks_RS=C_UyelerSQL.u_listele(kayitliSayisi);
        try
        {
            while(ks_RS.next())
            {
                lblKayitliSayisi.setText(String.valueOf(ks_RS.getInt("bransi")));
            }
        }
        catch(SQLException ex)
        {}
    }//GEN-LAST:event_btnFiltreleActionPerformed

    private void txtBransUcretiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBransUcretiKeyTyped
        char karakter=evt.getKeyChar();
        if(((karakter<'0') || (karakter>'9')) && (karakter!='\b'))
        {
            evt.consume();
        }
        if(txtBransUcreti.getText().length()<3)
        {}
        else if((txtBransUcreti.getText()+ evt.getKeyChar()).length()>3)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtBransUcretiKeyTyped

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        cbBransID.setSelectedItem(null);
        txtBransAdi.setText(null);
        cbBransAdi.setSelectedItem(null);
        lblKayitliSayisi.setText("0");
        txtBransUcreti.setText(null);
        lblIslemDurumu.setText("İŞLEM DURUMU");
    }//GEN-LAST:event_btnTemizleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnFiltrele;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnListele;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JComboBox<String> cbBransAdi;
    private javax.swing.JComboBox<String> cbBransID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBransAdi;
    private javax.swing.JLabel lblBransID;
    private javax.swing.JLabel lblBransUcreti;
    private javax.swing.JLabel lblIslemDurumu;
    private javax.swing.JLabel lblKayitliSayisi;
    private javax.swing.JPanel pnlBranslar;
    private javax.swing.JScrollPane spBranslar;
    private javax.swing.JTable tblBranslar;
    private javax.swing.JTextField txtBransAdi;
    private javax.swing.JTextField txtBransUcreti;
    // End of variables declaration//GEN-END:variables
}