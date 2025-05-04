public class StackKonversi16 {
    
    //attribut
    int[] tumpukanBiner;
    int size, top;

    //konstruktor
    public StackKonversi16() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    //method isEmpty
    public boolean isEmpty() {
        return top == -1;
    }

    //method isFull
    public boolean isFull() {
        return top == size - 1;
    }

    //method push
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack sudah penuh!");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    //method pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }

}
