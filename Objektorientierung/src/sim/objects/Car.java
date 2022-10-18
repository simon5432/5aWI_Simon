package sim.objects;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private Engine engine;
    private Tank tank;
    private ArrayList<RearviewMirror> rearMirrors;
    private ArrayList<Tire> tires;
    private int fuelconsumption;
    private String brand;
    private String serialnumber;

    public Car(Engine engine, Tank tank, RearviewMirror rearMirror1,RearviewMirror rearMirror2, int fuelconsumption, String brand, String serialnumber){
        this.fuelconsumption = fuelconsumption;
        this.brand  = brand;
        this.serialnumber = serialnumber;
        this.engine = engine;
        this.tank = tank;
        this.rearMirrors = new ArrayList<>();
        this.rearMirrors.add(rearMirror1);
        this.rearMirrors.add(rearMirror2);
        this.tires = new ArrayList<>();
    }

    public void addMirror(RearviewMirror rearMirror) {
        this.rearMirrors.add(rearMirror);
    }

    public List<RearviewMirror> getRearMirrors() {
        return rearMirrors;
    }

    //methods
    public void drive(float speed){
        float fuelMultiplier = (speed/100); //forces values between 0 and 1 so they can be used as a multiplier
        System.out.println(tank.currentCapacity);
        if (tank.currentCapacity > fuelconsumption * fuelMultiplier) {
            tank.currentCapacity -= fuelconsumption * fuelMultiplier;
            System.out.println("driving with " + this.engine.getHorsePower() + " horsepower and" + speed + "km/h fast" +
                    "\n" + this.tank.currentCapacity + " liters of fuel are left");
            return;
        }
        System.out.println("not enough fuel");
    }

    public void honk(int amountOfRepetitions){
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("hooonk hooonk");
        }
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getFuelconsumption() {
        return fuelconsumption;
    }

    public void setFuelconsumption(int fuelconsumption) {
        this.fuelconsumption = fuelconsumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }
}
// Methods