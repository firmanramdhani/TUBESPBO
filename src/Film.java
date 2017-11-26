/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Devita
 */
public class Film {
    private String idFilm;
    private String judul;
    private int durasi;
    
    public Film(String idFilm, String judul, int durasi){
        this.idFilm = idFilm;
        this.judul=judul;
        this.durasi=durasi;
    }

    public String getJudul() {
        return judul;
    }

    public int getDurasi() {
        return durasi;
    }
    
}
