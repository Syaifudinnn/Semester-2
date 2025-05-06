public class AntrianKRS {
    
    //atribut
    Mahasiswa[] data;
    int front, rear, size, max;
    int jumlahDilayani;

    //konstruktor
    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jumlahDilayani = 0;
    }

    //method isEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    //method isFull
    public boolean isFull() {
        return size == max;
    }

    //method clear
    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    //method tambah antrian
    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " ditambahkan ke antrian.");
    }

    //method proses krs
    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Tidak cukup mahasiswa untuk proses KRS (minimal 2)");
            return;
        }

        System.out.println("Mahasiswa yang diproses KRS:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa m = data[front];
            m.tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahDilayani++;
        }
    }

    //method tampil semua antrian
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Data seluruh antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    //method tampil antrian terdepan
    public void tampilkanTerdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 orang.");
            return;
        }

        System.out.println("2 Mahasiswa terdepan:");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    //method tampil antrian belakang
    public void tampilkanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa di posisi terakhir:");
            data[rear].tampilkanData();
        }
    }

    //method tampil banyak antrian
    public int getJumlahAntrian() {
        return size;
    }

    //method tampil banyak mahasiswa yang dilayani
    public int getJumlahDilayani() {
        return jumlahDilayani;
    }

    //method tampil sisa kuota DPA
    public int getSisaKuotaDPA() {
        return 30 - jumlahDilayani;
    }

    //method tampil sisa antrian
    public int getBelumProsesKRS() {
        return size;
    }

}
