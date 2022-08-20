import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class GamePad {
    public boolean a = false;
    public boolean b = false;
    public boolean dpad_down = false;
    public boolean dpad_up = false;
    public boolean dpad_left = false;
    public boolean dpad_right = false;
    private ArrayList<String> keys = new ArrayList<String>();


    public GamePad() {
    }

    public void addKey(String keyName) {
        boolean keyFound = false;
        for (int i = 0; i < keys.size(); i++) {
            String curKey = keys.get(i);
            if (curKey.equals(keyName)) {
                keyFound = true;
            }
        }
        if (keyFound == false) {
            keys.add(keyName);
        }
    }

    public void removeKey(String keyName) {
        for (int i = 0; i < keys.size(); i++) {
            String curKey = keys.get(i);
            if (curKey.equals(keyName)) {
                keys.remove(i);
            }
        }
    }

    public ArrayList<String> getActiveKeys() {
        return keys;
    }
}