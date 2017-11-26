
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
public class Transaksi {
    private String idTransaksi;
    private Date hariTanggal;
    private Petugas dataPetugas;
    private Customer dataCustomer;
    private JadwalTayang dataTayang;
    private Kursi kursi;
    private Teater teater;
    
    public void setHariTanggal (Date waktu){
        this.hariTanggal = waktu;
    }
    public Date getHariTanggal(){
        return hariTanggal;
    }
    public void addPetugas(Petugas P){
        this.dataPetugas=P;
    }
    public Petugas getPetugas(){
        return dataPetugas;
    }
    public void addCustomer(Customer C){
        this.dataCustomer = C;
    }
    public Customer getCustomer(){
        return dataCustomer;
    }
    public void addTayang(JadwalTayang J){
        this.dataTayang=J;
    }
    public JadwalTayang getTayang(){
        return dataTayang;
    }
    public void addKursi(Kursi K){
        K.addIsi(Boolean.TRUE);
        this.kursi=K;
    }
    public Kursi getKursi(){
        return kursi;
    }
    public void addTeater(Teater T){
        this.teater=T;
    }
    public Teater getTeater(){
        return teater;
    }
}
