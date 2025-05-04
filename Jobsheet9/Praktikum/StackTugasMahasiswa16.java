public class StackTugasMahasiswa16 {

    // atribut
    Mahasiswa16[] stack;
    int top, size;

    // konstruktor
    StackTugasMahasiswa16(int size) {
        this.size = size;
        stack = new Mahasiswa16[size];
        top = -1;
    }

    // method isFull
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;

        }
    }

    // method isEmpty
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // method push
    public void push(Mahasiswa16 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack sudah penuh!");
        }
    }

    // method pop
    public Mahasiswa16 pop() {
        if (!isEmpty()) {
            Mahasiswa16 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack sudah kosong!");
            return null;
        }
    }

    // method peek
    public Mahasiswa16 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack sudah kosong!");
            return null;
        }
    }

    // method bottom
    public Mahasiswa16 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    // method count
    public int countTugas() {
        return top + 1;
    }
    

    // method print
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println(" ");
    }

    // method konversi
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi16 stack = new StackKonversi16();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

}
