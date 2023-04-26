package StackOperations;

import java.util.ArrayList;
import java.util.Stack;

public class PushToStack {


    public static void main(String[] args) {



         Stack<Integer> stack = new Stack<Integer>();

        stack.push(2);

        stack.push(4);

        stack.push(5);

        System.out.println("is stack full? " + isFull(stack, 3));




        System.out.println("size of stack" + " " + stack.size());


    }


    public static boolean isFull(Stack<Integer> stack, int maxSize) {


        return stack.size() >= maxSize;
    }




}
