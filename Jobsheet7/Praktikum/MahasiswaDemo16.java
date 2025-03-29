import java.util.Scanner;

public class MahasiswaDemo16 {

    public static void main(String[] args) {

        // deklarasi inputan
        Scanner input = new Scanner(System.in);

        // input banyak data
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = input.nextInt();
        input.nextLine();

        // buat objek
        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16(jumlah);

        // input data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
 
            System.out.print("Nama : ");
            String nama = input.nextLine();

            System.out.print("NIM : ");
            String nim = input.nextLine();

            System.out.print("Kelas : ");
            String kelas = input.nextLine();

            System.out.print("IPK : ");
            double ipk = input.nextDouble();
            input.nextLine();

            Mahasiswa16 mhs = new Mahasiswa16(nim, nama, kelas, ipk);
            list.tambah(mhs);

            System.out.println("--------------------");
        }

        //tampil semua data
        System.out.println("Data Mahasiswa");
        System.out.println("--------------------");
        list.tampil();

        //search data sequential
        System.out.println("Pencarian Data");
        System.out.println("--------------------");
        System.out.println("Masukkan IPK yang dicari : ");
        System.out.print("IPK : ");
        double cari = input.nextDouble();
        input.nextLine();

        //tampil data yang dicari
        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("--------------------");
        System.out.println("Menggunakan binary searching");
        double posisi2 = list.findBinarySearch(cari, 0, jumlah - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

    }

}
