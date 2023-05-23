package DesginPatterns.decorator;

public class Cream extends Toppings{

    Coffee coffee ;

    public Cream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String description() {
        return coffee.description()+" With Cream";
    }

    @Override
    public double cost() {
        return coffee.cost()+1.25;
    }
}
