package de.hspf.inventory.management;

import java.util.ArrayList;

/**
 * Task 2: Create a Java class called Inventory that represents the store's
 * inventory. The class should have the following methods: add item, remove
 * item, and display inventory.
 */
public class Inventory
{

    private ArrayList<Item> items;

    public Inventory()
    {
        items = new ArrayList<>();
    }

    public void addItem(Item item)
    {
        items.add(item);
    }

    public void removeItem(Item item)
    {
        items.remove(item);
    }

    public void displayInventory()
    {
        for (Item item : items)
        {
            System.out.println(item.getName() + " - " + item.getQuantity());
        }
    }
}
