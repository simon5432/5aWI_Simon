import at.simon.lamppackage.GlowingElement;
import at.simon.lamppackage.Lamp;

public class Main {
    public static void main(String[] args) {
        GlowingElement elem1 = new GlowingElement("name1","blue", false,5);
        GlowingElement elem2 = new GlowingElement("name2","blue", true,5);
        GlowingElement elem3 = new GlowingElement("name3","blue", false,5);
        GlowingElement elem4 = new GlowingElement("name4","blue", true,5);
        Lamp lamp1 = new Lamp();
        lamp1.addLightElement(elem1);
        lamp1.addLightElement(elem2);
        lamp1.addLightElement(elem3);
        lamp1.addLightElement(elem4);
        System.out.println(lamp1.getOverallPowerUsage());
        lamp1.turnAllOn();
        System.out.println(lamp1.getOverallPowerUsage());
        lamp1.printNameOfLightElements();

    }
}