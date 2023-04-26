package WorldCities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class WorldCities {

    private List<City> cities;

    public WorldCities() {

        cities = new ArrayList<>();
    }

    public void add(City city){
        cities.add(city);
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for (City city: cities){
            result.append(city.toString()).append("\n");

        }
        return  result.toString();
    }

    public void sortCityName(){
        Collections.sort(cities);
    }

    // binary search method for finding index to a specific city
    public City binarySearchForFindingSpecifiCity(String cityNameKey){
        // Binary search method for finding a specific city based on its name
         City city = new City(cityNameKey, "");
            int index = Collections.binarySearch(cities,city );
            return cities.get(index);
        }

    /*
    Note that this program has a O(n^2) which will be very slow for large program especially if input files are large
    better solution would be mergesort or quicksort which have a better time complexity O(nlogn)
    */
    public void bubbleSort() {
        int n = cities.size();
        City temp;
        boolean swapped;
        System.out.println("Cities in sorted order:");
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (cities.get(j).compareTo(cities.get(j + 1)) > 0) {
                    temp = cities.get(j);
                    cities.set(j, cities.get(j + 1));
                    cities.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println(cities);
    }


    // linearSearch

    public int linearSearch(String cityAndLatitudeKey) {
        for (int i=0; i<cities.size(); i++) {
            
            // comparing lexicographically since we are working with strings and not int
            if (cities.get(i).getCity().compareToIgnoreCase(cityAndLatitudeKey) == 0 || cities.get(i).getLatitude().compareToIgnoreCase(cityAndLatitudeKey) == 0 ) {
                return i;
            }
        }
        return -1;
    }





    // Merge sort
    public void mergeSort() {
        mergeSortHelper(cities, 0, cities.size() - 1);
    }

    private void mergeSortHelper(List<City> cities, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSortHelper(cities, left, mid);
        mergeSortHelper(cities, mid + 1, right);
        merge(cities, left, mid, right);
    }

    private void merge(List<City> cities, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        List<City> leftHalf = new ArrayList<>();
        List<City> rightHalf = new ArrayList<>();

        for (int i = 0; i < leftSize; i++) {
            leftHalf.add(cities.get(left + i));
        }
        for (int i = 0; i < rightSize; i++) {
            rightHalf.add(cities.get(mid + 1 + i));
        }

        int i = 0, j = 0, k = left;

        while (i < leftSize && j < rightSize) {
            if (leftHalf.get(i).compareTo(rightHalf.get(j)) <= 0) {
                cities.set(k, leftHalf.get(i));
                i++;
            } else {
                cities.set(k, rightHalf.get(j));
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            cities.set(k, leftHalf.get(i));
            i++;
            k++;
        }

        while (j < rightSize) {
            cities.set(k, rightHalf.get(j));
            j++;
            k++;
        }
    }










}




