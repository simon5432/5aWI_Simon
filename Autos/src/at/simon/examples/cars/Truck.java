package at.simon.examples.cars;

public class Truck extends Auto{
    private String trailer;
    public Truck(String color, int maxSpeed, double basePrice, int consumption, Manufacturer manufacturer, Motor motor, int kmZahl, String trailer) {
        super(color, maxSpeed, basePrice, consumption, manufacturer, motor, kmZahl);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Override
    public void drive(double distance) {
        if (super.getKmZahl() > 30000) {
            System.out.println("used up fuel: " + super.getBaseConsumption()*distance*3);
        } else System.out.println("used up fuel: " + super.getConsumption()*distance*3);
        super.setKmZahl((int) (super.getKmZahl()+distance));
    }
}
