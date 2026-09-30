import java.awt.*;
public class HelloWorldAWT extends Frame
{
    HelloWorldAWT()
    {
        Label lbl = new Label("Hello World");
        lbl.setBounds(100, 100, 100, 30);
        add(lbl);
        setTitle("Hello World AWT");
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new HelloWorldAWT();
    }
}