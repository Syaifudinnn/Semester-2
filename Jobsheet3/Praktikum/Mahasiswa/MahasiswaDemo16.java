import java.util.Scanner;

public class MahasiswaDemo16 {
    
    public static void main(String[] args) {

        //deklarasi inputan
        Scanner input = new Scanner(System.in);
        
        //deklarasi array
        Mahasiswa16[] arrayOfMahasiswa16 = new Mahasiswa16[3];

        //looping untuk instansiasi array of object
        for (int i = 0; i < arrayOfMahasiswa16.length; i++) {
            arrayOfMahasiswa16[i] = new Mahasiswa16();

            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM\t : ");
            arrayOfMahasiswa16[i].nim = input.nextLine();
            System.out.print("Nama\t : ");
            arrayOfMahasiswa16[i].nama = input.nextLine();
            System.out.print("Kelas\t : ");
            arrayOfMahasiswa16[i].kelas = input.nextLine();
            System.out.print("IPK\t : ");
            arrayOfMahasiswa16[i].ipk = input.nextFloat();
            input.nextLine();
            System.out.println("-----------------------------------");

        };

        //looping untuk menampilkan output
        for (int i = 0; i < arrayOfMahasiswa16.length; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa16[i].cetakInfo();
        };

    }

}
