package com.clyck.core;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HotKeyManager {

    private Runnable startAction;
    private Runnable stopAction;

    public HotKeyManager(Runnable startAction, Runnable stopAction) {
        this.startAction = startAction;
        this.stopAction = stopAction;
    }

    public void keyPressed(KeyEvent e){

        if (e.getKeyCode() == KeyEvent.VK_F6) {
            startAction.run();
        }
        if (e.getKeyCode() == KeyEvent.VK_F7) {
            stopAction.run();
        }
    }
    @Override
    public void keyReleased(KeyEvent e){ }

    @Override
    public void keyTyped(KeyEvent e){ }


}
