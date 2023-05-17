package io.turntabl.robot;

import io.turntabl.robot.robotfacade.RobotFacade;

public class FacadePatternExample {

    public FacadePatternExample() {}

    public static void main(String[] args) {
        System.out.println("***Facade Pattern Demo****");

        // Creating a Robot
        RobotFacade milanoRobotFacade = new RobotFacade();
        milanoRobotFacade.constructRobot();
        milanoRobotFacade.destroyRobot();

    }
}
