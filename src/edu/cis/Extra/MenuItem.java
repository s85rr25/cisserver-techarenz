package edu.cis.Extra;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String id;
    private int amountAvailable;
    private String type;

    public MenuItem(String name, String description, double price, String id, String type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.id = id;
        this.amountAvailable = 10;
        this.type = type;
    }

    public MenuItem() {

    }

    private String generateID() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                ", amountAvailable=" + amountAvailable +
                ", type='" + type + '\'' +
                '}';
    }

    public void minusAmountAvailable() {
        this.amountAvailable -= 1;
    }
}
