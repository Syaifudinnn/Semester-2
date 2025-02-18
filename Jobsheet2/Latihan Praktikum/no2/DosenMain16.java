public class DosenMain16 {

    public static void main(String[] args) {

        Dosen16 dosen1 = new Dosen16();
        dosen1.idDosen = "D01";
        dosen1.nama = "Bambang";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "PBO";

        Dosen16 dosen2 = new Dosen16("D02", "Joko", true, 2012, "AI");

        System.out.println("Informasi Dosen 1 :");
        dosen1.tampilInformasi();
        System.out.println("\nInformasi Dosen 2 :");
        dosen2.tampilInformasi();

        //ubah keahlian dan status dosen 1
        System.out.println("\n-----------------------------\n");
        dosen1.ubahKeahlian("Pemrograman Web");
        dosen1.statusAktif = false;
        dosen1.tampilInformasi();

        //hitung masa kerja dosen 2
        System.out.println("\n-----------------------------\n");
        dosen2.tampilInformasi();
        int masaKerja = dosen2.hitungMasaKerja(2025);
        System.out.println("Masa kerja dosen : " + masaKerja + " tahun.");
    }

}
