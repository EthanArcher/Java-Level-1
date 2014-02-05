package com.shopping;

/**
 * User: EthanArcher
 * Date: 15/05/2013
 * Time: 22:27
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class MyFrame extends JFrame {

    JMenuBar bar;
    JMenu options;
    JMenuItem clear;
    JButton[][] barry = new JButton[3][3];
    String[] fruit = {"Apple", "Banana", "Orange", "Kiwi", "Grapes", "Soap", "Water", "Pasta", "Poison"};
    int fnum = -1;
    JPanel p1, p2;
    JTextField box;
    String text;
    int a,b;
    JLabel label1, label2;

    List<String> selected = new LinkedList <String>();

    public MyFrame()
    {

        setSize(300,300);
        setLocation(100,100);
        setTitle("Shopping List");
        Container c = getContentPane();
        c.setBackground(Color.darkGray);
        c.setLayout(new FlowLayout());
        p1 = new JPanel();
        p1.setLayout(new GridLayout(3,3));
        p1.setBackground(Color.darkGray);
        p2 = new JPanel();
        p2.setBackground(Color.darkGray);
        label1 = new JLabel("These are the Items Available");
        label1.setForeground(Color.white);

        clear = new JMenuItem("Clear List");
        options = new JMenu("Options");
        bar = new JMenuBar();
        options.add(clear);
        bar.add(options);
        setJMenuBar(bar);
        box = new JTextField(20);
        box.setText("");
        box.setEditable(false);
        p2.add(box);

        clear.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e)
                    {
                        clearList(selected);
                    }
                }
        );

        for(int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {

                fnum++;
                String namein;
                namein = fruit[fnum];
                barry[i][j] = new JButton(namein);

                p1.add(barry[i][j]);

                barry[i][j].addActionListener(
                        new ActionListener(){
                            public void actionPerformed(ActionEvent e)
                            {
                                JButton b0 = (JButton) e.getSource();
                                text = b0.getText();
                                findCLickedButton(barry, b0);
                                barry[a][b].setText("");
                                selected.add(text);
                                printList(selected);
                            }
                        }
                );

            }
        }

        c.add(label1);
        c.add(p1);
        c.add(p2);



        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void findCLickedButton (JButton[][] array, JButton b0)
    {
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                if (b0 == array[i][j])
                {
                    a=i;
                    b=j;

                }
            }
        }

    }

    public void printList(List<String> L)
    {
        String total = ("");

        for (int p =0; p<L.size(); p++)
        {
            String temp = L.get(p);
            total = total + " " + temp;

        }

        box.setText(total);

    }

    public void clearList(List<String> L)
    {
        for (int i=0; i<L.size(); i++)
        {
            L.remove(i);
        }

        box.setText("");

    }

}
