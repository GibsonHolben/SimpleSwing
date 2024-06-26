import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

class Operations extends JComponent{
    /**
     * Simple startup things
     * @param frame The frame to be added to
     */
    static void startup(Frame frame, JComponent add) {
        add.setVisible(true);
        setColor(Color.white, add);
        frame.panel.add(add);
    }

    static void startup(JPanel panel, JComponent add) {
        add.setVisible(true);
        setColor(Color.white, add);
        panel.add(add);
    }

    /**
     * Sets the size of the label
     * @param sizeX the X Size
     * @param sizeY the Y Size
     */
    static public void setSize(int sizeX, int sizeY, JComponent todo) {
        todo.setBounds(todo.getX(),todo.getY(),sizeX,sizeY);
    }

    /**
     * Sets the pos of the component
     * @param x the X cor
     * @param y the Y cor
     */
    static public void setPos(int x, int y,JComponent todo) {
        todo.setBounds(x,y,todo.getSize().width,todo.getSize().height);
    }

    /**
     * Sets the color of the component
     * @param color the new color
     */
    static public void setColor(Color color, JComponent todo) {
        todo.setBackground(color);
    }
}

/**
 * A simplified JFrame
 */
class Frame extends JFrame {
    /**A JPanel that holds the components*/
    public JPanel panel = new JPanel();

    /**
     * Creates a Frame
     * @param title The title of the
     * @param undecorated Is the window decorated
     * @param onTop Is the window on top of the screen
     * @param resizable Is the window resizable
     * @param sizeX The X size of the window
     * @param sizeY The Y size of the window
     */
    public Frame(String title, boolean undecorated, boolean onTop, boolean resizable, int sizeX, int sizeY) {
        panel.setLayout(null);
        this.add(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle(title);
        this.setUndecorated(undecorated);
        this.setAlwaysOnTop(onTop);
        this.setResizable(resizable);
        panel.setSize(sizeX,sizeY);
        this.setSize(sizeX,sizeY);
    }

    /**
     * Sets the icon of the frame
     * @param path path to the image
     */
    public void setIcon(String path){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(path));
    }
    public void setColor(Color color) {
        panel.setBackground(color);
    }

}
class CheckBox extends JCheckBox {

    private boolean isChecked;
    CheckBox(Frame frame, int x, int y, int sizeX, int sizeY, String Text, boolean checked)
    {
        this.setBounds(x,y,sizeX,sizeY);
        this.setText(Text);
        this.setSelected(checked);
        this.setFocusPainted(false);
        isChecked = checked;
        this.addItemListener(e -> isChecked = e.getStateChange() == ItemEvent.SELECTED);
        Operations.startup(frame,this);
    }
    CheckBox(JPanel panel, int x, int y, int sizeX, int sizeY, String Text, boolean checked)
    {
        this.setBounds(x,y,sizeX,sizeY);
        this.setText(Text);
        this.setSelected(checked);
        this.setFocusPainted(false);
        isChecked = checked;
        this.addItemListener(e -> isChecked = e.getStateChange() == ItemEvent.SELECTED);
        Operations.startup(panel,this);
    }
    public boolean GetIsChecked(){return isChecked;}
}
/**
 * Text box is used to display a simple text box that can be written to and read from
 */
class TextBoxArea extends JTextArea{


    /**
     * Creates a simple text box that can be written to and read from
     * @param frame The frame to be added to
     * @param x the X cor
     * @param y the Y cor
     * @param sizeX the X size
     * @param sizeY the Y size
     */
    TextBoxArea(Frame frame, int x, int y, int sizeX, int sizeY)
    {
        this.setBounds(x,y,sizeX,sizeY);
        Operations.startup(frame,this);
    }
    TextBoxArea(JPanel panel, int x, int y, int sizeX, int sizeY)
    {
        this.setBounds(x,y,sizeX,sizeY);
        Operations.startup(panel,this);
    }
}

/**
 * Text box is used to display a simple text box that can be written to and read from
 */
class TextBox extends JTextField{

    /**
     * Creates a simple text box that can be written to and read from
     * @param frame The frame to be added to
     * @param x the X cor
     * @param y the Y cor
     * @param sizeX the X size
     * @param sizeY the Y size
     */
    TextBox(Frame frame, int x, int y, int sizeX, int sizeY)
    {
        this.setBounds(x,y,sizeX,sizeY);
        Operations.startup(frame, this);
    }
    TextBox(JPanel panel, int x, int y, int sizeX, int sizeY)
    {
        this.setBounds(x,y,sizeX,sizeY);
        Operations.startup(panel, this);
    }
}

/**
 * A simplified JCombobox (currently only supports Strings, but we plan to expand in the future
 */
class Dropdown extends JComboBox<String>{
    /**
     * Creates a simple dropdown menu
     * @param frame The frame to be added to
     * @param x the X cor
     * @param y the Y cor
     * @param sizeX the X size
     * @param sizeY the Y size
     */
    Dropdown(Frame frame, int x, int y, int sizeX, int sizeY, String[] array)
    {
        super(array);
        this.setBounds(x,y,sizeX,sizeY);
        Operations.startup(frame,this);
    }
    Dropdown(JPanel panel, int x, int y, int sizeX, int sizeY, String[] array)
    {
        super(array);
        this.setBounds(x,y,sizeX,sizeY);
        Operations.startup(panel,this);
    }
}

/**
 * A simplified JLabel for simple swing
 */
class Label extends JLabel{
    /**
     * Creates a JLabel
     * @param frame The frame to be added to
     * @param x the X cor
     * @param y the Y cor
     * @param sizeX the X size
     * @param sizeY the Y size
     * @param text the text of the label*/
    Label(Frame frame, int x, int y, int sizeX, int sizeY, String text) {
        this.setBounds(x,y,sizeX,sizeY);
        this.setText(text);
        Operations.startup(frame, this);
    }
    Label(JPanel panel, int x, int y, int sizeX, int sizeY, String text) {
        this.setBounds(x,y,sizeX,sizeY);
        this.setText(text);
        Operations.startup(panel, this);
    }
}

/**
 * A simplified JButton
 */
class Button extends JButton {

    /**
     * Creates a button with text
     * @param frame The frame to be added to
     * @param x the X cor
     * @param y the Y cor
     * @param sizeX the X size
     * @param sizeY the Y size
     * @param text The text of the button
     */
    Button(Frame frame, int x, int y, int sizeX, int sizeY, boolean enabled, String text) {
        this.setBounds(x,y,sizeX,sizeY);
        this.setText(text);
        Operations.startup(frame, this);
        this.setEnabled(enabled);
        this.setFocusPainted(false);
    }

    Button(JPanel panel, int x, int y, int sizeX, int sizeY, boolean enabled, String text) {
        this.setBounds(x,y,sizeX,sizeY);
        this.setText(text);
        Operations.startup(panel, this);
        this.setEnabled(enabled);
        this.setFocusPainted(false);
    }


}