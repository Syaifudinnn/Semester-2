public class Dosen16 {

    //attribut
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    //konstruktor default
    public Dosen16() {

    }

    //konstruktor parameter
    public Dosen16(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    //method tampilInformasi
    public void tampilInformasi() {
        System.out.println("Kode Dosen : " + kode);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia : " + usia);
    }

}