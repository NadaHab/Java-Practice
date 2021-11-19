package Nada2;

public class Item {
    int serialNumber;
    String name;
    String description;
    double weight;
    double price;

    public Item(int serialNumber, String name, String description, double weight, double price) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.price = price;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
