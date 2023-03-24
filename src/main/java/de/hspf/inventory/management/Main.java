package de.hspf.inventory.management;

/**
 * Task 7: Create a Java class called Main that will be used to test the
 * program. The class should have a main method that creates an instance of the
 * Store class and calls the methods in the Inventory, Sales, and Purchase
 * classes to test the program.
 */
public class Main
{

    public static void main(String[] args)
    {
        // Create an instance of the Store class
        Store store = new Store();

        // Add some items to the inventory
        Item item1 = new Item("Item 1", 123, 10.0, 1);
        Item item2 = new Item("Item 2", 456, 15.0, 2);
        store.addItemToInventory(item1);
        store.addItemToInventory(item2);

        // Display the inventory
        store.displayInventory();

        // Add a sale
        store.addSale(item1);

        // Display the sales
        store.displaySales();

        // Add an item to the purchase
        store.addItemToPurchase(item2);

        // Display the purchase
        store.displayPurchase();
    }
}
