package simple.test5;

/**
 * User: EthanArcher
 * Date: 06/03/2013
 * Time: 16:31
 */
import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame
{
    JButton[][] square = new JButton[4][4];

    public MyFrame(int x, int y, String title, Color col)
    {
        setTitle(title);
        setSize(300, 300);
        setLocation(x, y);

        Container c = getContentPane();
        c.setBackground(col);

		/* Here we use GridLayout */
        c.setLayout(new GridLayout(4, 4));

        for (int i=0; i<4; i++)
        {

            for (int j=0; j<4; j++)
            {
                square[i][j] = new JButton(i+","+j);
                square[i][j].setOpaque(true);
                square[i][j].setBorderPainted(false);
                c.add(square[i][j]);


            }
            square[i][i].setBackground(Color.blue);
        }

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    } // MyFrame constructor

} // MyFrame
