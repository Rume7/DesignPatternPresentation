package io.turntabl.robot.robotparts;

public class RobotBody {

    public RobotBody() {}

    /** Manual on how to create a robot*/
    public static void createRobot() {
        System.out.println("Refer to the manual before robot creation.");
    }

    public static void destroyRobot() {
        System.out.println("Refer to the manual before destroying robot.");
    }

    /** Method to create hands of a robot. */
    public void createHands() {
        System.out.println("Robot hands manufactured.");
    }

    /** Method to destroy hands of a robot. */
    public void destroyHands() {
        System.out.println("Destroyed the robot's hands.");
    }

    /** Method to create remaining parts (other than hands) of a robot */
    public void createRemainingParts() {
        System.out.println("Created remaining parts (other than hands).");
    }

    public void destroyRemainingParts() {
        System.out.println("Destroyed the robot's remaining parts.");
    }

    @Override
    public String toString() {
        return "RobotBody {}";
    }
}
