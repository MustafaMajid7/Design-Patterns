package DesginPatterns.builder;

public class ElectricalDevice {

    private String name;
    private double cost;
    private String model;
    private String company;
    private String vendor;

    public ElectricalDevice(String name, double cost, String model, String company, String vendor) {
        this.name = name;
        this.cost = cost;
        this.model = model;
        this.company = company;
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return "ElectricalDevice{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", model='" + model + '\'' +
                ", company='" + company + '\'' +
                ", vendor='" + vendor + '\'' +
                '}';
    }
}
