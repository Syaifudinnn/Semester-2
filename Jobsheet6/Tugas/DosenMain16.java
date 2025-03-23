import java.util.Scanner;

public class DosenMain16 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //input banyak data
        System.out.print("Masukkan banyak dosen : ");
        int jumlah = input.nextInt();
        input.nextLine();

        //buat objek
        SortDosen16 list = new SortDosen16(jumlah);

        //input data dosen
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("Kode Dosen : ");
            String kode = input.nextLine();

            System.out.print("Nama Dosen : ");
            String nama = input.nextLine();

            System.out.print("Jenis Kelamin (L/P) : ");
            boolean jenisKelamin = input.nextLine().equalsIgnoreCase("L");

            System.out.print("Usia : ");
            int usia = input.nextInt();
            input.nextLine();

            Dosen16 dosen = new Dosen16(kode, nama, jenisKelamin, usia);
            list.tambah(dosen);
        }

        //output
        System.out.println("\nData Dosen sebelum sorting : ");
        list.tampil();

        System.out.println("----------------------------------");

        System.out.println("\nData Dosen setelah sorting (asc) : ");
        list.SortingASC();
        list.tampil();

        System.out.println("----------------------------------");

        System.out.println("\nData Dosen setelah sorting (desc) : ");
        list.SortingDESC();
        list.tampil();

    }

}
