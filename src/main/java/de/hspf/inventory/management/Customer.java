package de.hspf.inventory.management;

import java.util.ArrayList;

/**
 * Task 5: Create a Java class called Customer that represents a customer. The
 * class should have the following attributes: customer name, customer ID, and
 * purchase history.
 */
public class Customer
{

    private String name;
    private int id;
    private ArrayList<Purchase> purchaseHistory;

    public Customer(String name, int id, ArrayList<Purchase> purchaseHistory)
    {
        this.name = name;
        this.id = id;
        this.purchaseHistory = purchaseHistory;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public ArrayList<Purchase> getPurchaseHistory()
    {
        return purchaseHistory;
    }

    public void addPurchase(Purchase purchase)
    {
        purchaseHistory.add(purchase);
    }
}
