package at.simon.lamppackage;


import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<GlowingElement> glowingElements;

    public Lamp() {
        this.glowingElements = new ArrayList<>();
    }

    public void addLightElement(GlowingElement glowingElement){
        this.glowingElements.add(glowingElement);
    }
    public void turnAllOn(){
        for (GlowingElement elem:this.glowingElements) {
            elem.setState(true);
        }
    }
    public double getOverallPowerUsage() {
        double powerUsage = 0;
        for (GlowingElement elem:this.glowingElements)
            if (elem.isState()){
                powerUsage += elem.getPowerConsumption();
        }
        return powerUsage;
    }
    public void printNameOfLightElements(){
        for (GlowingElement elem:this.glowingElements) {
            System.out.println(elem.getName());
        }
    }
}

