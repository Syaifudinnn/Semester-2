public class MataKuliahMain16 {
    
    public static void main(String[] args) {
        
        MataKuliah16 matkul1 = new MataKuliah16();
        matkul1.kodeMK = "1F123";
        matkul1.nama = "Algoritma Struktur Data";
        matkul1.sks = 2;
        matkul1.jumlahJam = 4;

        MataKuliah16 matkul2 = new MataKuliah16("1F456", "PBO", 4, 8);

        System.out.println("Informasi Mata Kuliah 1:");
        matkul1.tampilInformasi();
        System.out.println("\nInformasi Mata Kuliah 2:");
        matkul2.tampilInformasi();

        //ubah sks, tambah jam matkul1
        System.out.println("\n-----------------------------\n");
        matkul1.ubahSKS(3);
        matkul1.tambahJam();
        matkul1.tampilInformasi();

        //ubah sks, kurangi jam matkul2
        System.out.println("\n-----------------------------\n");
        matkul2.ubahSKS(3);
        matkul2.kurangiJam();;
        matkul2.tampilInformasi();


    }

}
