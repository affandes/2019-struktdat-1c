package day04;

public class TesStack01 {
    public static void main(String[] args) {

        Stack x = new Stack(5);
        x.push(7);
        x.push(9);
        x.push(13);
        x.push(3);
        x.push(6);
        x.push(8);
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println("==========");
        x.print();

    }
}
