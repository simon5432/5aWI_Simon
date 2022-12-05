package at.simon.examples.cars;

public class Auto {
    private String color;
    private int maxSpeed;
    private double basePrice;
    private double baseConsumption;
    private double consumption;
    private Manufacturer manufacturer;
    private Motor motor;
    private double price;

    private int kmZahl;

    public Auto(String color, int maxSpeed, double basePrice, int consumption, Manufacturer manufacturer, Motor motor, int kmZahl) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = consumption;
        this.manufacturer = manufacturer;
        this.motor = motor;
        this.price = basePrice - (basePrice * manufacturer.getDiscount() * 0.01);
        this.kmZahl = kmZahl;
        this.consumption = baseConsumption * 9.8;
    }

    public void drive(double distance) {
        if (kmZahl > 50000) {
            System.out.println("used up fuel: " + baseConsumption*distance);
        } else System.out.println("used up fuel: " + consumption*distance);
        kmZahl += distance;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getBaseConsumption() {
        return baseConsumption;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Motor getMotor() {
        return motor;
    }

    public double getPrice() {
        return price;
    }

    public double getConsumption() {
        return consumption;
    }

    public int getKmZahl() {
        return kmZahl;
    }

    public void setKmZahl(int kmZahl) {
        this.kmZahl = kmZahl;
    }
}
