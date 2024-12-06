package edu.cis.Extra;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Menu {
    private ArrayList<MenuItem> eatriumItems;
    private String adminID;

    // Constructor
    public Menu(ArrayList<MenuItem> item) {
        this.eatriumItems = item;
    }


    // toString method
    @Override
    public String toString() {
        StringBuilder menuString = new StringBuilder();
        menuString.append("Menu (Admin ID: ").append(adminID).append("):\n");
        for (MenuItem item : eatriumItems) {
            menuString.append(item.toString()).append("\n");
        }
        return menuString.toString();
    }

    public void addEatriumItem(MenuItem newItem) {
        eatriumItems.add(newItem);
    }
}
