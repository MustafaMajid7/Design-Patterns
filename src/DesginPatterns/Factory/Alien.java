package DesginPatterns.Factory;

public class Alien implements enemy{

    private final String name="Alien";
    private final int power=2;
    private final int damage=5;

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", damage=" + damage +
                '}';
    }
}
