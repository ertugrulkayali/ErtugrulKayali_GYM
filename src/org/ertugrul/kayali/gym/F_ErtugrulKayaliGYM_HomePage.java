package org.ertugrul.kayali.gym;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
    @Author ErtugrulKayali
    --TAMAMLANDI--
*/

public class F_ErtugrulKayaliGYM_HomePage extends javax.swing.JFrame
{
    public F_ErtugrulKayaliGYM_HomePage()
    {
        initComponents();
        this.setTitle("ErtugrulKayali_GYM v1.0 JavaFit");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mUser.setText(F_KullaniciGirisKayit.kullaniciAdi);
        miSistemRolu.setVisible(false);
        miCikis.setText("Çıkış Yap");
        
        String roller;
        C_KullanicilarSQL.k_PGBaglan();
        String rolList = "Select sistemrolu FROM public.table_kullanicilar WHERE kullaniciadi='"+ F_KullaniciGirisKayit.kullaniciAdi + "'";
        ResultSet rolListRS=C_KullanicilarSQL.k_listele(rolList);
        try
        {
            while(rolListRS.next())
            {
                roller=rolListRS.getString("sistemrolu");
                miSistemRolu.setText(roller);
            }
        }
        catch(SQLException ex)
        {}
        if(!"Yonetici".equals(miSistemRolu.getText()) && !"InsanKaynaklari".equals(miSistemRolu.getText()))
        {
            miKullanicilar.setEnabled(false);
            miUyeler.setEnabled(false);
        }
        else
        {
            miKullanicilar.setEnabled(true);
            miKullanicilar.setEnabled(true);
        }
        if(!"Yonetici".equals(miSistemRolu.getText()) && !"Muhasebe".equals(miSistemRolu.getText()))
        {
            miMaliDurumlar.setEnabled(false);
        }
        else
        {
            miMaliDurumlar.setEnabled(true);
        }
        if(!"Yonetici".equals(miSistemRolu.getText()) && !"SalonPersoneli".equals(miSistemRolu.getText()))
        {
            miBranslar.setEnabled(false);
            miSalonMalzemeleri.setEnabled(false);
        }
        else
        {
            miBranslar.setEnabled(true);
            miSalonMalzemeleri.setEnabled(true);
        }
        if(!"Yonetici".equals(miSistemRolu.getText()) && !"CafePersoneli".equals(miSistemRolu.getText()))
        {
            miCafeYonetimSistemi.setEnabled(false);
            miCafeMenu.setEnabled(false);
        }
        else
        {
            miCafeYonetimSistemi.setEnabled(true);
            miCafeMenu.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        dpGYMHomePage = new javax.swing.JDesktopPane();
        jmiMenuCubugu = new javax.swing.JMenuBar();
        mUser = new javax.swing.JMenu();
        miSistemRolu = new javax.swing.JMenuItem();
        miCikis = new javax.swing.JMenuItem();
        mInsanKaynaklari = new javax.swing.JMenu();
        miKullanicilar = new javax.swing.JMenuItem();
        sInsanKaynaklari = new javax.swing.JPopupMenu.Separator();
        miUyeler = new javax.swing.JMenuItem();
        mMuhasebe = new javax.swing.JMenu();
        miMaliDurumlar = new javax.swing.JMenuItem();
        mSalon = new javax.swing.JMenu();
        miBranslar = new javax.swing.JMenuItem();
        sSalon = new javax.swing.JPopupMenu.Separator();
        miSalonMalzemeleri = new javax.swing.JMenuItem();
        mCafe = new javax.swing.JMenu();
        miCafeYonetimSistemi = new javax.swing.JMenuItem();
        sCafe = new javax.swing.JPopupMenu.Separator();
        miCafeMenu = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dpGYMHomePageLayout = new javax.swing.GroupLayout(dpGYMHomePage);
        dpGYMHomePage.setLayout(dpGYMHomePageLayout);
        dpGYMHomePageLayout.setHorizontalGroup(
            dpGYMHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        dpGYMHomePageLayout.setVerticalGroup(
            dpGYMHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        getContentPane().add(dpGYMHomePage, java.awt.BorderLayout.CENTER);

        mUser.setText("OTURUM AÇTINIZ:");

        miSistemRolu.setText("SİSTEM ROLÜ:");
        mUser.add(miSistemRolu);

        miCikis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miCikis.setText("ÇIKIŞ YAP: ");
        miCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCikisActionPerformed(evt);
            }
        });
        mUser.add(miCikis);

        jmiMenuCubugu.add(mUser);

        mInsanKaynaklari.setText("İNSAN KAYNAKLARI");

        miKullanicilar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miKullanicilar.setText("KULLANICILAR");
        miKullanicilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKullanicilarActionPerformed(evt);
            }
        });
        mInsanKaynaklari.add(miKullanicilar);
        mInsanKaynaklari.add(sInsanKaynaklari);

        miUyeler.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miUyeler.setText("ÜYELER");
        miUyeler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUyelerActionPerformed(evt);
            }
        });
        mInsanKaynaklari.add(miUyeler);

        jmiMenuCubugu.add(mInsanKaynaklari);

        mMuhasebe.setText("MUHASEBE");

        miMaliDurumlar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miMaliDurumlar.setText("MALİ DURUMLAR");
        miMaliDurumlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMaliDurumlarActionPerformed(evt);
            }
        });
        mMuhasebe.add(miMaliDurumlar);

        jmiMenuCubugu.add(mMuhasebe);

        mSalon.setText("SALON");

        miBranslar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miBranslar.setText("BRANŞLAR & ÜCRETLERİ");
        miBranslar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBranslarActionPerformed(evt);
            }
        });
        mSalon.add(miBranslar);
        mSalon.add(sSalon);

        miSalonMalzemeleri.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miSalonMalzemeleri.setText("SALON MALZEMELERİ");
        miSalonMalzemeleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalonMalzemeleriActionPerformed(evt);
            }
        });
        mSalon.add(miSalonMalzemeleri);

        jmiMenuCubugu.add(mSalon);

        mCafe.setText("CAFE");

        miCafeYonetimSistemi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miCafeYonetimSistemi.setText("CAFE YÖNETİM SİSTEMİ");
        miCafeYonetimSistemi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCafeYonetimSistemiActionPerformed(evt);
            }
        });
        mCafe.add(miCafeYonetimSistemi);
        mCafe.add(sCafe);

        miCafeMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miCafeMenu.setText("CAFE MENÜ");
        miCafeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCafeMenuActionPerformed(evt);
            }
        });
        mCafe.add(miCafeMenu);

        jmiMenuCubugu.add(mCafe);

        setJMenuBar(jmiMenuCubugu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCikisActionPerformed
        int cikisJOP=JOptionPane.showConfirmDialog(null, "Çıkış Yapmak İstiyor musunuz?", "ÇIKIŞ YAPILIYOR", JOptionPane.YES_NO_OPTION);
        switch(cikisJOP)
        {
            case JOptionPane.YES_OPTION ->
            {
                F_KullaniciGirisKayit girisSayfasi=new F_KullaniciGirisKayit();
                girisSayfasi.setVisible(true);
                setVisible(false);
            }
            case JOptionPane.NO_OPTION -> JOptionPane.showMessageDialog(null, "Çıkış İşlemi İptal Edildi", "ÇIKIŞ YAP", JOptionPane.INFORMATION_MESSAGE);
            default ->
            {}
        }
    }//GEN-LAST:event_miCikisActionPerformed

    private void miKullanicilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKullanicilarActionPerformed
        F_KullaniciYonetimi ky=new F_KullaniciYonetimi();
        dpGYMHomePage.add(ky);
        ky.setVisible(true);
    }//GEN-LAST:event_miKullanicilarActionPerformed

    private void miCafeYonetimSistemiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCafeYonetimSistemiActionPerformed
        F_CafeYonetimSistemi cys=new F_CafeYonetimSistemi();
        dpGYMHomePage.add(cys);
        cys.setVisible(true);
    }//GEN-LAST:event_miCafeYonetimSistemiActionPerformed

    private void miUyelerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUyelerActionPerformed
        F_UyeYonetimi uy=new F_UyeYonetimi();
        dpGYMHomePage.add(uy);
        uy.setVisible(true);
    }//GEN-LAST:event_miUyelerActionPerformed

    private void miBranslarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBranslarActionPerformed
        F_Branslar b=new F_Branslar();
        dpGYMHomePage.add(b);
        b.setVisible(true);
    }//GEN-LAST:event_miBranslarActionPerformed

    private void miSalonMalzemeleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalonMalzemeleriActionPerformed
        F_SalonMalzemeleri sm=new F_SalonMalzemeleri();
        dpGYMHomePage.add(sm);
        sm.setVisible(true);
    }//GEN-LAST:event_miSalonMalzemeleriActionPerformed

    private void miCafeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCafeMenuActionPerformed
        F_CafeMenu cm=new F_CafeMenu();
        dpGYMHomePage.add(cm);
        cm.setVisible(true);
    }//GEN-LAST:event_miCafeMenuActionPerformed

    private void miMaliDurumlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMaliDurumlarActionPerformed
        F_MaliDurumlar md=new F_MaliDurumlar();
        dpGYMHomePage.add(md);
        md.setVisible(true);
    }//GEN-LAST:event_miMaliDurumlarActionPerformed

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
            java.util.logging.Logger.getLogger(F_ErtugrulKayaliGYM_HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_ErtugrulKayaliGYM_HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_ErtugrulKayaliGYM_HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_ErtugrulKayaliGYM_HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new F_KullaniciGirisKayit().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpGYMHomePage;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar jmiMenuCubugu;
    private javax.swing.JMenu mCafe;
    private javax.swing.JMenu mInsanKaynaklari;
    private javax.swing.JMenu mMuhasebe;
    private javax.swing.JMenu mSalon;
    private javax.swing.JMenu mUser;
    private javax.swing.JMenuItem miBranslar;
    private javax.swing.JMenuItem miCafeMenu;
    private javax.swing.JMenuItem miCafeYonetimSistemi;
    private javax.swing.JMenuItem miCikis;
    private javax.swing.JMenuItem miKullanicilar;
    private javax.swing.JMenuItem miMaliDurumlar;
    private javax.swing.JMenuItem miSalonMalzemeleri;
    private javax.swing.JMenuItem miSistemRolu;
    private javax.swing.JMenuItem miUyeler;
    private javax.swing.JPopupMenu.Separator sCafe;
    private javax.swing.JPopupMenu.Separator sInsanKaynaklari;
    private javax.swing.JPopupMenu.Separator sSalon;
    // End of variables declaration//GEN-END:variables
}