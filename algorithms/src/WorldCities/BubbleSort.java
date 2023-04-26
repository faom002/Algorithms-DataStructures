package WorldCities;

import com.opencsv.CSVReader;

import java.io.*;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class BubbleSort {
    public static final int cityCol = 0;
    public static final int latitudeCol = 2;

    public static City createCityFromRow(String[] row){
        City city = new City(row[cityCol],row[latitudeCol]);
        city.setCity(row[cityCol]);
        city.setLatitude(row[latitudeCol]);

        return city;

    }
    public static WorldCities createWorldCitiesFromFile(String cityFilePathName) throws IOException, CsvValidationException {


        CSVReader readerFromFile = new CSVReader(new FileReader(cityFilePathName));
        String [] nextLine;
        WorldCities worldCities = new WorldCities(); // empty World Cities
        readerFromFile.readNext(); // getting rid of the first line which is the header city , cityascii etc

        while ((nextLine = readerFromFile.readNext()) != null){
            City city = createCityFromRow(nextLine);
            worldCities.add(city);
        }
        return worldCities;


    }

    public static void main(String[] args) throws IOException, CsvValidationException {
        WorldCities worldCities = createWorldCitiesFromFile("/Users/macbook/IdeaProjects/skolenAlgoritmer/algorithms/src/WorldCities/worldcities.csv");
        System.out.println("Not in sorted order: \n");
        System.out.println(worldCities);
        /*
         it will take time depending on your computer and how fast it is because bubblesort
         has a worse time Complexity than mergeSort and QuickSort when it comes to sorting large information.
        */
        worldCities.bubbleSort();
    }



}
