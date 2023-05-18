package io.turntabl.hometheater;

public class Projector extends ElectronicDevice {

    private StreamingPlayer streamingPlayer;

    public Projector(String name, StreamingPlayer streamingPlayer) {
        super(name);
        this.streamingPlayer = streamingPlayer;
    }

    public void tvMode() {
        System.out.println("Projector is now in TV mode.");
    }

    public void wideScreenMode() {
        System.out.println("Projector is in screen mode.");
    }
}
