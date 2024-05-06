

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main  {
    public static void main(String[] args) {
        //Create a simple Frame with  Title, Show top bar, Is the frame on top of everything else, can the frame be resized, width, height
        Frame frame = new Frame("Test frame", false, false, false, 515, 300);

        //Button
        Label label2 =                   new Label(frame,       0,    0 , 100,20, "Button");
        Button ExampleButton =           new Button(frame,      0,    30, 100,200,true,"Example");
        //Text box
        Label label3 =                   new Label(frame,       100,  0 , 100,20, "Text box");
        TextBox ExampleTextBox=          new TextBox(frame,     100,  30, 100,20);
        //Text area
        Label label4 =                   new Label(frame,       200,  0 , 100,20, "Text area");
        TextBoxArea ExampleTextBoxArea = new TextBoxArea(frame, 200,  30, 100,20);
        //CheckBox
        Label label5 =                   new Label(frame,       300,  0 , 100,20, "Checkbox");
        CheckBox ExampleCheckBox =       new CheckBox(frame,    300,  30, 100,20, "checked?", false);
        //Dropdown
        Label label6 =                   new Label(frame,       400,  0 , 100,20, "Dropdown");
        Dropdown ExampleDropdown =       new Dropdown(frame,    400,  30, 100,30, new String[]{"1", "2", "3"});

        frame.setVisible(true);
        frame.revalidate();
    }
}