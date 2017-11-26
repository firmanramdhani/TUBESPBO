
public class Person {
    public String Nama;
    public String JenisKelamin;
    public int Umur;
        
    public Person (String Nama, String JenisKelamin, int Umur) {
        this.Nama = Nama;
        this.JenisKelamin = JenisKelamin;
        this.Umur = Umur; 
    }
    
    public String getNama() {
        return Nama;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public int getUmur() {
        return Umur;
    }
}
