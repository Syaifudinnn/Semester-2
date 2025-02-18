import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        // deklarasi input
        Scanner input = new Scanner(System.in);

        // deklarasi array
        String[] matkul = new String[8];
        double[] nilaiAngka = new double[matkul.length];
        String[] nilaiHuruf = new String[matkul.length];
        double[] nilaiSetara = new double[matkul.length];;
        int[] sks = new int[matkul.length];

        // header
        System.out.println("=====================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=====================================");
        
        // input mata kuliah dan SKS
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            matkul[i] = input.nextLine();
            System.out.print("Masukkan jumlah SKS untuk " + matkul[i] + ": ");
            sks[i] = input.nextInt();
            input.nextLine();
        }

        // input nilai
        System.out.println("=====================================");
        System.out.println("Input Nilai");
        System.out.println("=====================================");

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + matkul[i] + " : ");
            nilaiAngka[i] = input.nextDouble();

            // konversi nilai
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else if (nilaiAngka[i] < 39) {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
        }

        // hitung IP
        double totalNilai = 0;
        int totalSKS = 0;
        for (int i = 0; i < matkul.length; i++) {
            totalNilai += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }
        double ip = totalNilai / totalSKS;

        // output
        System.out.println("=====================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================================");

        System.out.printf("%-30s %-15s %-15s %-15s %-15s\n", "MK", "SKS", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-30s %-15d %-15.2f %-15s %-15.2f\n", matkul[i], sks[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }

        System.out.println("=====================================");
        System.out.printf("IP Semester : %.2f\n", ip);
    }
}
