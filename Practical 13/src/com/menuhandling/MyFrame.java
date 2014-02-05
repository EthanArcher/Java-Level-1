package com.menuhandling;

/**
 * User: EthanArcher
 * Date: 14/03/2013
 * Time: 22:52
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame
{
    JTextField box1, box2;
    JMenuBar bar;
    JMenu copyMenu;
    JMenuItem down, up, clear, exit;

    public MyFrame()
    {
        setTitle("Menu Handling Demo");
        setSize(300, 150);
        setLocation(100, 100);

        Container c = getContentPane();
        c.setBackground(Color.red);
        c.setLayout(new FlowLayout());

        box1 = new JTextField (20);
        c.add(box1);
        box2 = new JTextField (20);
        c.add(box2);

        down = new JMenuItem("Down");
        up = new JMenuItem("Up");
        clear = new JMenuItem("Clear");
        exit = new JMenuItem("Exit");
        copyMenu = new JMenu ("Copy");
        copyMenu.add(down);
        copyMenu.add(up);
        copyMenu.add(clear);
        copyMenu.add(exit);
        bar = new JMenuBar();
        bar.add(copyMenu);
        setJMenuBar(bar);


        down.addActionListener (
                new ActionListener()
                {	public void actionPerformed(ActionEvent e)
                    {	String t = box1.getText();
                        box2.setText(t);
                    }
                }	);

        up.addActionListener (
                new ActionListener()
                {	public void actionPerformed(ActionEvent e)
                    {	String t = box2.getText();
                        box1.setText(t);
                    }
                }	);

        clear.addActionListener(
                new ActionListener()
                {   public void actionPerformed(ActionEvent e)
                    {   box1.setText("");
                        box2.setText("");
                    }
                }
        );

        exit.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e)
                    {   System.exit(0);

                    }
                }

        );


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    } // MyFrame constructor

} // MyFrame