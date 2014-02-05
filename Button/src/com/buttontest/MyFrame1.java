package com.buttontest;

/**
 * User: EthanArcher
 * Date: 01/05/2013
 * Time: 08:24
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame1 extends JFrame {

    JButton redButton, blueButton;
    JMenuBar bar;
    JMenu colourMenu;
    JMenuItem green, pink;
    Container c = getContentPane();
    JTextField box1;
    String datedate;


    public MyFrame1 (int x, int y, String title, Color col, MyDate todayDate)

    {

        setTitle (title);
        setSize(300,200);
        setLocation(x, y);
        datedate = todayDate.toString();

        c.setBackground(col);

        bar = new JMenuBar();
        colourMenu = new JMenu("Colour");
        green = new JMenuItem("Green");
        pink = new JMenuItem("Pink");
        colourMenu.add(green);
        colourMenu.add(pink);
        bar.add(colourMenu);
        setJMenuBar(bar);

        green.addActionListener(

                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        c.setBackground(Color.green);

                    }
                }
        );

        pink.addActionListener(

                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        c.setBackground(Color.pink);
                    }
                }

        );

        c.setLayout(new FlowLayout());

        redButton = new JButton("Change to Red");
        c.add(redButton);

        redButton.addActionListener(

                new ActionListener() {

                    public void actionPerformed (ActionEvent e)
                    {
                        c.setBackground(Color.red);
                    }
                }

            );

        blueButton = new JButton("Change to Blue");
        c.add(blueButton);

        blueButton.addActionListener(

                new ActionListener() {

                    public void actionPerformed(ActionEvent e)
                    {
                        c.setBackground(Color.blue);
                    }
                }

        );

        box1 = new JTextField(20);
        c.add(box1);

        JButton today = new JButton("The Date?");

        today.addActionListener(

                new ActionListener()
                {

                    public void actionPerformed (ActionEvent e)
                    {
                        box1.setText("Today is the " + datedate);
                    }
                }
        );

        c.add(today);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }




}
