package sim.objects;

public class Tank {
    private int maxCapacity;
    public float currentCapacity;

    public Tank(int maxCapacity, float currentCapacity){
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public float getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }
}
