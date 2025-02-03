package org.ertugrul.kayali.gym;

import java.sql.*;
import javax.swing.JOptionPane;

/*
    @Author ErtugrulKayali
    --TAMAMLANDI--
*/

public class C_CafeMenuSQL
{
    static String url_pgsql="jdbc:postgresql://localhost:5432/DB_ErtugrulKayaliGYM";
    static Connection dbcn=null;
    
    static ResultSet cm_PGBaglan()
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
    
    static ResultSet cm_listele(String cm_list)
    {
        try
        {
            Statement cm_listeleST=dbcn.createStatement();
            ResultSet cm_listeleRS=cm_listeleST.executeQuery(cm_list);
            return cm_listeleRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet cm_ekle(String urunadi, String kategori, int urunfiyati)
    {
        PreparedStatement cm_ekleST;
        try
        {
            cm_ekleST=dbcn.prepareStatement("Insert INTO public.table_cafemenu (urunadi, kategori, urunfiyati) values (?,?,?)");
            cm_ekleST.setString(1, urunadi);
            cm_ekleST.setString(2, kategori);
            cm_ekleST.setInt(3, urunfiyati);
            cm_ekleST.executeUpdate();
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet cm_sil(String cm_delete)
    {
        Statement cm_silST;
        try
        {
            cm_silST=dbcn.createStatement();
            ResultSet cm_silRS=cm_silST.executeQuery(cm_delete);
            return cm_silRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet cm_guncelle(String cm_update)
    {
        Statement cm_guncelleST;
        try
        {
            cm_guncelleST=dbcn.createStatement();
            ResultSet cm_guncelleRS=cm_guncelleST.executeQuery(cm_update);
            return cm_guncelleRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
}