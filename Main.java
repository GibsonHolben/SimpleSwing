

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main  {
    static listener l = new listener();
    public static void main(String[] args) {
        Frame frame = new Frame("Test frame", false, false, false, 1000, 500);

        Label label2 = new Label(frame, 0,0 ,100,20,"Button");
        Button ExampleButton = new Button(frame, 200, 0, 100, 200,true,"");
        Label label3 = new Label(frame, 0,0 ,100,20,"Text box");

        Label label4 = new Label(frame, 0,0 ,100,20,"Text area");

        Label label5 = new Label(frame, 0,0 ,100,20,"Checkbox");
        CheckBox ExampleCheckBox = new CheckBox(frame, 300, 400, 100, 20,"checked?", false);
        Label label6 = new Label(frame, 0,0 ,100,20,"Dropdown");

        ExampleButton.addActionListener(l);


        String[] test = ;
        Dropdown dd = new Dropdown(frame, 0, 300, 100, 30, new String[]{"1", "2", "3"});
        TextBox tb = new TextBox(frame, 200, 400, 100, 20);
        frame.setVisible(true);
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