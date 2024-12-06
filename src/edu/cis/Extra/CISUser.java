package edu.cis.Extra;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

@Getter
@Setter
public class CISUser {
    private String userID;
    private String name;
    private String yearLevel;
    private ArrayList<Order> orders;
    private double money;
    public CISUser(String userID, String name, String yearLevel) {
        this.userID = userID;
        this.name = name;
        this.yearLevel = yearLevel;
        this.orders = new ArrayList<>();
        this.money = 50.0; // Starting amount
    }

    public CISUser() {
        this.orders = new ArrayList<>();
    }

    public String orderToString() {
        Iterator<Order> it = orders.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            Order order = it.next();
            sb.append(order);
            if (!it.hasNext()) {
                return sb.toString();
            }
            sb.append(',').append(' ');
        }
    }

    @Override
    public String toString() {
        StringBuilder orderString = new StringBuilder();
        for (Order order : orders) {
            orderString.append(order.toString()).append(", ");
        }
        return "CISUser{" +
                "userID='" + userID + '\'' +
                ", name='" + yearLevel + '\'' +
                ", yearLevel='" + name + '\'' +
                ", orders= " + orderString +
                "money=" + money +
                '}';
    }

    public void spend(double price) {
        this.money -= price;
    }
}