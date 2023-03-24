package de.hspf.inventory.management;

import java.util.ArrayList;

/**
 * Task 3: Create a Java class called Sales that represents the store's sales.
 * The class should have the following methods: add sale, remove sale, and
 * display sales.
 */
public class Sales
{

    private ArrayList<Item> sales;

    public Sales()
    {
        sales = new ArrayList<>();
    }

    public void addSale(Item item)
    {
        sales.add(item);
    }

    public void removeSale(Item item)
    {
        sales.remove(item);
    }

    public void displaySales()
    {
        double totalSales = 0;
        for (Item item : sales)
        {
            totalSales += item.getPrice();
        }
        System.out.println("Total Sales: $" + totalSales);
    }
}
