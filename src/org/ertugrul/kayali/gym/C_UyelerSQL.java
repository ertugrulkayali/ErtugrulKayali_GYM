package org.ertugrul.kayali.gym;

import java.sql.*;
import javax.swing.JOptionPane;

/*
    @Author ErtugrulKayali
    --TAMAMLANDI--
*/

public class C_UyelerSQL
{
    static String url_pgsql="jdbc:postgresql://localhost:5432/DB_ErtugrulKayaliGYM";
    static Connection dbcn=null;
    
    static ResultSet u_PGBaglan()
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
    
    static ResultSet u_listele(String u_list)
    {
        try
        {
            Statement u_listeleST=dbcn.createStatement();
            ResultSet u_listeleRS=u_listeleST.executeQuery(u_list);
            return u_listeleRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet u_ekle(String tcKimlikNo, String adi, String soyadi, String telefonNo, String evAdresi, Date dogumTarihi, String bransi, int kayitSuresiAy, int toplamUcret, Date kayitTarihi, String islemYapan, String islemAdi)
    {
        PreparedStatement u_ekleST;
        try
        {
            u_ekleST=dbcn.prepareStatement("Insert INTO public.table_uyeler (tckimlikno, adi, soyadi, telefonno, evadresi, dogumtarihi, bransi, kayitsuresiay, toplamucret, kayittarihi, islemyapan, islemadi) values (?,?,?,?,?,?,?,?,?,?,?,?)");
            u_ekleST.setString(1, tcKimlikNo);
            u_ekleST.setString(2, adi);
            u_ekleST.setString(3, soyadi);
            u_ekleST.setString(4, telefonNo);
            u_ekleST.setString(5, evAdresi);
            u_ekleST.setDate(6, dogumTarihi);
            u_ekleST.setString(7, bransi);
            u_ekleST.setInt(8, kayitSuresiAy);
            u_ekleST.setInt(9, toplamUcret);
            u_ekleST.setDate(10, kayitTarihi);
            u_ekleST.setString(11, islemYapan);
            u_ekleST.setString(12, islemAdi);
            u_ekleST.executeUpdate();
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet u_sil(String u_delete)
    {
        Statement u_silST;
        try
        {
            u_silST=dbcn.createStatement();
            ResultSet u_silRS=u_silST.executeQuery(u_delete);
            return u_silRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet u_guncelle(String u_update)
    {
        Statement u_guncelleST;
        try
        {
            u_guncelleST=dbcn.createStatement();
            ResultSet u_guncelleRS=u_guncelleST.executeQuery(u_update);
            return u_guncelleRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
}