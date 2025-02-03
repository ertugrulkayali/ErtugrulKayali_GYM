package org.ertugrul.kayali.gym;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class F_Masalar extends javax.swing.JInternalFrame {

   DefaultTableModel tblAdisyonModel=new DefaultTableModel();
   
    public F_Masalar() {
        initComponents();
        
        this.setSize(686,574);
        
        txtTFYiyecek.setEnabled(false);
        txtTFIcecek.setEnabled(false);
        txtTFTatli.setEnabled(false);
        
        
        
        tblAdisyon.setModel(tblAdisyonModel);
        tblAdisyonModel.setColumnIdentifiers(new String [] {"ÜRÜN", "ADET", "T.FİYAT"});
    
        C_CafeMenuSQL.cm_PGBaglan();
        String yiyecekList="Select urunadi FROM public.table_cafemenu WHERE kategori='Yiyecek'";
        ResultSet cmbYiyecekRS=C_CafeMenuSQL.cm_listele(yiyecekList);
        try
        {
            while(cmbYiyecekRS.next())
            {
                cmbYiyecek.addItem(cmbYiyecekRS.getString("urunadi"));
            }
        }
        catch(SQLException ex)
        {
            
        }
        
        String icecekList="Select urunadi FROM public.table_cafemenu WHERE kategori='İçecek'";
        ResultSet cmbIcecekRS=C_CafeMenuSQL.cm_listele(icecekList);
        try
        {
            while(cmbIcecekRS.next())
            {
                cmbIcecek.addItem(cmbIcecekRS.getString("urunadi"));
            }
        }
        catch(SQLException ex)
        {
            
        }
        
        String tatliList="Select urunadi FROM public.table_cafemenu WHERE kategori='Tatlı'";
        ResultSet cmbTatliRS=C_CafeMenuSQL.cm_listele(tatliList);
        try
        {
            while(cmbTatliRS.next())
            {
                cmbTatli.addItem(cmbTatliRS.getString("urunadi"));
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
        pnlTable = new javax.swing.JPanel();
        spTable = new javax.swing.JScrollPane();
        tblAdisyon = new javax.swing.JTable();
        pnlRight = new javax.swing.JPanel();
        sptxtAdisyon = new javax.swing.JScrollPane();
        txtAdisyon = new javax.swing.JTextArea();
        pnlLeft = new javax.swing.JPanel();
        btnIHesap = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnTHesap = new javax.swing.JButton();
        btnAdisyon = new javax.swing.JButton();
        btnYHesap = new javax.swing.JButton();
        pnlTop = new javax.swing.JPanel();
        btnToplam = new javax.swing.JButton();
        lblToplamFiyat = new javax.swing.JLabel();
        lblToplam = new javax.swing.JLabel();
        lblTL = new javax.swing.JLabel();
        btnIEkle = new javax.swing.JButton();
        btnTEkle = new javax.swing.JButton();
        btnYEkle = new javax.swing.JButton();
        pnlDown = new javax.swing.JPanel();
        lblYiyecek = new javax.swing.JLabel();
        lblIcecek = new javax.swing.JLabel();
        lblTatli = new javax.swing.JLabel();
        cmbYiyecek = new javax.swing.JComboBox<>();
        cmbTatli = new javax.swing.JComboBox<>();
        cmbIcecek = new javax.swing.JComboBox<>();
        lblYAdet = new javax.swing.JLabel();
        lblIAdet = new javax.swing.JLabel();
        lblTAdet = new javax.swing.JLabel();
        lblTFTatli = new javax.swing.JLabel();
        lblTire2 = new javax.swing.JLabel();
        lblTire3 = new javax.swing.JLabel();
        lblTire4 = new javax.swing.JLabel();
        lblTire5 = new javax.swing.JLabel();
        lblTire6 = new javax.swing.JLabel();
        lblTire1 = new javax.swing.JLabel();
        txtTFTatli = new javax.swing.JTextField();
        lblTFYiyecek = new javax.swing.JLabel();
        lblTFIcecek = new javax.swing.JLabel();
        txtTFYiyecek = new javax.swing.JTextField();
        txtTFIcecek = new javax.swing.JTextField();
        txtYAdet = new javax.swing.JTextField();
        txtIAdet = new javax.swing.JTextField();
        txtTAdet = new javax.swing.JTextField();

        setIconifiable(true);
        getContentPane().setLayout(new java.awt.BorderLayout());

        pnlCenter.setBackground(new java.awt.Color(0, 0, 0));
        pnlCenter.setLayout(new java.awt.BorderLayout());

        pnlTable.setBackground(new java.awt.Color(255, 255, 255));
        pnlTable.setLayout(new java.awt.BorderLayout());

        spTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spTableMouseClicked(evt);
            }
        });

        tblAdisyon.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        tblAdisyon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ÜRÜN", "ADET", "T.FİYAT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAdisyon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdisyonMouseClicked(evt);
            }
        });
        spTable.setViewportView(tblAdisyon);

        pnlTable.add(spTable, java.awt.BorderLayout.CENTER);

        pnlCenter.add(pnlTable, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        pnlRight.setBackground(new java.awt.Color(0, 0, 0));

        txtAdisyon.setBackground(new java.awt.Color(0, 0, 0));
        txtAdisyon.setColumns(20);
        txtAdisyon.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        txtAdisyon.setForeground(new java.awt.Color(255, 255, 255));
        txtAdisyon.setRows(5);
        sptxtAdisyon.setViewportView(txtAdisyon);

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sptxtAdisyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sptxtAdisyon, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlRight, java.awt.BorderLayout.LINE_END);

        pnlLeft.setBackground(new java.awt.Color(0, 0, 0));

        btnIHesap.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnIHesap.setText("İ-HESAP");
        btnIHesap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIHesapActionPerformed(evt);
            }
        });

        btnSil.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnSil.setText("SEÇİLENİ SİL");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        btnTHesap.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnTHesap.setText("T-HESAP");
        btnTHesap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTHesapActionPerformed(evt);
            }
        });

        btnAdisyon.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnAdisyon.setText("ADİSYON");
        btnAdisyon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdisyonActionPerformed(evt);
            }
        });

        btnYHesap.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnYHesap.setText("Y-HESAP");
        btnYHesap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYHesapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIHesap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTHesap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdisyon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnYHesap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdisyon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnYHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(pnlLeft, java.awt.BorderLayout.LINE_START);

        pnlTop.setBackground(new java.awt.Color(204, 153, 255));

        btnToplam.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnToplam.setText("TOPLAM");
        btnToplam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToplamActionPerformed(evt);
            }
        });

        lblToplamFiyat.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblToplamFiyat.setText("Toplam Fiyat:");

        lblToplam.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblToplam.setText("0");

        lblTL.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblTL.setText("TL");

        btnIEkle.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnIEkle.setText("İ-EKLE");
        btnIEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIEkleActionPerformed(evt);
            }
        });

        btnTEkle.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnTEkle.setText("T-EKLE");
        btnTEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTEkleActionPerformed(evt);
            }
        });

        btnYEkle.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnYEkle.setText("Y-EKLE");
        btnYEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTopLayout.createSequentialGroup()
                        .addComponent(lblToplamFiyat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblToplam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTL))
                    .addComponent(btnToplam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(btnYEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                        .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblToplamFiyat)
                            .addComponent(lblToplam)
                            .addComponent(lblTL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnToplam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                        .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnYEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );

        getContentPane().add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlDown.setBackground(new java.awt.Color(204, 153, 255));
        pnlDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblYiyecek.setFont(new java.awt.Font("Arial Black", 1, 8)); // NOI18N
        lblYiyecek.setText("YİYECEK:");
        pnlDown.add(lblYiyecek, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        lblIcecek.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblIcecek.setText("İÇECEK:");
        pnlDown.add(lblIcecek, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        lblTatli.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblTatli.setText("TATLI:");
        pnlDown.add(lblTatli, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        cmbYiyecek.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        pnlDown.add(cmbYiyecek, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, -1));

        cmbTatli.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        pnlDown.add(cmbTatli, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 150, -1));

        cmbIcecek.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        pnlDown.add(cmbIcecek, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 150, -1));

        lblYAdet.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblYAdet.setText("Y-Adet:");
        pnlDown.add(lblYAdet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        lblIAdet.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblIAdet.setText("İ-Adet:");
        pnlDown.add(lblIAdet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        lblTAdet.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblTAdet.setText("T-Adet:");
        pnlDown.add(lblTAdet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        lblTFTatli.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblTFTatli.setText("Toplam Fiyat:");
        pnlDown.add(lblTFTatli, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        lblTire2.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblTire2.setText("---");
        pnlDown.add(lblTire2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        lblTire3.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblTire3.setText("---");
        pnlDown.add(lblTire3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        lblTire4.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblTire4.setText("---");
        pnlDown.add(lblTire4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        lblTire5.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblTire5.setText("---");
        pnlDown.add(lblTire5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        lblTire6.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblTire6.setText("---");
        pnlDown.add(lblTire6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        lblTire1.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblTire1.setText("---");
        pnlDown.add(lblTire1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        txtTFTatli.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        pnlDown.add(txtTFTatli, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 110, -1));

        lblTFYiyecek.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblTFYiyecek.setText("Toplam Fiyat:");
        pnlDown.add(lblTFYiyecek, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        lblTFIcecek.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblTFIcecek.setText("Toplam Fiyat:");
        pnlDown.add(lblTFIcecek, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        txtTFYiyecek.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        pnlDown.add(txtTFYiyecek, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 110, -1));

        txtTFIcecek.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        pnlDown.add(txtTFIcecek, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 110, -1));

        txtYAdet.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        txtYAdet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtYAdetKeyTyped(evt);
            }
        });
        pnlDown.add(txtYAdet, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 150, -1));

        txtIAdet.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        txtIAdet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIAdetKeyTyped(evt);
            }
        });
        pnlDown.add(txtIAdet, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 150, -1));

        txtTAdet.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        txtTAdet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTAdetKeyTyped(evt);
            }
        });
        pnlDown.add(txtTAdet, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 150, -1));

        getContentPane().add(pnlDown, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnYEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYEkleActionPerformed
        tblAdisyonModel.addRow(new String [] {String.valueOf(cmbYiyecek.getSelectedItem()), txtYAdet.getText(), String.valueOf(txtTFYiyecek.getText())});
    }//GEN-LAST:event_btnYEkleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        tblAdisyonModel.removeRow(tblAdisyon.getSelectedRow());
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnIEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIEkleActionPerformed
        tblAdisyonModel.addRow(new String[] {String.valueOf(cmbIcecek.getSelectedItem()), txtIAdet.getText(), String.valueOf(txtTFIcecek.getText())});
    }//GEN-LAST:event_btnIEkleActionPerformed

    private void btnTEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTEkleActionPerformed
        tblAdisyonModel.addRow(new String [] {String.valueOf(cmbTatli.getSelectedItem()), txtTAdet.getText(), String.valueOf(txtTFTatli.getText())});
    }//GEN-LAST:event_btnTEkleActionPerformed

    private void btnYHesapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYHesapActionPerformed
        C_CafeMenuSQL.cm_PGBaglan();
        String yiyecekFiyatGetir="Select urunfiyati * '"+ Integer.parseInt(txtYAdet.getText()) +"' as yiyecekFiyat from public.table_cafemenu WHERE urunadi='"+ String.valueOf(cmbYiyecek.getSelectedItem()) +"'";
        ResultSet yiyecekFiyatGetirRS=C_CafeMenuSQL.cm_listele(yiyecekFiyatGetir);
        try
        {
            while(yiyecekFiyatGetirRS.next())
            {
                txtTFYiyecek.setText(String.valueOf(yiyecekFiyatGetirRS.getInt("yiyecekFiyat")));
            }
        }
        catch(SQLException ex)
        {
            
        }
       
    }//GEN-LAST:event_btnYHesapActionPerformed

    private void btnIHesapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIHesapActionPerformed
        C_CafeMenuSQL.cm_PGBaglan();
        String icecekFiyatGetir="Select urunfiyati * '"+ Integer.parseInt(txtIAdet.getText()) +"' as icecekFiyat from public.table_cafemenu WHERE urunadi='"+ String.valueOf(cmbIcecek.getSelectedItem()) +"'";
        ResultSet icecekFiyatGetirRS=C_CafeMenuSQL.cm_listele(icecekFiyatGetir);
        try
        {
            while(icecekFiyatGetirRS.next())
            {
                txtTFIcecek.setText(String.valueOf(icecekFiyatGetirRS.getInt("icecekFiyat")));
            }
            
        }
        catch(SQLException ex)
        {
            
        }
    }//GEN-LAST:event_btnIHesapActionPerformed

    private void btnTHesapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHesapActionPerformed
        C_CafeMenuSQL.cm_PGBaglan();
        String tatliFiyatGetir="Select urunfiyati * '"+ Integer.parseInt(txtTAdet.getText()) +"' as tatliFiyat from public.table_cafemenu WHERE urunadi='"+ String.valueOf(cmbTatli.getSelectedItem()) +"'";
        ResultSet tatliFiyatGetirRS=C_CafeMenuSQL.cm_listele(tatliFiyatGetir);
        try
        {
            while(tatliFiyatGetirRS.next())
            {
                txtTFTatli.setText(String.valueOf(tatliFiyatGetirRS.getInt("tatliFiyat")));
            }
        }
        catch(SQLException ex)
        {
            
        }
    }//GEN-LAST:event_btnTHesapActionPerformed

    private void txtYAdetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYAdetKeyTyped
        char yiyecekAdetKisitlama=evt.getKeyChar();
        if(((yiyecekAdetKisitlama<'0') || (yiyecekAdetKisitlama>'9')) && (yiyecekAdetKisitlama!='\b')){
            evt.consume();
        }
        if(txtYAdet.getText().length()<3)
        {
            
        }
        else if((txtYAdet.getText()+evt.getKeyChar()).length()>3)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtYAdetKeyTyped

    private void txtIAdetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIAdetKeyTyped
        char icecekAdetKisitlama=evt.getKeyChar();
        if(((icecekAdetKisitlama<'0') || (icecekAdetKisitlama>'9')) && (icecekAdetKisitlama!='\b'))
        {
            evt.consume();
        }
        if(txtIAdet.getText().length()<3)
        {
            
        }
        else if((txtIAdet.getText()+evt.getKeyChar()).length()>3)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtIAdetKeyTyped

    private void txtTAdetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTAdetKeyTyped
        char tatliAdetKisitlama=evt.getKeyChar();
        if(((tatliAdetKisitlama<'0') || (tatliAdetKisitlama>'9')) && (tatliAdetKisitlama!='\b'))
        {
            evt.consume();
        }
        if(txtTAdet.getText().length()<3)
        {
            
        }
        else if((txtTAdet.getText()+evt.getKeyChar()).length()>3)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtTAdetKeyTyped

    private void btnToplamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToplamActionPerformed
        
    }//GEN-LAST:event_btnToplamActionPerformed

    private void spTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_spTableMouseClicked

    private void tblAdisyonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdisyonMouseClicked
        
    }//GEN-LAST:event_tblAdisyonMouseClicked

    private void btnAdisyonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdisyonActionPerformed
        DateFormat adisyonTarihSaat = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        Date tarihSaat = new Date();
        txtAdisyon.setText("        Ertugrul Kayali GYM Cafe" + "\n" + "                         ANKARA" + "\n" +
                           "============================" + "\n" +
                           "T/S: " + String.valueOf(adisyonTarihSaat.format(tarihSaat)) + "\n" +
                           "============================" + "\n" + "                        ADİSYON" + "\n"  
                );
    }//GEN-LAST:event_btnAdisyonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdisyon;
    private javax.swing.JButton btnIEkle;
    private javax.swing.JButton btnIHesap;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTEkle;
    private javax.swing.JButton btnTHesap;
    private javax.swing.JButton btnToplam;
    private javax.swing.JButton btnYEkle;
    private javax.swing.JButton btnYHesap;
    private javax.swing.JComboBox<String> cmbIcecek;
    private javax.swing.JComboBox<String> cmbTatli;
    private javax.swing.JComboBox<String> cmbYiyecek;
    private javax.swing.JLabel lblIAdet;
    private javax.swing.JLabel lblIcecek;
    private javax.swing.JLabel lblTAdet;
    private javax.swing.JLabel lblTFIcecek;
    private javax.swing.JLabel lblTFTatli;
    private javax.swing.JLabel lblTFYiyecek;
    private javax.swing.JLabel lblTL;
    private javax.swing.JLabel lblTatli;
    private javax.swing.JLabel lblTire1;
    private javax.swing.JLabel lblTire2;
    private javax.swing.JLabel lblTire3;
    private javax.swing.JLabel lblTire4;
    private javax.swing.JLabel lblTire5;
    private javax.swing.JLabel lblTire6;
    private javax.swing.JLabel lblToplam;
    private javax.swing.JLabel lblToplamFiyat;
    private javax.swing.JLabel lblYAdet;
    private javax.swing.JLabel lblYiyecek;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlDown;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlTable;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JScrollPane sptxtAdisyon;
    private javax.swing.JTable tblAdisyon;
    private javax.swing.JTextArea txtAdisyon;
    private javax.swing.JTextField txtIAdet;
    private javax.swing.JTextField txtTAdet;
    private javax.swing.JTextField txtTFIcecek;
    private javax.swing.JTextField txtTFTatli;
    private javax.swing.JTextField txtTFYiyecek;
    private javax.swing.JTextField txtYAdet;
    // End of variables declaration//GEN-END:variables
}
