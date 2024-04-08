package UI.SimpleSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main  {
    static listener l = new listener();
    static Button button;

    static  CheckBox cb;
    public static void main(String[] args) {
        Frame frame = new Frame("Test frame", false, false, false, 1000, 500);
        frame.setVisible(true);
        button = new Button(frame, 200, 0, 100, 200,true);
        button.addActionListener(l);
        Label label = new Label(frame, 0,0 ,100,20,"Test");
        String[] test = {"1", "2", "3"};
        Dropdown dd = new Dropdown(frame, 0, 300, 100, 30, test);
        TextBox tb = new TextBox(frame, 200, 400, 100, 20);
        cb = new CheckBox(frame, 300, 400, 100, 20,"checked?", false);
        System.out.println(cb.GetIsChecked());
        frame.repaint();
    }

}

class listener implements ActionListener{

    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource().equals(Main.button)){
            System.out.println(Main.cb.GetIsChecked());
        }
    }
}