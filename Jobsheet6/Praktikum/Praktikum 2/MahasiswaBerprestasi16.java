public class MahasiswaBerprestasi16 {
    
    //instansiasi array of object
    Mahasiswa16[] listMhs;
    int idx;

    //ambil jumlah data dari inputan
    public MahasiswaBerprestasi16(int jumlah) {
        listMhs = new Mahasiswa16[jumlah];
    }

    //method tambah
    void tambah(Mahasiswa16 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    //method tampil
    void tampil() {
        for (Mahasiswa16 m : listMhs) {
            m.tampilInformasi();
            System.out.println("--------------------");
        }
    }

    //method bubbleSort
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    //swap
                    Mahasiswa16 temp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = temp;
                }
            }
        }
    }

    //method selectionSort
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa16 temp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = temp;
        }
    }

    //method insertionSort (asc)
    // void insertionSort() {
    //     for (int i = 1; i < listMhs.length; i++) {
    //         Mahasiswa16 temp = listMhs[i];
    //         int j = i;
    //         while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
    //             listMhs[j] = listMhs[j - 1];
    //             j--;
    //         }
    //         listMhs[j] = temp;
    //     }
    // }

    //method insertionSort (desc)
    public void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa16 temp = listMhs[i];
            int j = i - 1;
            while (j >= 0 && listMhs[j].ipk < temp.ipk) {
                listMhs[j + 1] = listMhs[j];
                j--;
            }
            listMhs[j + 1] = temp;
        }
    }

}
