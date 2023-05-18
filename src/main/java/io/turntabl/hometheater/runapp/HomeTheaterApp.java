package io.turntabl.hometheater.runapp;

import io.turntabl.hometheater.*;
import io.turntabl.hometheater.facade.HomeTheaterFacade;

public class HomeTheaterApp {

    private HomeTheaterFacade homeTheater;

    public HomeTheaterApp() {
        Tuner tuner = new Tuner("Tuner");
        Amplifier amp = new Amplifier("Amplifier", tuner);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        Projector projector = new Projector("Projector", player);
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights("Light");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        this.homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper);
    }

    private HomeTheaterFacade getHomeTheater() {
        return this.homeTheater;
    }

    public static void main(String[] args) {
        HomeTheaterApp theaterApp = new HomeTheaterApp();
        HomeTheaterFacade theaterFacade = theaterApp.getHomeTheater();

        theaterFacade.watchAMovie("Pirate of the Carribeans: Dead men tell no Tales");
        System.out.println("\n========================================");
        theaterFacade.endMovie();
    }
}
