import java.util.Scanner;

public class MainSum {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //input jumlah elemen
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = input.nextInt();

        //buat objek
        Sum sum = new Sum(elemen);

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + " : ");
            sum.keuntungan[i] = input.nextDouble();
        }

        //output
        System.out.println("Total keuntungan metode Brute Force: " + sum.totalBF());
        System.out.println("Total keuntungan metode Divide and Conquer: " + sum.totalDC(sum.keuntungan, 0, elemen - 1));

    }

}
