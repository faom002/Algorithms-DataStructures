package WorldCities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class MergeSort {
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

    public static void main(String[] args) throws CsvValidationException, IOException {
        WorldCities worldCities = createWorldCitiesFromFile("/Users/macbook/IdeaProjects/skolenAlgoritmer/algorithms/src/WorldCities/worldcities.csv");
        System.out.println("Before Sorting: \n");
        System.out.println(worldCities);

        System.out.println("After sorting: \n");
        worldCities.mergeSort();
        System.out.println(worldCities);


    }
}
