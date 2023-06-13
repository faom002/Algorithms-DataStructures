package Question5;

public class Fibonacci {
    // code inspiration https://www.geeksforgeeks.org/different-ways-to-print-fibonacci-series-in-java/
   //iterative fibonacci
    static void printFibonacciSeries(int n) {

        int previous = 0, current = 1, counter;
        // looping through the elements
        for (counter = 0; counter < n; counter++) {
            // printing out the numbers
            System.out.print(previous + " ");
            // keeping the previous number and current number in temp
            int temp = previous + current;
            // swap previous number with current
            previous = current;
            // set current to temp
            current = temp;
        }
    }

    // Fibonacci Recursion
    static int fibonacciRecursive(int n)
    {

        // Base Case for 0 and 1
        if (n <= 1) {
            return n;
        }

        // Recursive call the fibonacci method were we take the n-1 which is the previous + n-2 which is the current
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        // n input = 5 as said in task
        int n = 5;
        System.out.println("iterative version");
        // call on fibonacci iterative version
        printFibonacciSeries(n);
        System.out.println();
        System.out.println("Recursive version");

        for (int counter = 0; counter < n ; counter++) {
            //call on fibonacci recursion version
            System.out.print( fibonacciRecursive(counter) + " ");
        }


    }


    /*
   justifying which algorithm is better:

   In my opinion, the recursive variant of the algorithm is excellent because of its ease of understanding and adherence to the same mathematical definition.
   On the other hand, the iterative variant is advantageous for its ability to handle large inputs quickly during execution.
   so When dealing with large input data, it is advisable to opt for an iterative approach instead.

    */
}
