import java.awt.*;
import java.awt.event.*;
public class GridLayoutExample extends Frame
{
    GridLayoutExample()
    {
        setLayout(new GridLayout(3, 2, 10, 10));
        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));
        add(new Button("Button 4"));
        add(new Button("Button 5"));
        setTitle("GridLayout Example");
        setSize(300, 200);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
                System.exit(0);
            }
        });
    }
    public static void main(String args[])
    {
        new GridLayoutExample();
    }
}