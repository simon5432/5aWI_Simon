package at.simon.examples.cars;

public class Motor {
    public enum TYPE{gasoline, diesel};
    private int performance;
    private TYPE type;


    public Motor(int performance, TYPE type) {
        this.performance = performance;
        this.type = type;
    }

    public int getPerformance() {
        return performance;
    }

    public TYPE getType() {
        return type;
    }
}

