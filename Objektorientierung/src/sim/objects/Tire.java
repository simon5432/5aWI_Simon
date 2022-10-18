package sim.objects;

public class Tire {
    private int size;
    public enum TYPE{winter, summer}
    private TYPE type;

    public Tire(int size, TYPE type) {
        this.size = size;
        this.type = type;
    }
}
