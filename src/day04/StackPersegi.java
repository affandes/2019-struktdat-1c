package day04;

public class StackPersegi {

    private Persegi data[];
    private int top;

    public StackPersegi(int jumlah)
    {
        data = new Persegi[jumlah];
        top = -1;
    }

    public void push(Persegi nilai)
    {
        if( top < data.length-1 ) {
            data[++top] = nilai;
        }
    }

    public Persegi pop() {
        if( top >= 0 ) {
            Persegi temp = data[top--];
            return temp;
        }
        return null;
    }

    public void print()
    {
        for (int i = data.length-1; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

}
