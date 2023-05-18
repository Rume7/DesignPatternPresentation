package io.turntabl.hometheater;

public class StreamingPlayer {

    public void on() {
        System.out.println("Radio is now ON");
    }

    public void setAMStation() {
        System.out.println("54.3AM has been chosen.");
        System.out.println("Enjoy the news.");
    }

    public void setFMStation() {
        System.out.println("99.2FM has been chosen.");
        System.out.println("Enjoy cool music.");
    }

    public void off() {
        System.out.println("Radio is now OFF.");
    }

    @Override
    public String toString() {
        return "Radio Tuner";
    }
}
