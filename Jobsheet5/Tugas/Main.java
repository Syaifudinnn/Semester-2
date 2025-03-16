import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine();

        //deklarasi array mahasiswa
        DataMahasiswa[] dataMahasiswa = new DataMahasiswa[jumlahMahasiswa];

        //input data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("Nama\t\t : ");
            String nama = input.nextLine();
            System.out.print("NIM\t\t : ");
            String NIM = input.nextLine();
            System.out.print("Tahun Masuk\t : ");
            int tahunMasuk = input.nextInt();
            System.out.print("Nilai UTS\t : ");
            int nilaiUTS = input.nextInt();
            System.out.print("Nilai UAS\t : ");
            int nilaiUAS = input.nextInt();
            input.nextLine();

            dataMahasiswa[i] = new DataMahasiswa(nama, NIM, tahunMasuk, nilaiUTS, nilaiUAS);
            System.out.println("---------------------------------");
        }

        //buat objek hitungNilai
        HitungNilai hitungNilai = new HitungNilai(dataMahasiswa);

        //panggil method cariNilaiUTSTertinggi dan cariNilaiUTSTerendah dan rataUas
        System.out.println("Nilai UTS Tertinggi : " + hitungNilai.cariNilaiUTSTertinggi(0, jumlahMahasiswa - 1));
        System.out.println("Nilai UTS Terendah : " + hitungNilai.cariNilaiUTSTerendah(0, jumlahMahasiswa - 1));
        System.out.println("Rata-rata Nilai UAS : " + hitungNilai.rataUas());


    }

}
