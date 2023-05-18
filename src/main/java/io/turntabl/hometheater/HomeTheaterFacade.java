package io.turntabl.hometheater;

public class HomeTheaterFacade {

    private Amplifier amplifier;
    private RadioTuner radioTuner;
    private StreamingPlayer player;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amplifier, RadioTuner radioTuner,
                             StreamingPlayer player, Projector projector,
                             TheaterLights lights, Screen screen,
                             PopcornPopper popper) {
        this.amplifier = amplifier;
        this.radioTuner = radioTuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchAMovie(String movie) {
        System.out.println("Get ready to watch a movie...");

    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
    }
}
