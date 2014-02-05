package com.tictac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * User: EthanArcher
 * Date: 15/05/2013
 * Time: 20:32
 */
public class MyFrame extends JFrame {

    JMenuBar bar;
    JMenu options;
    JMenuItem neww;
    JButton[][] barry = new JButton[3][3];
    int a,b;

    public void findButtonClicked(JButton[][] array, JButton b0)
    {
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                if(b0 == array[i][j]){

                    a=i;
                    b=j;

                }
            }
        }
    }


    public MyFrame (String title, int x, int y, Color col){

        setTitle(title);
        setLocation(x, y);
        setSize(300,300);

        Container c = getContentPane();
        c.setBackground(col);
        c.setLayout(new GridLayout (3,3));

        neww = new JMenuItem("New");
        options = new JMenu("Options");
        options.add(neww) ;
        bar = new JMenuBar();
        bar.add(options);
        setJMenuBar(bar);

        for (int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {

                barry[i][j] = new JButton();
                c.add(barry[i][j]);

                barry[i][j].addActionListener(
                        new ActionListener(){
                            public void actionPerformed(ActionEvent e)
                            {
                                JButton but = (JButton) e.getSource();
                                but.setText("CLiiCK");

                                //findButtonClicked(barry, but);
                                //barry[a][b].setLabel("CLICKED");

                            }
                        }
                );




            }
        }




        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }



}
