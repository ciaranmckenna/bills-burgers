package com.ciaranmckenna;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1;
    private double healthyExtra1Price;
    private String healthyExtra2;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price)
    {
        super("Healthy", meat, "rye", price);
    }

    public void addAdditionalItem1(String name, double price)
    {
        this.healthyExtra1 = name;
        this.healthyExtra1Price = price;
    }

    public void addAdditionalItem2(String name, double price)
    {
        this.healthyExtra2 = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double burgerPricing() {
        double hamburgerPrice = super.burgerPricing();
        if(this.healthyExtra1 != null){
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1 + " for an extra " + this.healthyExtra1Price);
        }
        if(this.healthyExtra2 != null){
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2 + " for an extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;

    }
}
