import at.simon.rechner.Rechner;
import at.simon.rechner.Wissenschaftlich;
import at.simon.rechner.Wurzel;

public class Main {
    public static void main(String[] args) {
        Rechner r1 = new Rechner();
        Wissenschaftlich w1 = new Wissenschaftlich();
        Wurzel wurz1 = new Wurzel();

        System.out.println(r1.addition(1, 4));
        System.out.println(w1.addition(1, 4));
        System.out.println(wurz1.root(16));
    }
}