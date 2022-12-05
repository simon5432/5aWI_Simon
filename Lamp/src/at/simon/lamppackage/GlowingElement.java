package at.simon.lamppackage;

public class GlowingElement {
    private String name;
    private String color;
    private boolean state;
    private double powerConsumption;

    public GlowingElement(String name, String color, boolean state, double powerConsumption) {
        this.name = name;
        this.color = color;
        this.state = state;
        this.powerConsumption = powerConsumption;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }
}
