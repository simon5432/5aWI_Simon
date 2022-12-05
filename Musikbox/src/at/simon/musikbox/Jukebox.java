package at.simon.musikbox;

public class Jukebox {
    private Magazin magazin;
    public Jukebox(Magazin magazin) {
        this.magazin = magazin;
    }
    public Magazin getMagazin() {
        return magazin;
    }
    public void laodRecord(Record record) {
        this.magazin.loadRecord(record);
    }
    public void play(int num) throws Exception{
        this.magazin.play(num);
    }
}
