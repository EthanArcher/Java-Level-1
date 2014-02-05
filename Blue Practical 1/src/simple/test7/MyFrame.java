package simple.test7;

/**
 * User: EthanArcher
 * Date: 06/03/2013
 * Time: 17:06
 */
import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame
{
    JTextField name, address, number;
    JButton pictureButton;

    private JPanel labelTextPanel(String lab, JTextField txt)
    {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(new JLabel(lab));
        p.add(txt);
        return p;
    }

    public MyFrame(int x, int y, String title, Color col)
    {
        setTitle(title);
        setSize(500, 800);
        setLocation(x, y);

        Container c = getContentPane();
        c.setBackground(col);
        c.setLayout(new FlowLayout());

        name = new JTextField (20);
        JPanel p1 = labelTextPanel("Name", name);
        c.add(p1);
        name.setText("Mr D.Ragon");

        address = new JTextField (20);
        JPanel p2 = labelTextPanel("Address", address);
        c.add(p2);

        number = new JTextField (20);
        JPanel p3 = labelTextPanel("Tel.Number", number);
        c.add(p3);


        pictureButton = new JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("dragon.jpg"));
        pictureButton.setIcon(icon);
        c.add(pictureButton);


        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    } // MyFrame constructor

} // MyFrame