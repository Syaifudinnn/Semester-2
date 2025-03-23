import java.util.Scanner;

public class DosenMain16 {

    public static void main(String[] args) {

        // deklarasi inputan
        Scanner input = new Scanner(System.in);

        // buat objek dari class SortDosen16
        SortDosen16 list = new SortDosen16();

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Urutkan Usia Ascending (Bubble Sort)");
            System.out.println("4. Urutkan Usia Descending (Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Tambah Data Dosen ---");
                    list.tambah();
                    break;

                case 2:
                    System.out.println("\n--- Tampil Data Dosen ---");
                    list.tampil();
                    break;

                case 3:
                    list.SortingASC();
                    System.out.println("\n--- Data ASC ---");
                    list.tampil();
                    break;

                case 4:
                    list.SortingDESC();
                    System.out.println("\n--- Data DESC ---");
                    list.tampil();
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);

    }

}
