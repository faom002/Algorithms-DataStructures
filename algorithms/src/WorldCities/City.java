package WorldCities;



public class City implements Comparable<City>{

    public City(String city, String latitude) {
        this.city = city;
        this.latitude = latitude;

    }

    private String city;
    private String latitude;




    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }








public String toString(){
    return city + " " + latitude ;
}


    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCity());
    }
}
