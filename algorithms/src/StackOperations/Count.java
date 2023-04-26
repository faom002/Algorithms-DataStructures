package StackOperations;

import java.util.Stack;

public class Count {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("stack count " + stack.stream().count());

    }
}
