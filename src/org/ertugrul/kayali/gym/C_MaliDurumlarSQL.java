
package org.ertugrul.kayali.gym;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ertugrul's-notebook
 */
public class C_MaliDurumlarSQL {
    static String url_pgsql="jdbc:postgresql://localhost:5432/DB_ErtugrulKayaliGYM";
    static Connection dbcn=null;
    
    static ResultSet md_PGBaglan()
    {
        try
        {
            dbcn=DriverManager.getConnection(url_pgsql, "postgres", "ErtugrulKayali48");
            return null;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Veri Tabanı Bağlantısı Başarısız Oldu", JOptionPane.ERROR_MESSAGE);
        
        }
        return null;
    }
    
    static ResultSet md_listele(String md_list)
    {
        try
        {
            Statement md_listeleST=dbcn.createStatement();
            ResultSet md_listeleRS=md_listeleST.executeQuery(md_list);
            return md_listeleRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet md_ekle(String urunadi, int urunfiyati, String alissatis, String urundurumu, Date islemtarihi, String islemyapan, int uyeborcu)
    {
        PreparedStatement md_ekleST;
        try
        {
            md_ekleST=dbcn.prepareStatement("Insert INTO public.table_malidurumlar (urunadi, urunfiyati, alissatis, urundurumu, islemtarihi, islemyapan, uyeborcu) values (?,?,?,?,?,?,?) ");
            md_ekleST.setString(1, urunadi);
            md_ekleST.setInt(2, urunfiyati);
            md_ekleST.setString(3, alissatis);
            md_ekleST.setString(4, urundurumu);
            md_ekleST.setDate(5, islemtarihi);
            md_ekleST.setString(6, islemyapan);
            md_ekleST.setInt(7, uyeborcu);
            md_ekleST.executeUpdate();
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet md_sil(String md_delete)
    {
        Statement md_silST;
        try
        {
            md_silST=dbcn.createStatement();
            ResultSet md_silRS=md_silST.executeQuery(md_delete);
            return md_silRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet md_guncelle(String md_update)
    {
        Statement md_guncelleST;
        try
        {
            md_guncelleST=dbcn.createStatement();
            ResultSet md_guncelleRS=md_guncelleST.executeQuery(md_update);
            return md_guncelleRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
}
