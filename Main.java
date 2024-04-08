package UI.SimpleSwing;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("Test frame", false, false, false, 1000, 500);
        frame.setVisible(true);
        Button button = new Button(frame, 200, 0, 100, 200,false);
        Label label = new Label(frame, 0,0 ,100,20,"Test");
        Dropdown dd = new Dropdown(frame, 0, 300, 100, 30);
        TextBox tb = new TextBox(frame, 200, 400, 100, 20);
        frame.repaint();
    }
}