package io.turntabl.hometheater;

public class MainApp {

    public static void main(String[] args) {

        ElectronicDevice device = new Projector("Projector", new StreamingPlayer());

        device = new PopcornPopper("Popcorn Popper");

        device.on();
        device.off();
        System.out.println(device);

    }
}
