public class Main {
    public static void main(String[] args) {
        Remote remote1 = new Remote("blue", "Sony");
        Battery bat1 = new Battery(30,100);
        Battery bat2 = new Battery(30,100);

        remote1.add(bat1);
        remote1.add(bat2);
        remote1.getBatteries();
        remote1.TurnOn();
        remote1.getStatus();
        bat1.setCapacityPercentage(4);
        remote1.TurnOn();
    }
}