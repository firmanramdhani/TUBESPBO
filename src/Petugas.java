
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bakikuck
 */
public class Petugas extends Person{
    
    private String IdPetugas;
    private double gaji;
    private int jumlahTransaksi;
    private List<Transaksi> dataTransaksi = new ArrayList<>();
    
    public Petugas(String nama, String jenisKelamin, int umur, String Id){
        super(nama,jenisKelamin,umur);
        this.IdPetugas = Id;
    }

    public String getId() {
        return IdPetugas;
    }

    public double getGaji() {
        return gaji;
    }

    public void addTransaksi(Transaksi t){
        dataTransaksi.add(t);
        
    }
    public Transaksi getTransaksi( int i){
        return dataTransaksi.get(i);
    }
    
    @Override
    public String getNama(){
        return super.getNama();
    }
    public void setGaji( int gaji){
       this.gaji = gaji; 
    }
    
    
    
    
}
