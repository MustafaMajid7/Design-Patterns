package DesginPatterns.builder;

public class BuilderElectricalDevice {

    private String name;
    private double cost;
    private String model;
    private String company;
    private String vendor;

    public BuilderElectricalDevice setName(String name) {
        this.name = name;
        return this;
    }

    public BuilderElectricalDevice setCost(double cost) {
        this.cost = cost;
        return this;
    }

    public BuilderElectricalDevice setModel(String model) {
        this.model = model;
        return this;
    }

    public BuilderElectricalDevice setCompany(String company) {
        this.company = company;
        return this;
    }

    public BuilderElectricalDevice setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    public ElectricalDevice getDevice (){
        return new ElectricalDevice(this.name,this.cost,this.model,this.company,this.vendor);
    }
}
