public class Dosen16 {

    //attribut
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    //method konstruktor
    public Dosen16() {

    }

    public Dosen16(String kd, String nm, boolean jk, int us){
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = us;
    }

    //method tampil data
    public void tampilData(){
        System.out.println("Kode\t : " + kode);
        System.out.println("Nama\t : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia\t : " + usia);
        System.out.println("-----------------------------");
    }

}