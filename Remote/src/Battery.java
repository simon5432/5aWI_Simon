public class Battery {
    private float capacity;
    private int capacityPercentage;

    public Battery(float capacity, int capacityPercentage) {
        this.capacity = capacity;
        this.capacityPercentage = capacityPercentage;
    }

    public float getCapacity() {
        return capacity;
    }

    public int getCapacityPercentage() {
        return capacityPercentage;
    }

    public void setCapacityPercentage(int capacityPercentage) {
        if(capacityPercentage >= 100) {
            this.capacityPercentage = 100;
        } else if(capacityPercentage > 0) {
            this.capacityPercentage = capacityPercentage;
        } else this.capacityPercentage = 0;


    }
}
