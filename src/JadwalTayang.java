
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bakikuck
 */
public class JadwalTayang {
    private String idJadwalTayang;
    private Date tayang= new Date();
    private double harga;
    private int i;
    private Film[] detailFilm;
    private Teater[] detailTeater;

    public void setTayang(Date waktu) {
        this.tayang = waktu;
    }

    public Date getTayang() {
        return tayang;
    }
    public void addFilm(Film detailFilm){
        this.detailFilm[i]=detailFilm;
        this.i=i+1;
    }
    public Film getFilm(int n) {
        return this.detailFilm[n];
    }
    public void addTeater(Teater detailTeater){
        this.detailTeater[i]=detailTeater;
        this.i=i+1;
    }

    public Teater getTeater(int n) {
        return this.detailTeater[n];
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double getHarga() {
        return harga;
    }
}
