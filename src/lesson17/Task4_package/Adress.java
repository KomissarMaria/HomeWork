package lesson17.Task4_package;

public class Adress {
    public String country;
    public String city;
    public String street;

    @Override
    public String toString() {
        return country + ", " + city + ", " + street + " street";
    }
}
