package simple.test2;

/**
 * User: EthanArcher
 * Date: 06/03/2013
 * Time: 16:13
 */

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(){

        setSize(300, 150);
        setTitle("Test 2");
        setLocation(150, 300);

        Container c = getContentPane();
        c.setBackground(Color.blue);

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
