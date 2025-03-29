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

    //method sequential search
    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].ipk == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    //method binary search
    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return mid;
            } else if (cari < listMhs[mid].ipk) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    //method tampil posisi
    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK : " + x + " ada pada index ke-" + pos);
        } else {
            System.out.println("Data mahasiswa dengan IPK : " + x + " tidak ditemukan!");
        }
    }

    //method tampil data yang dicari
    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("Nama : " + listMhs[pos].nama);
            System.out.println("NIM : " + listMhs[pos].nim);
            System.out.println("Kelas : " + listMhs[pos].kelas);
            System.out.println("IPK : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data mahasiswa dengan IPK : " + x + " tidak ditemukan!");
        }
    }

}
