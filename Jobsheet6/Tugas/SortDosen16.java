public class SortDosen16 {
    
    //array of object
    Dosen16[] listDosen;
    int idx;

    //ambil jumlah dari inputan
    public SortDosen16(int jumlah) {
        listDosen = new Dosen16[jumlah];
    }

    //tambah data dosen
    void tambah(Dosen16 d) {
        if (idx < listDosen.length) {
            listDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    //tampil data dosen
    void tampil() {
        for (Dosen16 d : listDosen) {
            d.tampilInformasi();
            System.out.println();
        }
    }

    //bubble sort usia dosen (ascending) bubble sort
    void SortingASC() {
        for (int i = 0; i < listDosen.length - 1; i++) {
            for (int j = 0; j < listDosen.length - 1 - i; j++) {
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
        for (int i = 0; i < listDosen.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < listDosen.length; j++) {
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
