import java.util.Stack;

class StackSurat16 {
    
    //atribut
    private Stack<Surat16> stack;
    private int size;

    //konstruktor
    public StackSurat16(int size) {
        this.size = size;
        stack = new Stack<>();
    }

    //method isFull
    public boolean isFull() {
        return stack.size() == size;
    }

    //method isEmpty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    //method push
    public void push(Surat16 surat) {
        if (!isFull()) {
            stack.push(surat);
            System.out.println("Surat dari " + surat.namaMahasiswa + " dengan id " + surat.idSurat + " telah ditambahkan ke dalam stack.");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    //method pop
    public Surat16 pop() {
        if (!isEmpty()) {
            Surat16 surat = stack.pop();
            System.out.println("Surat dari " + surat.namaMahasiswa + " dengan id " + surat.idSurat + " telah diambil dari dalam stack.");
            return surat;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    //method peek
    public Surat16 peek() {
        if (!isEmpty()) {
            return stack.peek();
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    //method search
    public void cariSurat(String nama) {
        boolean ditemukan = false;

        for (Surat16 surat : stack.toArray(new Surat16[0])) {
            if (surat.namaMahasiswa.equalsIgnoreCase(nama)) {
                ditemukan = true;
                System.out.println("Surat ditemukan : ");
                System.out.println("ID Surat : " + surat.idSurat);
                System.out.println("Nama Mahasiswa : " + surat.namaMahasiswa);
                System.out.println("Kelas : " + surat.kelas);
                System.out.println("Jenis Izin : " + surat.jenisIzin);
                System.out.println("Durasi Izin : " + surat.durasi + " hari");
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}