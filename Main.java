public class Main {
  
  public static void main(String[] args) {
    KeyInput keyInput = new KeyInput();
    GamePad gamePad = new GamePad(keyInput.keyUp, keyInput.keyDown, keyInput.keyRight, keyInput.keyLeft);

  }
}