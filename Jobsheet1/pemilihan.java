import java.util.Scanner;

public class pemilihan {

    public static void main(String[] args) {

        // deklarasi inputan
        Scanner input = new Scanner(System.in);

        // header
        System.out.println("Perhitungan Nilai Akhir Mahasiswa");
        System.out.println("=========================");

        // input nilai
        int tugas, kuis, uts, uas;

        System.out.print("Masukkan Nilai Tugas (0-100): ");
        tugas = input.nextInt();

        System.out.print("Masukkan Nilai Kuis (0-100): ");
        kuis = input.nextInt();

        System.out.print("Masukkan Nilai UTS (0-100): ");
        uts = input.nextInt();

        System.out.print("Masukkan Nilai UAS (0-100): ");
        uas = input.nextInt();

        // cek jika nilai invalid
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("=========================");
            System.out.println("Nilai tidak valid");
            System.out.println("=========================");
            System.exit(0);
        }

        // hitung nilai akhir
        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

        // pengelompokan nilai angka
        String nilaiHuruf = "";
        double nilaiSetara;
        String kualifikasi;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4;
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2;
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = "Kurang";
        } else if (nilaiAkhir < 39) {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";
        }

        // pengelompokan lulus / tidak
        String status;

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+")
                || nilaiHuruf.equals("C")) {
            status = "Selamat Anda Lulus";
        } else {
            status = "Mohon Maaf Anda Tidak Lulus";
        }

        // output
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println(status);

    }

}