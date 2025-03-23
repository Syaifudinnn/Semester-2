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
        // Mahasiswa16 mhs1 = new Mahasiswa16("123", "Zidan", "2A", 3.2);
        // Mahasiswa16 mhs2 = new Mahasiswa16("124", "Ayu", "2A", 3.5);
        // Mahasiswa16 mhs3 = new Mahasiswa16("125", "Sofi", "2A", 3.1);
        // Mahasiswa16 mhs4 = new Mahasiswa16("126", "Sita", "2A", 3.9);
        // Mahasiswa16 mhs5 = new Mahasiswa16("127", "Miki", "2A", 3.7);

        // input data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
 
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
        }

        // tambah objek mhs ke list
        // list.tambah(mhs1);
        // list.tambah(mhs2);
        // list.tambah(mhs3);
        // list.tambah(mhs4);
        // list.tambah(mhs5);

        // ouput
        System.out.println("Data mahasiswa sebelum sorting : ");
        list.tampil();

        // System.out.println("Data mahasiswa setelah bubble sort berdasarkan IPK (desc) : ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data mahasiswa setelah selection sort berdasarkan IPK (asc) : ");
        // list.selectionSort();
        // list.tampil();

        System.out.println("Data mahasiswa setelah insertion sort berdasarkan IPK (desc) : ");
        list.insertionSort();
        list.tampil();

    }

}
