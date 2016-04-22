package lap4encapsul;
public class book {

    
    private String nama, jurusan, hp, email;
    static int tamu=0;
    static final String fakultas="Fakultas Ilmu Komputer";
    
    public book (String a, String b, String c){
        this.nama=a;
        this.jurusan=b;
        this.hp=c;
        tamu++;
    }
    public static int idTamu(){
        return tamu;
    }
    public String getNama() {
        return nama;
    }
    public String getJurusan() {
        return jurusan;
    }
    public String getHP() {
        return hp;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public void setHP(String hp) {
        this.hp = hp;
    }
    public void DisplayMessages(){
        System.out.println("============ Buku Alamat ============");
        System.out.println("Nama      : "+getNama());
        System.out.println("No.HP     : "+getHP());
        System.out.println("Jurusan   : "+getJurusan());
        System.out.println("Fakultas  : "+book.fakultas);
        System.out.println("=====================================");
    }    
}
