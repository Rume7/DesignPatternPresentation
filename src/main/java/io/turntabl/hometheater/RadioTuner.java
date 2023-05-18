package io.turntabl.hometheater;

public class RadioTuner extends ElectronicDevice {

    public RadioTuner(String name) {
        super(name);
    }

    public void setAMStation() {
        System.out.println("54.3AM has been chosen.");
        System.out.println("Enjoy the news.");
    }

    public void setFMStation() {
        System.out.println("99.2FM has been chosen.");
        System.out.println("Enjoy cool music.");
    }
}
