
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
public class Teater {
    private int noTeater;
    private List<Kursi> listKursi = new ArrayList<>();
    
    public void setNoTeater(int no){
        this.noTeater = no;
    }
    public int getNoTeater(){
        return noTeater;
    }
    public void addKursi(String noKursi){
        Kursi K = new Kursi(noKursi);
        listKursi.add(K);
    }
    public Kursi getKursi(int no){
        return listKursi.get(no);
    }
    
    
}
