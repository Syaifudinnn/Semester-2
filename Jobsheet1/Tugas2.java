import java.util.Scanner;

public class Tugas2 {
    
    public static void main(String[] args) {
        
        //deklarasi input
        Scanner input = new Scanner(System.in);

        //input pilihan
        boolean isRun = true;

        while (isRun) {
            menu();
            System.out.print("Pilih Menu : ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1 :
                    volumeKubus(input);
                    break;
                case 2 :
                    luasPermukaanKubus(input);
                    break;
                case 3 :
                    kelilingKubus(input);
                    break;
                case 4 :
                    isRun = false;
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }

        }

    }

    //fungsi menu
    static void menu() {
        System.out.println("\n========== Hitung Kubus ==========");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.println("4. Exit");
    }

    //fungsi volume kubus
    static void volumeKubus(Scanner input) {

        System.out.print("\nMasukkan sisi kubus : ");
        int sisi = input.nextInt();

        int volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus : " + volume);
    }

    //fungsi luas permukaan kubus
    static void luasPermukaanKubus(Scanner input) {

        System.out.print("\nMasukkan sisi kubus : ");
        int sisi = input.nextInt();

        int luas = 6 * (sisi * sisi);
        System.out.println("Luas Permukaan Kubus : " + luas);
    }

    //fungsi keliling kubus
    static void kelilingKubus(Scanner input) {

        System.out.print("\nMasukkan sisi kubus : ");
        int sisi = input.nextInt();

        int keliling = 12 * sisi;
        System.out.println("Keliling Kubus : " + keliling);
    }

}
