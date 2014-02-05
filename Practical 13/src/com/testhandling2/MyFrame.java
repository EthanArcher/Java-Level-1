package com.testhandling2;

/**
 * User: EthanArcher
 * Date: 14/03/2013
 * Time: 21:27
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame
{
    JTextField box1, box2;
    JButton copyDown, copyUp, swap;

    public MyFrame()
    {
        setTitle("Test Event Handling 2");
        setSize(300, 150);
        setLocation(100, 100);

        Container c = getContentPane();
        c.setBackground(Color.red);
        c.setLayout(new FlowLayout());

        box1 = new JTextField (20);
        c.add(box1);

        copyDown = new JButton("Copy v");
        c.add(copyDown);

        copyDown.addActionListener (
                new ActionListener()
                {	public void actionPerformed(ActionEvent e)
                    {	String t = box1.getText();
                        box2.setText(t);
                    }
                }	);

        copyUp = new JButton("Copy ^");
        c.add(copyUp);

        copyUp.addActionListener (
                new ActionListener()
                {	public void actionPerformed(ActionEvent e)
                    {	String t = box2.getText();
                        box1.setText(t);
                    }
                }	);

        swap = new JButton("Swap");
        c.add(swap);

        swap.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e)
                    {   String upperbox = box1.getText();
                        String lowerbox = box2.getText();
                        box1.setText(lowerbox);
                        box2.setText(upperbox);
                    }
                }
        );

        box2 = new JTextField (20);
        c.add(box2);

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    } // MyFrame constructor

} // MyFrame



