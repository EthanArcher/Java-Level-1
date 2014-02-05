package simple.test3;

/**
 * User: EthanArcher
 * Date: 06/03/2013
 * Time: 16:22
 */

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame
{

    public MyFrame(int x, int y, String title, Color col)
    {
        setSize(300, 150);
        setTitle(title);
        setLocation(x, y);

        Container c = getContentPane();
        c.setBackground(col);

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    } // MyFrame constructor

} // MyFrame
