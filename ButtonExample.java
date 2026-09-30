import java.awt.*;
public class ButtonExample extends Frame
{
    ButtonExample()
    {
        Button btn = new Button("Click Me");
        btn.setBounds(100, 80, 100, 40);
        add(btn);
        setTitle("Button Example");
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new ButtonExample();
    }
}