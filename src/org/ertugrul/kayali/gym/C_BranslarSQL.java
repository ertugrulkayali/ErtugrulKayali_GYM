package org.ertugrul.kayali.gym;

import java.sql.*;
import javax.swing.JOptionPane;

/*
    @Author ErtugrulKayali
    --TAMAMLANDI
*/

public class C_BranslarSQL
{
    static String url_pgsql="jdbc:postgresql://localhost:5432/DB_ErtugrulKayaliGYM";
    static Connection dbcn=null;
    
    static ResultSet b_PGBaglan()
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
    
    static ResultSet b_listele(String b_list)
    {
        try
        {
            Statement b_listeleST=dbcn.createStatement();
            ResultSet b_listeleRS=b_listeleST.executeQuery(b_list);
            return b_listeleRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet b_ekle(String bransadi, int bransucreti, int kayitlisayisi)
    {
        PreparedStatement b_ekleST;
        try
        {
            b_ekleST=dbcn.prepareStatement("Insert INTO public.table_branslar (bransadi, bransucreti, kayitlisayisi) values (?,?,?)");
            b_ekleST.setString(1, bransadi);
            b_ekleST.setInt(2, bransucreti);
            b_ekleST.setInt(3, kayitlisayisi);
            b_ekleST.executeUpdate();
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet b_sil(String b_delete)
    {
        Statement b_silST;
        try
        {
            b_silST=dbcn.createStatement();
            ResultSet b_silRS=b_silST.executeQuery(b_delete);
            return b_silRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
    
    static ResultSet b_guncelle(String b_update)
    {
        Statement b_guncelleST;
        try
        {
            b_guncelleST=dbcn.createStatement();
            ResultSet b_guncelleRS=b_guncelleST.executeQuery(b_update);
            return b_guncelleRS;
        }
        catch(SQLException ex)
        {
            
        }
        return null;
    }
}