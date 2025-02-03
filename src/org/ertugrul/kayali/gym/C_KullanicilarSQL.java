package org.ertugrul.kayali.gym;

import java.sql.*;
import javax.swing.JOptionPane;

/*
    @Author ErtugrulKayali
    --TAMAMLANDI--
*/

public class C_KullanicilarSQL
{
    static String url_pgsql="jdbc:postgresql://localhost:5432/DB_ErtugrulKayaliGYM";
    static Connection dbcn=null;
    
    static ResultSet k_PGBaglan()
    {
        try
        {
            dbcn=DriverManager.getConnection(url_pgsql,"postgres","ErtugrulKayali48");
            return null;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Veri Tabanı Bağlantısı Başarısız Oldu", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    static ResultSet k_listele(String k_list)
    {
        try
        {
            Statement k_listeleST=dbcn.createStatement();
            ResultSet k_listeleRS=k_listeleST.executeQuery(k_list);
            return k_listeleRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet k_ekle(String KullaniciAdi, String KullaniciSifresi, String Ad, String Soyad, String TcKimlikNo, String TelefonNumarasi, String EmailAdresi, String SistemRolu, Date KayitTarihi, String OnayDurumu)
    {
        PreparedStatement k_ekleST;
        try
        {
            k_ekleST=dbcn.prepareStatement("Insert INTO public.table_kullanicilar (kullaniciadi, kullanicisifresi, ad, soyad, tckimlikno, telefonnumarasi, emailadresi, sistemrolu, kayittarihi, onaydurumu) values (?,?,?,?,?,?,?,?,?,?)");
            k_ekleST.setString(1, KullaniciAdi);
            k_ekleST.setString(2, KullaniciSifresi);
            k_ekleST.setString(3, Ad);
            k_ekleST.setString(4, Soyad);
            k_ekleST.setString(5, TcKimlikNo);
            k_ekleST.setString(6, TelefonNumarasi);
            k_ekleST.setString(7, EmailAdresi);
            k_ekleST.setString(8, SistemRolu);
            k_ekleST.setDate(9, KayitTarihi);
            k_ekleST.setString(10, OnayDurumu);
            k_ekleST.executeUpdate();
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet k_sil(String k_delete)
    {
        Statement k_silST;
        try
        {
            k_silST=dbcn.createStatement();
            ResultSet k_silRS=k_silST.executeQuery(k_delete);
            return k_silRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet k_guncelle(String k_update)
    {
        Statement k_guncelleST;
        try
        {
            k_guncelleST=dbcn.createStatement();
            ResultSet k_guncelleRS=k_guncelleST.executeQuery(k_update);
            return k_guncelleRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
}