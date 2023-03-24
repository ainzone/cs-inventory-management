package de.hspf.inventory.management;

/**
 * Task 1: Create a Java class called Item that represents a single item in the
 * inventory. The class should have the following attributes: item name, item
 * code, price, and quantity.
 */
public class Item
{

    private String name;
    private int code;
    private double price;
    private int quantity;

    /**
     * Constructor for an Item
     *
     * @param name
     * @param code
     * @param price
     * @param quantity
     */
    public Item(String name, int code, double price, int quantity)
    {
        this.name = name;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName()
    {
        return name;
    }

    public int getCode()
    {
        return code;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
