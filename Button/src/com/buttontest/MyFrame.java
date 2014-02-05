package com.buttontest;

/**
 * User: EthanArcher
 * Date: 07/03/2013
 * Time: 00:26
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame
{
    JButton hello, goodbye;
    JMenuBar bar;
    JMenu colourMenu;
    JMenuItem green, pink;

    public MyFrame(int x, int y, String title, Color col)
    {
        setTitle(title);
        setSize(300, 200);
        setLocation(x, y);

        Container c = getContentPane();
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

                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Container c = getContentPane();
                        c.setBackground(Color.green);

                    }
                }

        );

        pink.addActionListener(

                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Container c = getContentPane();
                        c.setBackground(Color.pink);

                    }
                }

        );


		/* Here we use FlowLayout */
        c.setLayout(new FlowLayout());

        hello = new JButton("Go Blue");
        c.add(hello);

        hello.addActionListener(

                new ActionListener() {

                    public void actionPerformed (ActionEvent e){
                        Container c = getContentPane();
                        c.setBackground(Color.blue);

                    }
                }
        );

        goodbye = new JButton("Go Red");
        c.add(goodbye);

        goodbye.addActionListener(

                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {

                        Container c = getContentPane();
                        c.setBackground(Color.red);
                    }
                }
        );

        JTextField box1 = new JTextField(20);
        c.add(box1);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    } // MyFrame constructor

} // MyFrame
