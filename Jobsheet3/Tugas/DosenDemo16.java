import java.util.Scanner;

public class DosenDemo16 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //input jumlah dosen
        System.out.print("Masukkan jumlah dosen : ");
        int jumlahDosen = input.nextInt();
        input.nextLine();
        System.out.println("-----------------------------");

        //deklarasi array
        Dosen16 [] arrayOfDosen = new Dosen16[jumlahDosen];

        //input data dosen
        for (int i = 0; i < arrayOfDosen.length; i++) {

            System.out.println("Masukkan data dosen ke-" + (i+1));
            System.out.print("Kode\t : ");
            String kode = input.nextLine();
            System.out.print("Nama\t : ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin (1 = Pria, 0 = Wanita) : ");
            int jk = input.nextInt();
            System.out.print("Usia\t : ");
            int usia = input.nextInt();
            input.nextLine();
            System.out.println("-----------------------------");

            boolean jenisKelamin = (jk == 1);
            arrayOfDosen[i] = new Dosen16(kode, nama, jenisKelamin, usia);
        }

        //output data dosen
        System.out.println("Data Dosen");
        System.out.println("-----------------------------");
        DataDosen16.dataDosen(arrayOfDosen);
        DataDosen16.jumlahDosenPerJK(arrayOfDosen);
        DataDosen16.rerataUsiaDosenPerJK(arrayOfDosen);
        DataDosen16.infoDosenPalingTua(arrayOfDosen);
        DataDosen16.infoDosenPalingMuda(arrayOfDosen);

    }

}
