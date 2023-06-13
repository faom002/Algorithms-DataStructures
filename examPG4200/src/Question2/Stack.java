package Question2;

public class Stack {

    private final java.util.Stack<Integer> stack = new java.util.Stack<>();
    private final java.util.Stack<Integer> stackForKeepingTrackOnMinValues = new java.util.Stack<>();

    public void push(int x) {

        // checking if stack is full and giving it maxSize 100 for values of the stack
        if (isFullStack(stack, 100)) {
            System.out.println("overflow");
            return;
        }

        stack.push(x);

        if (isEmptyStack(stackForKeepingTrackOnMinValues) || x <= stackForKeepingTrackOnMinValues.peek()) {
            stackForKeepingTrackOnMinValues.push(x);
        }

    }

    public int pop() {
        // checking if empty stack
        if (isEmptyStack(stack)) {
            return -1;
        }

        if (stack.pop() == stackForKeepingTrackOnMinValues.peek()) {
            stackForKeepingTrackOnMinValues.pop();
        }
        return stack.pop();

    }

    public int getMin() {
        // checking if empty stack
        if (isEmptyStack(stack)) {
            System.out.println("underflow");
            return -1;
        }
        return stackForKeepingTrackOnMinValues.peek();
    }

    // I could use stack.empty, but I had a different approach for checking if stack is empty :)
    public static boolean isEmptyStack(java.util.Stack<Integer> stack) {
        int stackSize = 0;
        return stack.size() == stackSize;
    }


    // A method for making sure that our stack only takes in 100 integers
    public static boolean isFullStack(java.util.Stack<Integer> stack, int maxSize) {
        return stack.size() >= maxSize;
    }

    public static void main(String[] args) {
        Stack question2 = new Stack();

        // empty stack to begin with
        System.out.println(question2.stack);

        // pushing elements to stack
        question2.push(1100);
        question2.push(1030);
        question2.push(140);
        question2.push(130);
        question2.push(110);

        // checking all elements in stack
        System.out.println(question2.stack);

        // here we will get 120 for min value
        System.out.println(question2.getMin());

        // executing pop on stack
        question2.pop();

        // checking all elements in stack
        System.out.println(question2.stack);

        // 130 is the new min value after pop operation
        System.out.println(question2.getMin());
    }


    /*
        Explanation of code:

        My code follows an approach that doesn't depend on the size of the stack.
        Instead, it first checks if the stack is full before pushing a new element. Then,
        it checks if the new element is the new minimum value and, if so, pushes it to the stackForKeepingTrackOnMinValues.
        These operations take constant time O(1), meaning that the time it takes to execute them doesn't depend on the size of the stack.
    */


}