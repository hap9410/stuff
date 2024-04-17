package org.ea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main implements KeyListener {
    static boolean enabled = false;

    public static void main(String[] args) {
        Main ac = new Main();
        try {

            JFrame f=new JFrame();
            f.addKeyListener(ac);
            f.setSize(100, 100);
            f.setVisible(true);

            Robot r = new Robot();
            int button = InputEvent.BUTTON1_DOWN_MASK;

            while (true) {
                if(enabled) {
                    System.out.println("Click");
                    r.mousePress(button);
                    Thread.sleep(400);
                    r.mouseRelease(button);
                }
                Thread.sleep( 2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            enabled = !enabled;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}