
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CalisanIslemleri {

    private java.sql.Connection con = null;

    private Statement statement = null;
    private PreparedStatement ps = null;

    public boolean girisYap(String kullanici_adi, String parola) {
        String sorgu = "Select * From adminler where username = ? and password = ?";

        try {
            ps = con.prepareStatement(sorgu);

            ps.setString(1, kullanici_adi);
            ps.setString(2, parola);

            ResultSet rs = ps.executeQuery();

            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public ArrayList<Calisan> calisanlariGetir() {

        ArrayList<Calisan> cikti = new ArrayList<Calisan>();

        try {
            statement = con.createStatement();
            String sorgu = "Select * From calisanlar";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String dept = rs.getString("departman");
                String maas = rs.getString("maas");

                cikti.add(new Calisan(id, ad, soyad, dept, maas));

            }
            return cikti;

        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }

    }

    public void calisanEkle(String ad, String soyad, String departman, String maas) {
        String sorgu = "Insert Into calisanlar(ad,soyad,departman,maas) Values(?,?,?,?)";
        try {

            ps = con.prepareStatement(sorgu);

            ps.setString(1, ad);
            ps.setString(2, soyad);
            ps.setString(3, departman);
            ps.setString(4, maas);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calisanSil(int id){
        String sorgu = "Delete from calisanlar where id = ?";
        
        try {
            ps = con.prepareStatement(sorgu);
            
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calisanGuncelle(int id,String yeni_ad, String yeni_soyad, String yeni_departman, String yeni_maas){
        String sorgu = "Update calisanlar set ad = ? , soyad = ? , departman = ? , maas = ? where id = ?";
    
        try {
            ps = con.prepareStatement(sorgu);
            
            ps.setString(1, yeni_ad);
            ps.setString(2, yeni_soyad);
            ps.setString(3, yeni_departman);
            ps.setString(4, yeni_maas);
            
            ps.setInt(5, id);
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public CalisanIslemleri() {
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_name + "?useUnicode=true&characterEncoding=utf8";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Bulundu");

        } catch (ClassNotFoundException ex) {

            System.out.println("Driver Bulunamadý...");

        }

        try {

            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.pass);

            System.out.println("Baðlantý baþarýlý.");

        } catch (SQLException ex) {

            //System.out.println("Baðlantý Baþarýsýz.");
            ex.printStackTrace();

        }
    }

}
