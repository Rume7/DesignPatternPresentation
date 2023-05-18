package io.turntabl.hometheater;

public class Amplifier extends ElectronicDevice {

    private Tuner tuner;
    private SoundVolume volume;

    public Amplifier(String name, Tuner tuner) {
        super(name);
        this.tuner = tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setVolume(SoundVolume volume) {
        this.volume = volume;
    }

    public void setSurroundSound() {
        System.out.println("Enjoy a studio sound effect.");
    }
}
