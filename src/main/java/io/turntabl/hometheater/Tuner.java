package io.turntabl.hometheater;

public class Tuner extends ElectronicDevice {

    private float frequency;

    public Tuner(String name) {
        super(name);
        this.frequency = 88.9f;
    }

    public void setAMStation() {
        System.out.println("AM dial has been chosen.");
        System.out.println("Enjoy the news on " + this.frequency + "AM");
    }

    public void setFMStation() {
        System.out.println("FM dial has been chosen.");
        System.out.println("Enjoy cool music on " + this.frequency + "FM");
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }
}
