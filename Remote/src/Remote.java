import java.util.ArrayList;

public class Remote {
    private String color;
    private String brand;
    private ArrayList<Battery> batteries;

    public Remote(String color, String brand) {
        this.color = color;
        this.brand = brand;
        this.batteries = new ArrayList<>();
    }

    public void getStatus(){
        System.out.println((this.batteries.get(0).getCapacityPercentage()+this.batteries.get(1).getCapacityPercentage())/2);
    }
    public void turnOn(){
        int cap1 = this.batteries.get(0).getCapacityPercentage();
        int cap2 = this.batteries.get(1).getCapacityPercentage();
        if (cap1 >= 5 && cap2 >= 5) {
            System.out.println("Gerät angeschalten");
            cap1 -= 5;
            cap2 -= 5;
        } else System.out.println("not enough battery percentage");

    }
    public void turnOff(){
        System.out.println("keine Verbraucher angeschlossen");
    }

    public void pressButton(int number){
        switch(number){
            case 0:
                System.out.println("i ist null");
                break;
            case 1:
                System.out.println("i ist eins");
                break;
            case 2:
                System.out.println("i ist zwei");
                break;
            case 3:
                System.out.println("i ist drei");
                break;
            default:
                System.out.println("Diesen Button gibt es leider nicht");
                break;
        }
    }

    public void add(Battery bat) {
        if(this.batteries.size() <= 2) {
            this.batteries.add(bat);
        }else System.out.println("There are already 2 Batteries");
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public ArrayList<Battery> getBatteries() {
        return batteries;
    }
}
