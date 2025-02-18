import java.util.Scanner;

public class Tugas3 {

    // deklarasi input
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // input jumlah matkul
        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlahMatkul = input.nextInt();
        input.nextLine();

        // deklarasi array
        String[] matkul = new String[jumlahMatkul];
        int[] sks = new int[jumlahMatkul];
        int[] semester = new int[jumlahMatkul];
        String[] hari = new String[jumlahMatkul];

        // panggil fungsi input data matkul
        System.out.println("----------------------------");
        inputDataMatkul(jumlahMatkul, matkul, sks, semester, hari);
        System.out.println("----------------------------");

        // pilih menu
        boolean isRun = true;
        while (isRun) {
            menu();
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tampilSeluruhJadwal(jumlahMatkul, matkul, sks, semester, hari);
                    break;
                case 2:
                    jadwalBerdasarkanHari(matkul, sks, semester, hari);
                    break;
                case 3:
                    jadwalBerdasarkanSemester(matkul, sks, semester, hari);
                    break;
                case 4:
                    cariMatkul(matkul, sks, semester, hari);
                    break;
                case 5:
                    isRun = false;
                    System.out.println("\nTerima Kasih");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }

    }

    // fungsi menu
    public static void menu() {
        System.out.println("Menu : ");
        System.out.println("1. Tampilkan seluruh jadwal kuliah");
        System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
        System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
        System.out.println("4. Cari mata kuliah berdasarkan nama");
        System.out.println("5. Keluar");
    }

    // fungsi input data matkul
    static void inputDataMatkul(int jumlahMatkul, String[] matkul, int[] sks, int[] semester, String[] hari) {
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan nama mata kuliah ke-" + (i + 1) + " : ");

            System.out.print("Nama Matkul : ");
            matkul[i] = input.nextLine();

            System.out.print("SKS : ");
            sks[i] = input.nextInt();

            System.out.print("Semester : ");
            semester[i] = input.nextInt();
            input.nextLine();

            System.out.print("Hari : ");
            hari[i] = input.nextLine();
        }
    }

    //fungsi tampil seluruh jadwal kuliah
    static void tampilSeluruhJadwal(int jumlahMatkul, String[] matkul, int[] sks, int[] semester, String[] hari) {
        System.out.println("----------------------------");
        System.out.println("Jadwal Kuliah : ");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Mata Kuliah\t : " + matkul[i]);
            System.out.println("SKS\t\t : " + sks[i]);
            System.out.println("Semester\t : " + semester[i]);
            System.out.println("Hari\t\t : " + hari[i]);
            System.out.println("----------------------------");
        }
    }

    //fungsi tampil jadwal berdasarkan hari
    static void jadwalBerdasarkanHari(String[] matkul, int[] sks, int[] semester, String[] hari) {
        System.out.println("----------------------------");
        System.out.print("Input Hari\t : ");
        String cariHari = input.nextLine();

        //search jadwal
        boolean search = false;

        for (int i = 0; i < matkul.length; i++) {
            if (hari[i].equalsIgnoreCase(cariHari)) {
                System.out.println("Mata Kuliah\t : " + matkul[i]);
                System.out.println("SKS\t\t : " + sks[i]);
                System.out.println("Semester\t : " + semester[i]);
                System.out.println("----------------------------");
                search = true;
            }
        }

        if (!search) {
            System.out.println("Jadwal tidak ditemukan");
            System.out.println("----------------------------");
        }
    }

    //fungsi tampil jadwal berdasarkan semester
    static void jadwalBerdasarkanSemester(String[] matkul, int[] sks, int[] semester, String[] hari) {
        System.out.println("----------------------------");
        System.out.print("Input Semester\t : ");
        int cariSemester = input.nextInt();

        //search jadwal
        boolean search = false;

        for (int i = 0; i < matkul.length; i++) {
            if (semester[i] == cariSemester) {
                System.out.println("Mata Kuliah\t : " + matkul[i]);
                System.out.println("SKS\t\t : " + sks[i]);
                System.out.println("Semester\t : " + semester[i]);
                System.out.println("Hari\t\t : " + hari[i]);
                System.out.println("----------------------------");
                search = true;
            }
        }

        if (!search) {
            System.out.println("Jadwal tidak ditemukan");
            System.out.println("----------------------------");
        }
    }

    //fungsi mencari matkul
    static void cariMatkul(String[] matkul, int[] sks, int[] semester, String[] hari) {
        System.out.println("----------------------------");
        System.out.print("Input Matakul\t : ");
        String cariMatkul = input.nextLine();

        //search matkul
        boolean search = false;

        for (int i = 0; i < matkul.length; i++) {
            if (matkul[i].equalsIgnoreCase(cariMatkul)) {
                System.out.println("Mata Kuliah\t : " + matkul[i]);
                System.out.println("SKS\t\t : " + sks[i]);
                System.out.println("Semester\t : " + semester[i]);
                System.out.println("Hari\t\t : " + hari[i]);
                System.out.println("----------------------------");
                search = true;
            }
        }

        if (!search) {
            System.out.println("Matkul tidak ditemukan");
            System.out.println("----------------------------");
        }
    }

}
