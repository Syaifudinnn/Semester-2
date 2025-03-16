import java.util.Scanner;

public class MainPangkat {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //input nilai
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = input.nextInt();

        //instansiasi array of object
        Pangkat[] png = new Pangkat[elemen];

        for (int i = 0; i < png.length; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + " : ");
            int nilai = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + " : ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        //output
        System.out.println("Hasil Pangkat Brute Force");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("Hasil Pangkat Divide Conquer");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.pangkatDC(p.nilai, p.pangkat));
        }

    }

}
