public class Mahasiswa16 {

    //set atribut
    String nama;
    String nim;
    String kelas; 
    double ipk;

    //make konstruktor
    public Mahasiswa16() {

    }

    public Mahasiswa16(String nm, String nim, String kls, double ipk) {
        nama = nm;
        this.nim = nim;
        kelas = kls;
        this.ipk = ipk;
    }

    //set method
    void tampilkanInformasi(){
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        }
        else if (ipk >= 3.0) {
            return "Kinerja baik";
        }
        else if (ipk >= 2.0) {
            return "Kinerja cukup";
        }
        else {
            return "Kinerja kurang";
        }
    }

}