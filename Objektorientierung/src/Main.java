import sim.objects.*;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        Tank t1 = new Tank(50,30);
        RearviewMirror r1 = new RearviewMirror(50,0);
        RearviewMirror r2 = new RearviewMirror(40,-3);
        Tire Tire1 = new Tire(50, Tire.TYPE.summer);

        Car c1 = new Car(e1,t1, r1, r2,7,"mercedes", "5134");
        c1.getRearMirrors();


        c1.drive(6);
        c1.honk(2);
    }
}