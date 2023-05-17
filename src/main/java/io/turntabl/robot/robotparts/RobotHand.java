package io.turntabl.robot.robotparts;

public class RobotHand {

    private RobotHandType robotHandType;

    public RobotHand() {}

    public void setRobotHands(RobotHandType handType) {
        this.robotHandType = handType;
        System.out.println(handType.name() + " robot hand has been made.");
    }

    public void resetRobotHands() {
        this.robotHandType = RobotHandType.DEFAULT;
        System.out.println(this.robotHandType.name() + " robot hand has been reset.");
    }

    @Override
    public String toString() {
        return "RobotHand{robotHandType = " + robotHandType + '}';
    }
}
