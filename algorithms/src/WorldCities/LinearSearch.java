package WorldCities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class LinearSearch {

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


    public static void main(String[] args) throws IOException, CsvValidationException {
        String cityName = "Delhi"; // replace with the city name you want to search for
        String latitude = "28.6667"; // you can also search by using the latitude value
        WorldCities worldCities = createWorldCitiesFromFile("/Users/macbook/IdeaProjects/skolenAlgoritmer/algorithms/src/WorldCities/worldcities.csv");
        System.out.println(worldCities);
        int index = worldCities.linearSearch(latitude);

        if (index != -1) {
            System.out.println("Element is found at index " + index);
        } else {
            System.out.println("Element is not found in the list");
        }
    }


}
