package io.turntabl.hometheater.facade;

import io.turntabl.hometheater.*;

public class HomeTheaterFacade {

    private Amplifier amplifier;
    private Tuner tuner;
    private StreamingPlayer player;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner,
                             StreamingPlayer player, Projector projector,
                             TheaterLights lights, Screen screen,
                             PopcornPopper popper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchAMovie(String movie) {
        System.out.println("Get ready to watch ===> " + movie.toUpperCase());
        popper.on();
        popper.pop();       // Get some popcorn
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setSurroundSound();
        player.on();
        player.play();
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        lights.on();
        player.stop();
        player.off();
        amplifier.off();
        projector.off();
        screen.up();
        popper.off();
    }
}
