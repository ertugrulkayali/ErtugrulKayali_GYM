package org.ertugrul.kayali.gym;

import java.sql.*;
import javax.swing.JOptionPane;

/*
    @Author ErtugrulKayali
    --TAMAMLANDI--
*/

public class C_SalonMalzemeleriSQL
{
    static String url_pgsql="jdbc:postgresql://localhost:5432/DB_ErtugrulKayaliGYM";
    static Connection dbcn=null;
    
    static ResultSet sm_PGBaglan()
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
    
    static ResultSet sm_listele(String sm_list)
    {
        try
        {
            Statement sm_listeleST=dbcn.createStatement();
            ResultSet sm_listeleRS=sm_listeleST.executeQuery(sm_list);
            return sm_listeleRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet sm_ekle(String smadi, int smadet, String kullanilanbrans, String islemyapan, String islemturu)
    {
        PreparedStatement sm_ekleST;
        try
        {
            sm_ekleST=dbcn.prepareStatement("Insert INTO public.table_sm (smadi, smadet, kullanilanbrans, islemyapan, islemturu) values (?,?,?,?,?)");
            sm_ekleST.setString(1, smadi);
            sm_ekleST.setInt(2, smadet);
            sm_ekleST.setString(3, kullanilanbrans);
            sm_ekleST.setString(4, islemyapan);
            sm_ekleST.setString(5, islemturu);
            sm_ekleST.executeUpdate();
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet sm_sil(String sm_delete)
    {
        Statement sm_silST;
        try{
            sm_silST=dbcn.createStatement();
            ResultSet sm_silRS=sm_silST.executeQuery(sm_delete);
            return sm_silRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet sm_guncelle(String sm_update)
    {
        Statement sm_guncelleST;
        try
        {
            sm_guncelleST=dbcn.createStatement();
            ResultSet sm_guncelleRS=sm_guncelleST.executeQuery(sm_update);
            return sm_guncelleRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
}