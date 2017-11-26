/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bakikuck
 */
public class Kursi {
    private String noKursi;
    private boolean isi;

    public Kursi(String noKursi) {
        this.noKursi = noKursi;
    }

    public String getNoKursi() {
        return noKursi;
    }

    public boolean isIsi() {
        return isi;
    }
    public void addIsi(boolean b){
        this.isi = b;
    }
    
}
