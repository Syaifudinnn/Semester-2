import java.util.Scanner;

public class SortDosen16 {
    
    //array of object
    Dosen16[] listDosen = new Dosen16[10];
    int idx;

    //deklarasi inputan
    Scanner input = new Scanner(System.in);

    //tambah data dosen
    void tambah() {
        if (idx < listDosen.length) {
            System.out.print("Masukkan Kode Dosen : ");
            String kode = input.nextLine();
            System.out.print("Masukkan Nama Dosen : ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin (L/P) : ");
            boolean jenisKelamin = input.nextLine().equalsIgnoreCase("L");
            System.out.print("Masukkan Usia: ");
            int usia = input.nextInt();
            input.nextLine();

            listDosen[idx] = new Dosen16(kode, nama, jenisKelamin, usia);
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    //tampil data dosen
    void tampil() {
        for (Dosen16 d : listDosen) {
            if (d != null) {
                d.tampilInformasi();
            }
        }
    }

    //bubble sort usia dosen (ascending) bubble sort
    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (listDosen[j].usia > listDosen[j + 1].usia) {
                    // Swap
                    Dosen16 temp = listDosen[j];
                    listDosen[j] = listDosen[j + 1];
                    listDosen[j + 1] = temp;
                }
            }
        }
    }

    //selection sort usia dosen (descending) selection sort
    void SortingDESC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (listDosen[j].usia > listDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            // Swap
            Dosen16 temp = listDosen[maxIdx];
            listDosen[maxIdx] = listDosen[i];
            listDosen[i] = temp;
        }
    }

}
