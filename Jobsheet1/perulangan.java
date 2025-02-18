import java.util.Scanner;

public class perulangan {
    
    public static void main(String[] args) {
        
        // deklarasi inputan
        Scanner input = new Scanner(System.in);

        // input nim
        System.out.print("Masukkan NIM Anda : ");
        int nim = input.nextInt();

        // mengambil 2 digit terakhir dari NIM
        int n = nim % 100;

        // logic
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
