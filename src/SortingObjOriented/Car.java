package SortingObjOriented;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//public class Car implements Comparable {
//
//    String brand;
//    int model;
//
//    public Car(String brand, int model) {
//        this.brand = brand;
//        this.model = model;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public int getModel() {
//        return model;
//    }
//
//    public void setModel(int model) {
//        this.model = model;
//    }
//
//    @Override
//    public String toString() {
//        return "<" +
//            brand +
//            ", " + model +
//            ">";
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        return this.brand.compareTo(((Car)o).getBrand());
//    }

//    @Override // Implement the compareTo method defined in Comparable
//    public int compareTo(Object o) {
//        if (this.model > ((Car)o).getModel())
//            return 1;
//        else if (this.model < ((Car)o).getModel())
//            return -1;
//        else
//            return 0;
//    }
//}

class SortingDemo {

    public static void main(String[] args) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.addAll(Arrays.asList(
                new Car("Toyota",2020),
                new Car("Audi",2022),
                new Car("Mazda",2017)
            )
        );
        Collections.sort(carArrayList);
        System.out.println(carArrayList);
    }
}