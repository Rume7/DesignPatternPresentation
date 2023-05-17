package io.turntabl.robot.robotparts;

import java.awt.*;

public class RobotColor {

    private Color color;

    public RobotColor() {}

    public void setDefaultColor() {
        this.color = Color.BLACK;
    }

    public void setChoiceColor(Color color) {
        this.color = color;

    }

    @Override
    public String toString() {
        return "RobotColor{color = " + color + " }";
    }
}
