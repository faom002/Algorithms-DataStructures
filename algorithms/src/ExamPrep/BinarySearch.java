package ExamPrep;

public class BinarySearch {
    public static int binarySearch (int[] arr, int key){
        int low = 0;
        int high = arr.length -1 ;

        while (low <= high){
            int mid = (low + high)/2;

            int result = arr[mid];

            if (result == key) {
            return mid;
            } else if (result > key){
                low = mid +1;
            }else {
                high = mid -1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {12,3,4,6};

        int key = 4;

        int result = binarySearch(arr, key);


        if (result == -1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index: " + result );
        }

    }
}
