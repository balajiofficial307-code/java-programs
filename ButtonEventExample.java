import java.awt.*;
import java.awt.event.*;
public class ButtonEventExample extends Frame implements ActionListener
{
    Label lbl;
    Button btnClick, btnReset;
    ButtonEventExample()
    {
        lbl = new Label("Hello World");
        lbl.setBounds(110, 60, 150, 30);
        btnClick = new Button("Click Me");
        btnClick.setBounds(60, 120, 80, 30);
        btnReset = new Button("Reset");
        btnReset.setBounds(170, 120, 80, 30);
        add(lbl);
        add(btnClick);
        add(btnReset);
        btnClick.addActionListener(this);
        btnReset.addActionListener(this);
        setTitle("Button Event Example");
        setSize(320, 220);
        setLayout(null);
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
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnClick)
        {
            lbl.setText("Button Clicked!");
        }
        else if (e.getSource() == btnReset)
        {
            lbl.setText("Hello World");
        }
    }
    public static void main(String args[])
    {
        new ButtonEventExample();
    }
}