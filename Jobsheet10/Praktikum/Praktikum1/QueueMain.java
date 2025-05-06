import java.util.Scanner;

public class QueueMain {
    
    //menu
    public static void menu() {
        System.out.println("\nMasukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-----------------------------------");
        System.out.print("Pilihan Menu : ");
    }

    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //input panjang queue
        System.out.print("Masukkan panjang queue : ");
        int n = input.nextInt();

        //instansiasi objek Queue
        Queue Q = new Queue(n);

        int pilih;
        do {
            menu();
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = input.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang keluar : " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);

    }

}
