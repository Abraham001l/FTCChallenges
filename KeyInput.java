import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class KeyInput {
    public KeyObj keyUp = new KeyObj(false, "keyUp");
    public KeyObj keyDown = new KeyObj(false, "keyDown");
    public KeyObj keyRight = new KeyObj(false, "keyRight");
    public KeyObj keyLeft = new KeyObj(false, "keyLeft");

    public KeyInput() {
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

            public boolean getKeyUp() {
                return keyUp.getState();
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        up.setText("Up: " + Integer.toString(upCount++));
                        keyUp.setState(true);
                        break;
                    case KeyEvent.VK_DOWN:
                        down.setText("Down: " + Integer.toString(downCount++));
                        keyDown.setState(true);
                        break;
                    case KeyEvent.VK_RIGHT:
                        right.setText("Right: " + Integer.toString(rightCount++));
                        keyRight.setState(true);
                        break;
                    case KeyEvent.VK_LEFT:
                        left.setText("Left: " + Integer.toString(leftCount++));
                        keyLeft.setState(true);
                        break;
                }

                if (keyUp.getState() == true) {
                    System.out.println("keyUp: " + keyUp.getState());
                }
                if (keyDown.getState() == true) {
                    System.out.println("keyDown: " + keyDown.getState());
                }
                if (keyRight.getState() == true) {
                    System.out.println("keyRight: " + keyRight.getState());
                }
                if (keyLeft.getState() == true) {
                    System.out.println("keyLeft: " + keyLeft.getState());
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                up.setText("Up: " + 0);
                down.setText("Up: " + 0);
                right.setText("Up: " + 0);
                left.setText("Up: " + 0);
                keyUp.setState(false);
                keyDown.setState(false);
                keyRight.setState(false);
                keyLeft.setState(false);
            }

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

        });

        frame.add(panel);
    }
}