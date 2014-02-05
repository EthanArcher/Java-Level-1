package simple.test6;

/**
 * User: EthanArcher
 * Date: 06/03/2013
 * Time: 16:58
 */
import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame
{
    JTextField name, address, number;

    public MyFrame(int x, int y, String title, Color col)
    {
        setTitle(title);
        setSize(300, 150);
        setLocation(x, y);

        Container c = getContentPane();
        c.setBackground(col);
        c.setLayout(new FlowLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        name = new JTextField (20);
        p1.add(new JLabel("Name"));
        p1.add(name);
        c.add(p1);

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        address = new JTextField (20);
        p2.add(new JLabel("Address"));
        p2.add(address);
        c.add(p2);

        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        number = new JTextField (20);
        p3.add (new JLabel ("Tel.Number"));
        p3.add(number);
        c.add(p3);

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    } // MyFrame constructor

} // MyFrame
