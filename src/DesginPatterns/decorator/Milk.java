package DesginPatterns.decorator;

public class Milk extends Toppings{

    Coffee coffee ;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String description() {
        return coffee.description()+" With Milk";
    }

    @Override
    public double cost() {
        return coffee.cost()+.75;
    }
}
