package WorldCities;

import java.io.*;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class BinarySearch {

    public static final int cityCol = 0;
    public static final int latitudeCol = 2;


    public static City createCityFromRow(String[] row) {
        City city = new City(row[cityCol], row[latitudeCol]);
        city.setCity(row[cityCol]);
        city.setLatitude(row[latitudeCol]);

        return city;

    }

    public static WorldCities createWorldCitiesFromFile(String fileName) throws IOException, CsvValidationException {
        CSVReader reader = new CSVReader(new FileReader(fileName));
        String[] nextLine;
        WorldCities worldCities = new WorldCities(); // empty World Cities
        reader.readNext(); // getting rid of the first line which is the header city , cityascii etc

        while ((nextLine = reader.readNext()) != null) {
            City city = createCityFromRow(nextLine);
            worldCities.add(city);
        }
        return worldCities;
    }


    public static void main(String[] args) throws CsvValidationException, IOException {

        WorldCities worldCities = createWorldCitiesFromFile("/Users/macbook/IdeaProjects/skolenAlgoritmer/algorithms/src/WorldCities/worldcities.csv");
        worldCities.sortCityName(); // sort out the city names
        System.out.println(worldCities);
        String cityNameKey = "Tokyo";
        City city = worldCities.binarySearchForFindingSpecifiCity(cityNameKey);
        System.out.println("Found " + city);

    }
}




