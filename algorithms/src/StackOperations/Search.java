package StackOperations;

import java.util.Stack;

public class Search {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(100);
        stack.push(300);
        stack.push(800);

        int search = stack.search(100);
        if (search == -1) {
            System.out.println("Element not found in stack");
        } else {
            int position = stack.size() - search + 1;
            System.out.println("Stack search: " + position);
        }
    }
}
