package Nada2;

public class Address {
    int number;
    int buildingNumber;
    String street;
    String city;
    String country;

    public Address() {
    }

    public Address(int number, int buildingNumber, String street, String city, String country) {
        this.number = number;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.country = country;
    }

    public int getNumber() {return number;}

    public void setNumber(int number) {this.number = number;}

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }


    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingNumber=" + buildingNumber +
                '}';
    }
}
}
