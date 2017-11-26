
import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman Ramdhani
 */
public class Database {
   private Statement stmt = null;
   private Connection c = null;
   private ResultSet rs = null;


public void buatKoneksi(){
        try {
            
            c = DriverManager.getConnection("jdbc:mysql://localhost/tubes_pbo","root","");
            stmt = c.createStatement();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        
        }
}

public ArrayList<Film> getListFilm(){
       try{
        ArrayList<Film> listFilm  = new ArrayList<>();
        buatKoneksi();
        String q ="select idFilm, judulFilm, durasiFilm from FILM";
        stmt = c.createStatement();
        rs = stmt.executeQuery(q);
            while(rs.next()){
                Film F = new Film(rs.getString("idFilm"),rs.getString("judulFilm"),Integer.parseInt(rs.getString("durasiFilm")));
                listFilm.add(F);
            }
         return listFilm;
    }catch(SQLException ex){
        ex.printStackTrace();
        return null;
    
    }


}
}