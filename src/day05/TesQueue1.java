package day05;

public class TesQueue1 {
    public static void main(String[] args) {
        Queue x = new Queue(5);
        x.enqueue(8);
        x.enqueue(6);

        x.dequeue();

        x.print();
    }
}
