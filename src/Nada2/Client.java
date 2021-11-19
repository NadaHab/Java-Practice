package Nada2;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Client extends Person {

    int clientID;
    Address address;
    Phone phone;
    String userName;
    String password;

    public Client(Address address, Phone phone, String userName, String password, int clientID) {
        this.address = address;
        this.phone = phone;
        this.userName = userName;
        this.password = password;
        this.clientID = clientID;
    }

    public int getClientID() {
        return ClientID;
    }

    public Address getAddress() {
        return address;
    }

    public Phone getPhone() {
        return phone;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setClientID(int clientID) {
        ClientID = clientID;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //    public static ArrayList<clientDataCollection> Client(int clientID, String userName, String password) {
//        this.clientID = clientID;
//        this.userName = userName;
//        if (password.length() < 8)
//            System.out.println("Password cannot be less than 8 characters.");
//        else
//            this.password = password;
//        return clientDataCollection.add(clientID, userName, password);
//
//    }
//
//    public void setClientID(int id) {
//        this.clientID = id;
//    }

}
