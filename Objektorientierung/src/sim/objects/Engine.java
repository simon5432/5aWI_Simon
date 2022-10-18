package sim.objects;

public class Engine {
    public enum TYPE{DIESEL,GASOLINE};
    private int horsePower;
    private TYPE type; //diesel oder Benzin

    public Engine(int horsePower, TYPE type){
        this.horsePower = horsePower;
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }
}
