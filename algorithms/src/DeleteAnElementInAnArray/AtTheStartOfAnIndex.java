package DeleteAnElementInAnArray;

import java.util.Arrays;

import java.util.Random;


public class AtTheStartOfAnIndex {
    public static void main(String[] args) {
        int arr[] = {1254, 1458, 5687, 0, 4554, 5445, 7524};
        int n = arr.length;
        int valueToBeDeleted = 0;
        // value to be deleted
        System.out.println("Array item now"+ Arrays.toString(arr));
        System.out.println("the position of the number which is to be deleted  is " + valueToBeDeleted);

        for(int i=valueToBeDeleted;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        n=n-1;


        // copying over to new array
        int newArr[] = new int[n];

        for(int i = 0; i< arr.length -1; i++) {
            newArr[i] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));
    }
    }


