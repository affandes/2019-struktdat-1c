package day12;

public class AppCobaGraph {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.v = new Node[5];
        g.v[0] = new Node();
        g.v[1] = new Node();
        g.v[2] = new Node();
        g.v[3] = new Node();
        g.v[4] = new Node();
        g.v[0].label = "A";
        g.v[1].label = "B";
        g.v[2].label = "C";
        g.v[3].label = "D";
        g.v[4].label = "E";

        g.e = new boolean[5][5];
        g.e[0][1] = true; // Edge A->B
        g.e[1][0] = true; // Edge B->A

    }
}
