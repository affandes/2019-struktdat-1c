package day05;

public class Queue {

    private int data[];
    private int tail;

    public Queue(int jumlah)
    {
        data = new int[jumlah];
        tail = -1;
    }

    public void enqueue(int nilai)
    {
        if( tail < data.length-1 ) {
            data[++tail] = nilai;
        }
    }

    public int dequeue() {
        if( tail >= 0 ) {
            // Ambil data index 0
            int temp = data[0];
            // Geser
            for (int i = 0; i < data.length-1; i++) {
                data[i] = data[i+1];
            }
            // Kurangi tail
            tail--;
            // Return temp
            return temp;
        }
        return 0;
    }

    public void print()
    {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
