package io.turntabl.hometheater.runapp;

import io.turntabl.hometheater.Amplifier;
import io.turntabl.hometheater.ElectronicDevice;
import io.turntabl.hometheater.StreamingPlayer;

public class MainApp {

    public static void main(String[] args) {
        Amplifier amplifier = null;
        ElectronicDevice device = new StreamingPlayer("Streaming", amplifier);

        device.on();
        device.off();
        System.out.println(device);

    }
}
