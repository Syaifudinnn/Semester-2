import java.util.Scanner;

public class MahasiswaDemo16 {

    public static void main(String[] args) {

        // instansiasi objek stack
        StackTugasMahasiswa16 stack = new StackTugasMahasiswa16(5);

        // deklarasi inputan
        Scanner input = new Scanner(System.in);
        int pilih;

        // menu
        do {
            System.out.println("\nMenu : ");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Pertama Dikumpulkan");
            System.out.println("6. Lihat Jumlah Tugas yang Dikumpulkan");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            input.nextLine(); // membersihkan buffer

            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = input.nextLine();
                    System.out.print("NIM : ");
                    String nim = input.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = input.nextLine();
                    // membuat objek mahasiswa
                    Mahasiswa16 mhs = new Mahasiswa16(nim, nama, kelas);
                    // push ke stack
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa16 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Input nilai (0-100) : ");
                        int nilai = input.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, dinilai.nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas : " + biner);
                    } else {
                        System.out.println("Tidak ada tugas yang dinilai!");

                    }
                    break;
                case 3:
                    Mahasiswa16 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    } else {
                        System.out.println("Tidak ada tugas yang dinilai!");

                    }
                    break;
                case 4:
                    System.out.println("Daftar Tugas : ");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa16 terbawah = stack.bottom();
                    if (terbawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + terbawah.nama);
                    }
                    break;
                case 6:
                    int jumlah = stack.countTugas();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih >= 1 && pilih <= 4);

    }

}
