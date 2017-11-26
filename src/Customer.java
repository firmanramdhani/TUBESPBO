
public class Customer extends Person {
    public String NoKTP;

    public Customer(String Nama, String JenisKelamin, int Umur, String NoKTP) {
        super(Nama, JenisKelamin, Umur);
        this.NoKTP = NoKTP;
    }
    
    public String getNoKTP() {
        return NoKTP;
    }
    
}
