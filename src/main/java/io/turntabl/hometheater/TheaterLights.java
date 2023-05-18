package io.turntabl.hometheater;

public class TheaterLights extends ElectronicDevice{

    public TheaterLights(String name) {
        super(name);
    }

    public void dim() {
        System.out.println("Lights now dim.");
    }

}
