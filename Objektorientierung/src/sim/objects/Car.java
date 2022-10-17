package sim.objects;

public class Car {
    public int fuelconsumption;
    public String brand;
    public String serialnumber;
    public int fuelAmount;

    public Car(int fuelAmount, int fuelconsumption,String brand, String serialnumber){
        this.fuelconsumption = fuelconsumption;
        this.brand  = brand;
        this.serialnumber = serialnumber;
        this.fuelAmount = fuelAmount;
    }

    public void drive(){
        if (fuelAmount > fuelconsumption) {
            fuelAmount -= fuelconsumption;
            System.out.println("driving");
            return;
        }
        System.out.println("not enough fuel");
    }
}
// Methods