public class Queue {

    //atribut
    int[] data;
    int front, rear, size, max;

    //constructor
    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
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
    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + data[front]);
        }
        else {
            System.out.println("Queue kosong");
        }
    }

    //method print
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
        }
        else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen : " + size);
        }
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
    public void Enqueue(int dt) {
        if(isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1);
        }
        else {
            if (isEmpty()) {
                front = rear = 0;
            }
            else {
                if (rear == max -1) {
                    rear = 0;
                }
                else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    //method dequeue
    public int Dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue kosong");
            System.exit(1);
        }
        else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            }
            else {
                if (front == max - 1) {
                    front = 0;
                }
                else {
                    front++;
                }
            }
        }
        return dt;
    }

}