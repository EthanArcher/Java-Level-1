package com.blue.practical12;

import javax.swing.*;
import java.awt.*;

/**
 * User: EthanArcher
 * Date: 14/05/2013
 * Time: 18:38
 */
public class MyFrame extends JFrame {

    JTextField name, number, address;
    JButton pictureButton;

    private JPanel labelTextPanel(String lab, JTextField text){

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(new JLabel(lab));
        p.add(text);
        return p;

    }

    public MyFrame(int x, int y, String title, Color col)
    {

        setSize(500, 500);
        setLocation(x, y);
        setTitle(title);

        Container c = getContentPane();
        c.setBackground(col);
        c.setLayout(new FlowLayout());

        name = new JTextField(20);
        JPanel p1 = labelTextPanel("Name", name);
        c.add(p1);
        name.setText("Mr Ethan Archer");

        address = new JTextField(20);
        JPanel p2 = labelTextPanel("Address", address);
        c.add(p2);
        address.setText("Ethan's House");

        number = new JTextField(20);
        JPanel p3 = labelTextPanel("Number", number);
        c.add(p3);
        number.setText("0707007070");

        pictureButton = new JButton();
        ImageIcon icon = new ImageIcon("dragon.jpg");
        pictureButton.setIcon(icon);
        c.add(pictureButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }




}
