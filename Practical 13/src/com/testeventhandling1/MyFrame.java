package com.testeventhandling1;

/**
 * User: EthanArcher
 * Date: 14/03/2013
 * Time: 20:59
 */
    import java.awt.*;
    import javax.swing.*;
    import java.awt.event.*;

    class MyFrame extends JFrame
    {
        JTextField box1, box2;
        JButton copy;

        public MyFrame(int x, int y, String title, Color col)
        {
            setTitle(title);
            setSize(300, 150);
            setLocation(x, y);

            Container c = getContentPane();
            c.setBackground(col);
            c.setLayout(new FlowLayout());

            box1 = new JTextField (20);
            c.add(box1);

            copy = new JButton("Copy");

            copy.addActionListener (
                    new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            String s = box1.getText();
                            box2.setText(s);
                            box1.setText("");
                        }
                    }
            );

            c.add(copy);

            box2 = new JTextField (20);
            c.add(box2);

            setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
            setVisible(true);

        } // MyFrame constructor

    } // MyFrame
