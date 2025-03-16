import java.util.Scanner;

public class MainFaktorial {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //input nilai
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();

        //buat objek dari class Faktorial
        Faktorial fk = new Faktorial();

        System.out.println("Nilai faktorial " + nilai + " dengan BF adalah " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " dengan DC adalah " + fk.faktorialDC(nilai));

    }

}
