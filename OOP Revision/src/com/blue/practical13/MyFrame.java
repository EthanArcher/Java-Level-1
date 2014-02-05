package com.blue.practical13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * User: EthanArcher
 * Date: 14/05/2013
 * Time: 20:45
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame
{
    JTextField original, upperCase, lowerCase;
    JButton reset, toUpperCase, toLowerCase;
    public MyFrame()
    {
        setSize(200, 300);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        original = new JTextField (15) ;
        upperCase = new JTextField (15);
        lowerCase = new JTextField (15);
        reset = new JButton("Reset");
        toUpperCase = new JButton("To Upper Case");
        toLowerCase = new JButton("To Lower Case");
        c.add(new JLabel("Original"));
        c.add(original);
        c.add(new JLabel("Upper Case"));
        c.add(upperCase);
        c.add(new JLabel("Lower Case"));
        c.add(lowerCase);
        c.add(reset);
        c.add(toUpperCase);
        c.add(toLowerCase);
// add event handlers for clearAll and swap:
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}