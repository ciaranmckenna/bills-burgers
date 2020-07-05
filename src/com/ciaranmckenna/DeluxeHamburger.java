package com.ciaranmckenna;

public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger() {
        super("Deluxe", "Chicken", "Wheat", 3.5);
        super.addItem1("Chips", 1.50);
        super.addItem2("Coke", 1.00);
    }

    @Override
    public void addItem1(String name, double price)
    {
        System.out.println("Not allowed to add any additional items to a deluxe burger.");
    }

    @Override
    public void addItem2(String name, double price)
    {
        System.out.println("Not allowed to add any additional items to a deluxe burger.");
    }

    @Override
    public void addItem3(String name, double price)
    {
        System.out.println("Not allowed to add any additional items to a deluxe burger.");
    }

    @Override
    public void addItem4(String name, double price)
    {
        System.out.println("Not allowed to add any additional items to a deluxe burger.");
    }
}
