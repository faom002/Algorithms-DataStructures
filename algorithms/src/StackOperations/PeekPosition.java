package StackOperations;

import java.util.Stack;

public class PeekPosition {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(100);

        stack.push(200);
        stack.push(400);

        System.out.println("stack position " + stack.peek());

    }


}
