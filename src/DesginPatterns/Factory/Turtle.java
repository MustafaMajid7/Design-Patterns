package DesginPatterns.Factory;

public class Turtle implements enemy{

    private final String name="turtle";
    private final int power=5;
    private final int damage=1;

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", damage=" + damage +
                '}';
    }
}
