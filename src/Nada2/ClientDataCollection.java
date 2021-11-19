package Nada2;


import java.util.ArrayList;

public class ClientDataCollection extends Client implements Comparable {


//    public ClientDataCollection(String name, int serialNumber, Phone phone, String city, String country, String province,
//
//                                ArrayList<Client> clientDataCollection) {
//        this.clientDataCollection. = clientDataCollection;
//    }
//
//    public static ArrayList<Client> UpdatePhoneNumber(int clientID) {
//        ArrayList updatedArray = new ArrayList();
//        return updatedArray;
//    }

    public ClientDataCollection(int serialNumber, String name, String description, double weight, double price, ArrayList<Client> clientDataCollection) {
        super(serialNumber, name, description, weight, price);
        this.clientDataCollection = clientDataCollection;
    }


    public static void removeDuplicates(ArrayList<Integer> list) {
        boolean found = false;
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            j = i + 1;
            while (j < list.size()) {
                if (list.get(i) == list.get(j))
                    list.remove(j);
                else
                    j++;
            }
        }
    }
    @Override
    public int compareTo(Object o) {
        return this.firstName.compareTo(((clientDataCollection)o).getBrand());
    }

}

