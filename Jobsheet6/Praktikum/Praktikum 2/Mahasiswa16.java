public class Mahasiswa16 {

    //attribut
    String nim;
    String nama;
    String kelas;
    double ipk;

    //konstruktor default
    public Mahasiswa16() {
        
    }

    //konstruktor parameter
    public Mahasiswa16(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    //method tampilInformasi
    public void tampilInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }

}