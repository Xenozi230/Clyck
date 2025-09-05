package com.clyck.core;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Clyck {

    private Robot robot;

    public Clyck() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void clickLeft() {
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public void clickRight() {
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }

    public void doubleClick() {
        clickLeft();
        try {
            Thread.sleep(50);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickLeft();
    }
}
