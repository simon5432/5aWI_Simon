import sim.objects.Car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(7,6,"mercedes", "5134");

        Car c2 = new Car(5,6,"mercedes", "5134");

        c1.drive();
    }
}