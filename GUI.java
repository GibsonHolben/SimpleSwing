package UI.SimpleSwing;

import javax.swing.*;
import java.awt.*;

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
    Frame(String title, boolean undecorated , boolean onTop, boolean resizable, int sizeX, int sizeY) {
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
     * Sets the color of the window
     * @param color The new color of the window
     */
    public void setColor(Color color) {
        this.setBackground(color);
    }
}

class TextBox extends JTextField{

}
class Dropdown extends JComboBox{

}

/**
 * A simplified JLabel
 */
class Label extends JLabel{
    /**
     * Creates a JLabel
     * @param frame The frame to be added to
     * @param x the X cor
     * @param y the Y cor
     * @param sizeX the X size
     * @param sizeY the Y size
     * @param text the text of the label
     */
    Label(Frame frame, int x, int y, int sizeX, int sizeY, String text)
    {
        this.setBounds(x,y,sizeX,sizeY);
        this.setText(text);
        startup(frame);
    }

    /**
     * Simple startup things
     * @param frame The frame to be added to
     */
    void startup(Frame frame)
    {
        this.setVisible(true);
        setColor(Color.white);
        frame.panel.add(this);
    }

    /**
     * Sets the size of the label
     * @param sizeX the X Size
     * @param sizeY the Y Size
     */
    public void setSize(int sizeX, int sizeY) {
        this.setBounds(this.getX(),this.getY(),sizeX,sizeY);
    }

    /**
     * Sets the pos of the component
     * @param x the X cor
     * @param y the Y cor
     */
    public void setPos(int x, int y) {
        this.setBounds(x,y,this.getSize().width,this.getSize().height);
    }

    /**
     * Sets the color of the compoent
     * @param color the new color
     */
    public void setColor(Color color) {
        this.setBackground(color);
    }

}

/**
 * A simplified JButton
 */
class Button extends JButton {
    /**
     * Create a Button with no text
     * @param frame The frame to be added to
     * @param x the X cor
     * @param y the Y cor
     * @param sizeX the X size
     * @param sizeY the Y size
     */
    Button(Frame frame, int x, int y, int sizeX, int sizeY) {
        this.setBounds(x,y,sizeX,sizeY);
        startup(frame, this);
    }

    /**
     * Creates a button with text
     * @param frame The frame to be added to
     * @param x the X cor
     * @param y the Y cor
     * @param sizeX the X size
     * @param sizeY the Y size
     * @param text The text of the button
     */
    Button(Frame frame, int x, int y, int sizeX, int sizeY, String text) {
        this.setBounds(x,y,sizeX,sizeY);
        this.setText(text);
        startup(frame, this);
    }

    /**
     * Simple startup things
     * @param frame The frame to be added to
     */
    void startup(Frame frame, JComponent comp)
    {
        comp.setVisible(true);
        setColor(Color.white);
        frame.panel.add(comp);
    }

    /**
     * Sets the size of the label
     * @param sizeX the X Size
     * @param sizeY the Y Size
     */
    public void setSize(int sizeX, int sizeY) {
        this.setBounds(this.getX(),this.getY(),sizeX,sizeY);
    }

    /**
     * Sets the pos of the component
     * @param x the X cor
     * @param y the Y cor
     */
    public void setPos(int x, int y) {
        this.setBounds(x,y,this.getSize().width,this.getSize().height);
    }

    /**
     * Sets the color of the compoent
     * @param color the new color
     */
    public void setColor(Color color) {
        this.setBackground(color);
    }

}