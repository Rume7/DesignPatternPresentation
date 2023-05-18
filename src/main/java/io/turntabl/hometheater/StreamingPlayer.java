package io.turntabl.hometheater;

public class StreamingPlayer extends ElectronicDevice {

    private Amplifier amplifier;

    public StreamingPlayer(String name, Amplifier amplifier) {
        super(name);
        this.amplifier = amplifier;
    }

    public void pause() {
        System.out.println("Streaming Player has been PAUSED.");
    }

    public void play() {
        System.out.println("Streaming Player has started PLAYING.");
    }

    public void stop() {
        System.out.println("Streaming Player has STOPPED.");
    }

    public void setSurroundSound() {
        this.amplifier.setSurroundSound();
    }
}
