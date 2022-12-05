import at.simon.musikbox.Jukebox;
import at.simon.musikbox.Magazin;
import at.simon.musikbox.Record;
import at.simon.musikbox.Title;

public class Main {
    public static void main(String[] args) {
        Title t1 = new Title(5,"song1");
        Title t2 = new Title(4,"lsaosaodasjd");
        Record r1 = new Record("rec1",2);
        Record r2 = new Record("rec2",4);
        r1.addTitle(t1);
        r1.addTitle(t2);
        r2.addTitle(t2);
        Magazin m1 = new Magazin();
        try {
            m1.addRecord(r1);
            m1.addRecord(r2);
        } catch (Exception e){
            System.out.println(e);
        }
        Jukebox j1 = new Jukebox(m1);
        System.out.println(j1.getMagazin().getSumOfMusic());
        System.out.println(j1.getMagazin().searchRecord("rec1").getRecordTitle());
        try {
            j1.play(1);
        } catch (Exception e){
            System.out.println(e);
        }
        j1.laodRecord(r1);
        try {
            j1.play(2);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}