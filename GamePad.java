public class GamePad {
    public KeyObj keyUp;
    public KeyObj keyDown;
    public KeyObj keyRight;
    public KeyObj keyLeft;
    public boolean a = false;
    public boolean b = false;
    public boolean dpad_down = false;
    public boolean dpad_up = false;
    public boolean dpad_left = false;
    public boolean dpad_right = false;



    public GamePad(KeyObj keyup, KeyObj keydown, KeyObj keyright, KeyObj keyleft) {
        keyUp = keyup;
        keyDown = keydown;
        keyRight = keyright;
        keyLeft = keyleft;
    }

    public boolean getKeyUp() {
        return keyUp.getState();
    }

    public boolean getKeyDown() {
        return keyDown.getState();
    }

    public boolean getKeyRight() {
        return keyRight.getState();
    }

    public boolean getKeyLeft() {
        return keyLeft.getState();
    }
}