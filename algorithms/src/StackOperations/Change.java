package StackOperations;

import java.util.Stack;

public class Change {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(100);
        stack.push(300);
        stack.push(100);
        System.out.println("stack elements " + stack);
        stack.set(0,200);
        System.out.println("stack elements " + stack);




    }
}
