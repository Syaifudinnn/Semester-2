public class Mahasiswa16 {

    //attribut
    String nim, nama, kelas;
    int nilai;

    //konstruktor
    Mahasiswa16() {
        
    }

    Mahasiswa16(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1; //nilai default
    }

    //method
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

}