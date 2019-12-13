package day11;

public class Tree {
    private Node root;

    public void insert(int value) {

        if( root == null ) {
            root = new Node(value);
        } else {
            root.insert(value);
        }
    }

    public Node getRoot() {
        return root;
    }

    public void preOrder() {
        if( root == null ) {
            System.out.println("Data kosong!");
        } else {
            root.preOrder();
        }
    }
    public void inOrder() {
        if( root == null ) {
            System.out.println("Data kosong!");
        } else {
            root.inOrder();
        }
    }
    public void postOrder() {
        if( root == null ) {
            System.out.println("Data kosong!");
        } else {
            root.postOrder();
        }
    }
}
