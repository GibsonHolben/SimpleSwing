package UI.SimpleSwing;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("Test frame", false, false, false, 1000, 500);
        frame.setVisible(true);
        Button button = new Button(frame, 200, 0, 100, 200);
    }
}