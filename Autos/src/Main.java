import at.simon.examples.cars.Auto;
import at.simon.examples.cars.Manufacturer;
import at.simon.examples.cars.Motor;
import at.simon.examples.cars.Truck;

public class Main {
    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer("wowski","Austria", 10);
        Motor motor = new Motor(10, Motor.TYPE.diesel);
        Auto auto = new Auto("blue",300,500000,25,manufacturer,motor,300);
        auto.drive(30000);
        auto.drive(30000);
        auto.drive(30000);

        Truck t1 = new Truck("blue",4,400000,23,manufacturer,motor,300,"trailer1");
        System.out.println(t1.getColor() + t1.getTrailer());
    }

}