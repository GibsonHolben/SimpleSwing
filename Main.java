

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main  {
    public static void main(String[] args) {
        Frame frame = new Frame("Test frame", false, false, false, 515, 300);

        Label label2 =                   new Label(frame, 0,0 ,100,20,"Button");
        Button ExampleButton =           new Button(frame,0, 30, 100, 200,true,"Example");
        Label label3 =                   new Label(frame, 100,0 ,100,20,"Text box");
        TextBox ExampleTextBox=          new TextBox(frame,100, 30, 100, 20);
        Label label4 =                   new Label(frame, 200,0 ,100,20,"Text area");
        TextBoxArea ExampleTextBoxArea = new TextBoxArea(frame, 200, 30, 100, 20);
        Label label5 =                   new Label(frame, 300,0 ,100,20,"Checkbox");
        CheckBox ExampleCheckBox =       new CheckBox(frame, 300, 30, 100, 20,"checked?", false);
        Label label6 =                   new Label(frame, 400,0 ,100,20,"Dropdown");
        Dropdown ExampleDropdown =       new Dropdown(frame, 400, 30, 100, 30, new String[]{"1", "2", "3"});

        frame.setVisible(true);
        frame.repaint();
    }
}