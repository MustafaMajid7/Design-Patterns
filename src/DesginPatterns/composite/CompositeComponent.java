package DesginPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeComponent implements Component {

    private String name;
    private List<Component> devices = new ArrayList<>();

    public CompositeComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDevice(List<Component> components){
        devices.addAll(components);
    }

    public String showDesc(){
        String Desc ="";

        for (Component sd : devices) {
            Desc += sd.showDesc();
            Desc += " ";
        }
        return Desc;
    }

    public double showPrice(){
        double Price=0.0;
        for (Component sd : devices)
            Price += sd.showPrice();

        return Price;
    }

}
