package Nada2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static void clientCreation() {

        Client anthony = new Client(333, "Anthony", "Hopkins", 11111111,
                new Address(9336, 0, "Civic Center Drive",
                        "Beverly Hills", "California"),
                new Phone(111, 222, 333, 12),
                "anthonyUserName", "12345672");

        Client john = new Client(111, "John", "Abbott", 2,
                new Address(21, 275, "Rue Lakeshore Road",
                        "Sainte-Anne-de-Bellevue", "QC"),
                new Phone(514, 457, 5036),
                "johnUserName", "001568123");

        Client tom = new Client(222, "Tom", "Sawyer", 3,
                new Address(1840, 700, "Century Park East",
                        "Los Angeles", "California"),
                new Phone(123, 456, 0000),
                "tomUserName", "7894564213");

        addClientCreation(anthony);
        addClient(john);
        addClient(tom);

    }



    static void InitializeDataArrays(){
        ArrayList<Person> personArrayList= new ArrayList<>();
        ArrayList<Client> clientArrayList= new ArrayList<>();
        ArrayList<Item> itemArrayList= new ArrayList<>();
        ArrayList<Order> orderArrayList = new ArrayList<>();
        ArrayList<Address> listAddress = new ArrayList<Address>();
    }

    public static  printClientArray();{

    }

    public static void main(String[] args) {
        InitializeDataArrays();
        clientCreation();
        printClientArray();

//
//
//
////        ClientDataCollection("John Abbott", 111, "514 457 5036", "Montreal", "Canada Quebec",
////                "21 275 Rue Lakeshore Road", "Saint Anne de Bellevue", "QC", "H9X 3L9");
////        Collections.sort(carArrayList);
////        showDataCollection();
////        storeinitializer();
////        Collections.sort(carArrayList);
//
//    }
//    private static void showDataCollection() {
//        System.out.println("\n\nDataCollection state: \n" + clientDataCollection + "\n");
//    }
//    public static storeinitializer(){
//        System.out.println();
//
    }


}
