package day11;

public class Node {
    private int value;
    private Node left, right;
    public Node(int value) {
        this.value = value;
    }
    public void insert(int value) {
        if( value < this.value ) {
            // Ke kiri
            if( this.left == null ) {
                this.left = new Node(value);
            } else {
                this.left.insert(value);
            }
        } else {
            // Ke kanan
            if( this.right == null ) {
                this.right = new Node(value);
            } else {
                this.right.insert(value);
            }
        }
    }

    public void preOrder() {
        System.out.println(this.value); // X
        if( left != null ) { left.preOrder(); } // A
        if( right != null ) { right.preOrder(); } // B
    }

    public void inOrder() {
        if( left != null ) { left.inOrder(); } // A
        System.out.println(this.value); // X
        if( right != null ) { right.inOrder(); } // B
    }

    public void postOrder() {
        if( left != null ) { left.postOrder(); } // A
        if( right != null ) { right.postOrder(); } // B
        System.out.println(this.value); // X
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
