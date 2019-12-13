package day11;

public class App01 {
    public static void main(String[] args) {
        Tree t = new Tree();

        t.insert(19);
        t.insert(15);
        t.insert(4);
        t.insert(24);
        t.insert(61);
        t.insert(21);
        t.insert(33);
        t.insert(44);

        t.postOrder();

    }
}
