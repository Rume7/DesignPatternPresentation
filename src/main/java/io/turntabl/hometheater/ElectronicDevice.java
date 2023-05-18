package io.turntabl.hometheater;

public abstract class ElectronicDevice {

    private String name;

    public ElectronicDevice(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + " is now ON");
    }

    public void off() {
        System.out.println(this.name + " is now OFF.");
    }

    @Override
    public String toString() {
        return "{ name = " + this.name + " }";
    }
}
