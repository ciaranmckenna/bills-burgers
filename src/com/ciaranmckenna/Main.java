package com.ciaranmckenna;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger ("Basic", "Beef", "floury", 2.50);
        hamburger.addItem1("onions", 0.30);
        hamburger.addItem2("lettuce", 0.30);

        double price = hamburger.burgerPricing();
        System.out.println("Total cost is " + price);

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 1.50);
        healthyBurger.addAdditionalItem1("Egg", 1.00);
        healthyBurger.addAdditionalItem2("Cucumber", 1.00);
        System.out.println("The total price for a healthy burger is "+ healthyBurger.burgerPricing());

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.burgerPricing();
        System.out.println("The total cost of a healthy burger is: " + deluxeHamburger.burgerPricing());
    }
}
