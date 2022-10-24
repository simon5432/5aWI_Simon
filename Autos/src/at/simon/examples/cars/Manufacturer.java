package at.simon.examples.cars;

public class Manufacturer {
    private String name;
    private String origin;
    private double discount; //in prozent

    public Manufacturer(String name, String origin, double discount) {
        this.name = name;
        this.origin = origin;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public double getDiscount() {
        return discount;
    }
}
