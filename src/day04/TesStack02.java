package day04;

public class TesStack02 {
    public static void main(String[] args) {

        StackString c = new StackString(5);

        c.push("S");
        c.push("A");
        c.push("L");
        c.push("A");
        c.push("M");

        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());

    }
}
