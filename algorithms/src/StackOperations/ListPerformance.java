package StackOperations;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformance {
    public static void main(String[] args) {
        int n = 100000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by ArrayList to add " + n + " elements: " + (endTime - startTime) + "ms");

        LinkedList<Integer> linkedList = new LinkedList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by LinkedList to add " + n + " elements: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by ArrayList to remove " + n + " elements: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedList.removeLast();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by LinkedList to remove " + n + " elements: " + (endTime - startTime) + "ms");
    }
}
