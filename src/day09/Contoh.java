package day09;

import java.util.*;

public class Contoh {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        LinkedList<String> li = new LinkedList<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
