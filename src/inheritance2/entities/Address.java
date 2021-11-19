package inheritance2.entities;

public class Address {

    private String country;
    private String city;
    private String street;
    private int buildingNumber;
    private String postalCode;

    public Address() {
    }

    public Address(String country, String city, String street, int buildingNumber, String postalCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.postalCode = postalCode;
    }

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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return
            buildingNumber == address.buildingNumber &&
                country.equals(address.country) &&
                city.equals(address.city) &&
                street.equals(address.street) &&
                postalCode.equals(address.postalCode);
    }

    @Override
    public String toString() {
        return city + ", " + street;
    }
}
