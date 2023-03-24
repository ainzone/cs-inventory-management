package de.hspf.inventory.management;

/**
 * Task 5: Create a Java class called Store that combines the Inventory, Sales,
 * and Purchase classes to create a store management system. The class should
 * have the following methods: add item to inventory, remove item from
 * inventory, display inventory, add sale, remove sale, display sales, add item
 * to purchase, remove item from purchase, and display purchase.
 */
public class Store
{

    private Inventory inventory;
    private Sales sales;
    private Purchase purchase;

    public Store()
    {
        inventory = new Inventory();
        sales = new Sales();
        purchase = new Purchase();
    }

    // inventory methods
    public void addItemToInventory(Item item)
    {
        inventory.addItem(item);
    }

    public void removeItemFromInventory(Item item)
    {
        inventory.removeItem(item);
    }

    public void displayInventory()
    {
        inventory.displayInventory();
    }

    // sales methods
    public void addSale(Item item)
    {
        sales.addSale(item);
    }

    public void removeSale(Item item)
    {
        sales.removeSale(item);
    }

    public void displaySales()
    {
        sales.displaySales();
    }

    // purchase methods
    public void addItemToPurchase(Item item)
    {
        purchase.addItem(item);
    }

    public void removeItemFromPurchase(Item item)
    {
        purchase.removeItem(item);
    }

    public void displayPurchase()
    {
        purchase.displayPurchase();
    }
}
