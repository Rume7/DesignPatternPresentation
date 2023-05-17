package io.turntabl.robot.robotfacade;

import io.turntabl.robot.robotparts.RobotBody;
import io.turntabl.robot.robotparts.RobotColor;
import io.turntabl.robot.robotparts.RobotHand;
import io.turntabl.robot.robotparts.RobotHandType;

import java.awt.*;

public class RobotFacade {

    private final RobotColor robotColor;
    private final RobotHand robotHand;
    private final RobotBody robotBody;

    public RobotFacade() {
        this.robotColor = new RobotColor();
        this.robotHand = new RobotHand();
        this.robotBody = new RobotBody();
    }

    /** Constructing a robot. */
    public void constructRobot() {
        RobotBody.createRobot();
        System.out.println("Initiating the process of creating a robot.");
        robotColor.setDefaultColor();
        robotHand.setRobotHands(RobotHandType.MILANO);
        robotBody.createHands();
        robotBody.createRemainingParts();
        System.out.println("A Robot is created.\n");
    }

    public void destroyRobot() {
        RobotBody.destroyRobot();
        System.out.println(" Initiating Robot's destruction process.");
        //robotHand.resetRobotHands();
        robotBody.destroyHands();
        robotBody.destroyRemainingParts();
        System.out.println(" A Robot is being destroyed.\n");
    }

}
