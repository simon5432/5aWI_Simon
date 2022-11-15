package at.simon.phoneparts;

import java.util.concurrent.atomic.AtomicInteger;

public class SimCard {
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
    private int id;
    private String number;

    public SimCard(String number) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void callNumber(String number) {
        System.out.println("calling " + number);
    }
}
