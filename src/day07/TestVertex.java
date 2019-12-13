package day07;

public class TestVertex {
    public static void main(String[] args) {

        Vertex x = new Vertex();
        Vertex y = new Vertex();

        x.setValue(8);
        y.setValue(12);

        x.setNext(y);

        System.out.println("X = " + x.getValue());
        System.out.println("Y = " + x.getNext().getValue());
    }
}
