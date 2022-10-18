package sim.objects;

public class RearviewMirror {
    private int size;
    private int position; //0 neutral, -10 nach hinten, +10 nach vorne

    public RearviewMirror(int size, int position) {
        this.size = size;
        this.position = position;
    }
}
