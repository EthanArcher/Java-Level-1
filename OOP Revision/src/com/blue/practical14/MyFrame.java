package com.blue.practical14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * User: EthanArcher
 * Date: 14/05/2013
 * Time: 22:32
 */
public class MyFrame extends JFrame{

    JMenuBar bar;
    JMenuItem clear, upper, backspace;
    JPanel p1;
    JMenu options;
    JTextField box;
    JButton[][] barry = new JButton[3][3];
    JButton b;
    int i,j;
    int in = -1;
    String temp;
    String[] letterArray = {"a", "b","c","d","e","f"," ", ".","," };

    public MyFrame()
    {
        clear = new JMenuItem("Clear");
        upper = new JMenuItem("UpperCase");
        backspace = new JMenuItem("BackSpace");
        options = new JMenu("Options");
        options.add(clear);
        options.add(upper);
        options.add(backspace);
        bar = new JMenuBar();
        bar.add(options);
        setJMenuBar(bar);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        setSize(220,210);
        setLocation(100,100);
        setTitle("Ethan");

        box = new JTextField(15);
        p1 = new JPanel();
        p1.setLayout(new GridLayout (3,3));

        for (i=0; i<3; i++)
        {
            for (j=0; j<3; j++)
            {
                in++;
                barry[i][j] = new JButton(letterArray[in]);
                p1.add(barry[i][j]);

                barry[i][j].addActionListener(
                        new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                b = (JButton) e.getSource();
                                temp = b.getLabel();
                                box.setText(box.getText() + temp);

                            }
                        }
                );
            }
        }

        clear.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        box.setText("");
                    }
                }
        );

        upper.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        temp =  box.getText();
                        temp = temp.toUpperCase();
                        box.setText(temp);

                    }
                }
        );

        backspace.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        box.setText(box.getText().substring(0, box.getText().length() -1));

                    }
                }
        );

        c.add(box);
        c.add(p1);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
