package Queue;

/**
 *
 * @author BAP
 */
class NamaProduk {
    
    private int id;
    private String Nama;
    private float  Harga;
    
public NamaProduk(int id, String Nama, float Harga){
    this.id = id;
    this.Nama =Nama;
    this.Harga =Harga;
    }

public int getId(){
    return id;
}

public void setid(int id){
    this.id = id;
}

public String getNama(){
    return Nama;
}

public void setNama(String Nama){
    this.Nama = Nama;
}

public float getHarga(){
    return Harga;
}

public void setHarga(float Harga){
    this.Harga = Harga;
}

@Override
public String toString(){ 
    return "NamaProduk{" +
            "id=" + id +
            ",Nama='" + Nama + '\'' +
            ",Harga=" + Harga + '\'' +
            '}';
            
}
}


