public class MataKuliah16 {

    //attribut
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    //method konstruktor
    public MataKuliah16(){

    }

    public MataKuliah16(String kd, String nm, int sk, int jm) {
        kode = kd;
        nama = nm;
        sks = sk;
        jumlahJam = jm;
    }

    //method tambah data
    public void tambahData(String kd, String nm, int sk, int jm) {
        kode = kd;
        nama = nm;
        sks = sk;
        jumlahJam = jm;
    }

    //method cetak info
    public void cetakInfo() {
        System.out.println("Kode\t : " + kode);
        System.out.println("Nama\t : " + nama);
        System.out.println("SKS\t : " + sks);
        System.out.println("Jam\t : " + jumlahJam);
        System.out.println("------------------------------------");
    }

}