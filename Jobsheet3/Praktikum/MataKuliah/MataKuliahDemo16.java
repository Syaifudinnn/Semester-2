import java.util.Scanner;

public class MataKuliahDemo16 {

    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //input banyak mata kuliah
        System.out.print("Input jumlah matkul : ");
        int jumlahMatkul = input.nextInt();
        input.nextLine();

        //deklarasi array
        MataKuliah16[] arrayOfMatkul = new MataKuliah16[jumlahMatkul];

        //looping untuk masukkan data matkul
        for (int i = 0; i < arrayOfMatkul.length; i++) {
            //buat object baru
            arrayOfMatkul[i] = new MataKuliah16();

            System.out.println("Masukkan nama mata kuliah ke-" + (i+1));
            System.out.print("Kode\t : ");
            String kode = input.nextLine();
            System.out.print("Nama\t : ");
            String nama = input.nextLine();
            System.out.print("SKS\t : ");
            int sks = input.nextInt();
            System.out.print("Jam\t : ");
            int jam = input.nextInt();
            input.nextLine();
            System.out.println("------------------------------------");

            arrayOfMatkul[i].tambahData(kode, nama, sks, jam);
        };

        //looping untuk menampilkan output
        for (int i = 0; i < arrayOfMatkul.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            arrayOfMatkul[i].cetakInfo();
        }

    }

}
