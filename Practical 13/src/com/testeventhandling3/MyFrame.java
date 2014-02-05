package com.testeventhandling3;

/**
 * User: EthanArcher
 * Date: 14/03/2013
 * Time: 22:14
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame
{
    JButton[][] b = new JButton[3][3];
    int x, y; // clicked button
    int insert = 0;

    private void findClickedButton(JButton[][] b, JButton b0)
    {	// sets outer x, y to the indices of where 'b0' is in 'b'
        for (int i=0; i<3; i++)
            for (int j=0; j<3; j++)
                if (b0 == b[i][j])
                {
                    x = i;
                    y = j;
                    return;
                }
    }

    public MyFrame()
    {
        setTitle("Test Event Handling 3");
        setSize(300, 300);
        setLocation(100, 100);

        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 3));

        for (int i=0; i<3; i++)
            for (int j=0; j<3; j++)
            {
                b[i][j] = new JButton();
                c.add(b[i][j]);
                b[i][j].addActionListener(
                        new ActionListener()
                        {	public void actionPerformed(ActionEvent e)
                            {
                                JButton b0 = (JButton) e.getSource();
                                findClickedButton (b, b0); // coords placed in x, y
                                insert++;

                                if (insert%2 == 0){
                                    b[x][y].setLabel("O");
                                }
                                else b[x][y].setLabel("X");

                            }
                        });
            }

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    } // MyFrame constructor

} // MyFrame