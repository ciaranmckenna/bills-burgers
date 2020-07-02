package com.ciaranmckenna;

public class Hamburger {

    private String name;
    private String meat;
    private String breadRoll;
    private boolean lettuce;
    private boolean onions;
    private boolean tomatoes;
    private boolean carrot;
    private double price;

    public Hamburger(String meat, String breadRoll, double price)
    {
        this.meat = meat;
        this.breadRoll = breadRoll;
        this.price = price;
    }

    public void burgerCost()
    {
        System.out.println("trace cost in base class");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public void setBreadRoll(String breadRoll) {
        this.breadRoll = breadRoll;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public boolean isOnions() {
        return onions;
    }

    public void setOnions(boolean onions) {
        this.onions = onions;
    }

    public boolean isTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(boolean tomatoes) {
        this.tomatoes = tomatoes;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
