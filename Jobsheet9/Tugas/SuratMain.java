import java.util.Scanner;

public class SuratMain {
    
    public static void main(String[] args) {
        
        //instansiasi stack
        StackSurat16 stack = new StackSurat16(5);
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat : ");
                    String id = input.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = input.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (S/I) : ");
                    char jenis = input.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi Izin (hari) : ");
                    int durasi = input.nextInt();
                    input.nextLine();
                    stack.push(new Surat16(id, nama, kelas, jenis, durasi));
                    break;
                case 2:
                    Surat16 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari " + diproses.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat16 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari : " + terakhir.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari : ");
                    String cari = input.nextLine();
                    stack.cariSurat(cari);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("pilih tidak valid.");
            }
        } while (pilih != 0);

    }

}
