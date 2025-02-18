public class Dosen16 {

    //set atribut
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    //set konstruktor
    public Dosen16() {

    }

    public Dosen16(String id, String nm, boolean status, int thb, String bidang) {
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = thb;
        bidangKeahlian = bidang;
    }

    //set method
    void tampilInformasi(){
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Status Aktif : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    String setStatusAktif(boolean status) {
        statusAktif = status;
        return statusAktif ? "Aktif" : "Tidak Aktif";
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

}