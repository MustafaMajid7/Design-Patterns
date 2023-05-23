package DesginPatterns.decorator;

public class Espresso implements beverage{

    private String name = "Espresso";
    private double cost = 1.5;

    @Override
    public String description() {
        return name;
    }

    @Override
    public double cost() {
        return cost;
    }
}
