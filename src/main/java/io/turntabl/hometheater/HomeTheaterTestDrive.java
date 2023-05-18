package io.turntabl.hometheater;

public class HomeTheaterTestDrive {

    public HomeTheaterTestDrive() {
    }

    public static void main(String[] args) {

        Tuner tuner = new Tuner("Tuner");
        Amplifier amp = new Amplifier("Amplifier", tuner);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        Projector projector = new Projector("Projector", player);
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights("Light");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player,
                projector, lights, screen, popper);


        homeTheater.watchAMovie("Pirate of the Carribeans: Dead men tell no Tales");

        System.out.println("\n================================");
        homeTheater.endMovie();
    }
}
