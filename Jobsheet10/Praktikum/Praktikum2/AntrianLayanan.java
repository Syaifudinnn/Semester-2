public class AntrianLayanan {

    //atribut
    Mahasiswa[] data;
    int front, rear, size, max;

    //constructor
    public AntrianLayanan(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    //method isEmpty
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    //method isFull
    public boolean isFull() {
        if (size == max) {
            return true;
        }
        else {
            return false;
        }
    }

    //method peek
    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }
        else {
            System.out.println("Mahasiswa terdepan : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    //method lihatAkhir
    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa paling belakang : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    //method print
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Antrian : ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    //method size
    public int getJumlahAntrian() {
        return size;
    }

    //method clear
    public void clear() {
        if(!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue sudah dikosongkan");
        }
        else {
            System.out.println("Queue sudah kosong");
        }    
    }

    //method enqueue
    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " sudah ditambahkan ke antrian");
    }

    //method dequeue
    public Mahasiswa layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        } 
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

}