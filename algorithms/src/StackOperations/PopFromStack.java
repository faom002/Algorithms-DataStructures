package StackOperations;

import java.util.Stack;

public class PopFromStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();


        stack.push(2);

        System.out.println("is stack Empty " + isEmpty(stack));
        stack.pop();
        System.out.println("is stack Empty " + isEmpty(stack));
        
        System.out.println( stack.isEmpty());




    }

    public static boolean isEmpty (Stack<Integer> stack){
      int stackSize = 0;
        return stack.size() == stackSize;
    }

}
