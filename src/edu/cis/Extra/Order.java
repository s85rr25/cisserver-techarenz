package edu.cis.Extra;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Order {
    private String itemID;
    private String type;
    private String orderID;

    public Order(String itemID, String type, String orderID) {
        this.itemID = itemID;
        this.type = type;
        this.orderID = orderID;
    }

    public Order() {

    }

    @Override
    public String toString() {
        return "Order{" +
                "itemID='" + itemID + '\'' +
                ", type='" + type + '\'' +
                ", orderID='" + orderID + '\'' +
                '}';
    }
}
