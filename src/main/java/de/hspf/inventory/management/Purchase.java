package de.hspf.inventory.management;

import java.util.ArrayList;

/**
 * Task 4: Create a Java class called Purchase that represents a customer's
 * purchase. The class should have the following methods: add item to purchase,
 * remove item from purchase, and display purchase.
 */
public class Purchase
{

    private ArrayList<Item> items;

    public Purchase()
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

    public void displayPurchase()
    {
        double totalCost = 0;
        for (Item item : items)
        {
            totalCost += item.getPrice();
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total Cost: $" + totalCost);
    }
}
