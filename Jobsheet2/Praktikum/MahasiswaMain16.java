public class MahasiswaMain16 {
    
    public static void main(String[] args) {
        
        Mahasiswa16 mhs1 = new Mahasiswa16();
        mhs1.nama = "Mukhammad Syaifudin Adn";
        mhs1.nim = "244107020145";
        mhs1.kelas = "TI-1F";
        mhs1.ipk = 3.9;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI-1Z");
        mhs1.updateIpk(4.0);
        mhs1.tampilkanInformasi();

        Mahasiswa16 mhs2 = new Mahasiswa16("Dora", "244107020146", "TI-1F", 3.8);
        mhs2.updateIpk(3.7);
        mhs2.tampilkanInformasi();

        Mahasiswa16 mhsAdn = new Mahasiswa16("Adn", "244107020147", "TI-1R", 3.6);

    }

}
