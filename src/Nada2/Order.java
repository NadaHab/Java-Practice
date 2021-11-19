package Nada2;

import java.util.ArrayList;

public class Order extends Client {
    int orderId;
    Item items;
    double totalPrice;

    public Order(Address address, Phone phone, String userName, String password, int clientID, int orderId, Item items, double totalPrice) {
        super(address, phone, userName, password, clientID);
        this.orderId = orderId;
        this.items = items;
        this.totalPrice = totalPrice;
    }
}
