package DesginPatterns.composite;

public class SimpleDevice implements Component{

    private String name;
    private double price;

    public SimpleDevice(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String showDesc() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double showPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SimpleDevice{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
