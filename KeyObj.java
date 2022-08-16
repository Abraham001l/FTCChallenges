public class KeyObj {
    public boolean curState = false;
    public String name = "";

    public KeyObj(boolean state, String Name) {
        curState = state;
        name = Name;
    }

    public void setState(boolean state) {
        curState = state;
    }

    public boolean getState() {
        return curState;
    }
}
