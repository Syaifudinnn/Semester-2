import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // Membuat objek AntrianKRS
        AntrianKRS antrian = new AntrianKRS(10);
        
        // Deklarasi inputan
        Scanner input = new Scanner(System.in);
        int pilih;

        // Menu
        do {
            System.out.println("\nMenu");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS");
            System.out.println("3. Kosongkan Antrian");
            System.out.println("4. Tampilkan Semua Antrian");
            System.out.println("5. Tampilkan Antrian Terdepan");
            System.out.println("6. Tampilkan Antrian Terbelakang");
            System.out.println("7. Tampilkan Jumlah Antrian");
            System.out.println("8. Tampilkan Jumlah Mahasiswa yang Dilayani");
            System.out.println("9. Tampilkan Kuota DPA");
            System.out.println("10. Tampil Sisa Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = input.nextInt();
            input.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Nama\t : ");
                    String nama = input.nextLine();
                    System.out.print("NIM\t : ");
                    String nim = input.nextLine();
                    System.out.print("Prodi\t : ");
                    String prodi = input.nextLine();
                    System.out.print("Kelas\t : ");
                    String kelas = input.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.clear();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    antrian.tampilkanTerdepan();
                    break;
                case 6:
                    antrian.tampilkanBelakang();
                    break;
                case 7:
                    System.out.println("Jumlah antrian : " + antrian.getJumlahAntrian());
                    break;
                case 8:
                    System.out.println("Jumlah yang sudah diproses KRS : " + antrian.getJumlahDilayani());
                    break;
                case 9:
                    System.out.println("Sisa kuota mahasiswa DPA : " + antrian.getSisaKuotaDPA());
                    break;
                case 10:
                    System.out.println("Mahasiswa belum diproses KRS : " + antrian.getBelumProsesKRS());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

        } while (pilih != 0);

    }

}
