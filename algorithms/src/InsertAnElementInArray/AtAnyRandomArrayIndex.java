package InsertAnElementInArray;

import java.util.Arrays;
import java.util.Random;

public class AtAnyRandomArrayIndex {
    public static void main(String[] args) {

            int arr[] = {1254, 1458, 5687, 1457, 4554, 5445, 7524};
            int n = arr.length;
            int newArr[] = new int[n];
            Random rand = new Random();
            int value = (int) Math.floor(Math.random() * 100 + 1);

            System.out.println("Original Array: " + Arrays.toString(arr));
            for(int i = 0; i < n; i++) {
                int randomIndex = rand.nextInt(n);
                newArr[randomIndex] = arr[i] +value;

            }
            System.out.println("Randomized Array: " + Arrays.toString(newArr));
        }
    }

