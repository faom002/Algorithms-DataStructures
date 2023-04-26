package InsertAnElementInArray;

import java.util.Arrays;

public class AtTheStartingIndex {
    public static void main(String[] args) {
        int arr[] = {1254, 1458, 5687, 1457, 4554, 5445, 7524};
        int n = arr.length;
        int newArr[] = new int[n+1];
        int value = 2000;

        System.out.println(Arrays.toString(arr));
        for(int i = 0; i< arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        newArr[0] = value;
        System.out.println(Arrays.toString(newArr));
    }
    }


