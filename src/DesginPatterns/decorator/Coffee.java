package DesginPatterns.decorator;

public class Coffee implements beverage {
    String name = "basic coffee";
    private double cost = .5;


    @Override
    public String description() {
        return name;
    }

    @Override
    public double cost() {
        return cost;
    }

}
