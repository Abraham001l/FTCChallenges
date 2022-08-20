import java.util.*;
import javax.swing.*;

import netscape.javascript.JSObject;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.*;

public class OpMode {
  GamePad gamePad = new GamePad();
  HardwareMap hardwareMap = new HardwareMap();
  DcMotor motor1 = hardwareMap.get(DcMotor.class, "motor1");

  public OpMode() {
    init();
    JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setFocusable(true);

    JPanel panel = new JPanel();
    JLabel up = new JLabel();
    JLabel down = new JLabel();
    JLabel left = new JLabel();
    JLabel right = new JLabel();

    panel.add(up);
    panel.add(down);
    panel.add(right);
    panel.add(left);

    up.setText("Up: 0");
    down.setText("Down: 0");
    right.setText("Right: 0");
    left.setText("Left: 0");

    frame.addKeyListener(new KeyListener() {
      int upCount = 0;
      int downCount = 0;
      int rightCount = 0;
      int leftCount = 0;

      @Override
      public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
          case KeyEvent.VK_UP:
            up.setText("Up: " + Integer.toString(upCount++));
            gamePad.addKey("keyUp");
            break;
          case KeyEvent.VK_DOWN:
            down.setText("Down: " + Integer.toString(downCount++));
            gamePad.addKey("keyDown");
            break;
          case KeyEvent.VK_RIGHT:
            right.setText("Right: " + Integer.toString(rightCount++));
            gamePad.addKey("keyRight");
            break;
          case KeyEvent.VK_LEFT:
            left.setText("Left: " + Integer.toString(leftCount++));
            gamePad.addKey("keyLeft");
            break;
        }
      }

      @Override
      public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
          case KeyEvent.VK_UP:
            gamePad.removeKey("keyUp");
            break;
          case KeyEvent.VK_DOWN:
            gamePad.removeKey("keyDown");
            break;
          case KeyEvent.VK_RIGHT:
            gamePad.removeKey("keyRight");
            break;
          case KeyEvent.VK_LEFT:
            gamePad.removeKey("keyLeft");
            break;
        }
      }

      @Override
      public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
      }

    });

    frame.add(panel);
    while (frame.isActive() == false || frame.isActive() == true) {
      loop();
    }
  }

  public void init() {
    // your code
  }

  public void init_loop() {
    // your code
  }

  public void start() {
    // runtime code
  }

  public void loop() {
    System.out.println(gamePad.getActiveKeys().toString());
  }

  public void stop() {
    // your code
  }
}