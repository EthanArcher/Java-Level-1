package simple.test4;

/**
 * User: EthanArcher
 * Date: 06/03/2013
 * Time: 16:27
 */

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame
{
    JButton close, quit, ok, New, cancel;

    public MyFrame(int x, int y, String title, Color col)
    {
        setTitle(title);
        setSize(300, 100);
        setLocation(x, y);

        Container c = getContentPane();
        c.setBackground(col);

		/* Here we use FlowLayout */
        c.setLayout(new FlowLayout());

        close = new JButton("Close");
        c.add(close);

        ok = new JButton("OK");
        c.add(ok);

        quit = new JButton("Quit");
        c.add(quit);

        New = new JButton("New");
        c.add(New);

        cancel = new JButton("Cancel");
        c.add(cancel);

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    } // MyFrame constructor

} // MyFrame
