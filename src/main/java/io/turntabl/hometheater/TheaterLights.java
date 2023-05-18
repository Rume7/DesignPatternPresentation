package io.turntabl.hometheater;

public class TheaterLights extends ElectronicDevice{

    private int intensity;

    public TheaterLights(String name) {
        super(name);
    }

    public void dim(int intensity) {
        System.out.println("Lights now dim by " + intensity + " candela");
    }

}
