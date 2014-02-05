package com.practical14;

/**
 * User: EthanArcher
 * Date: 17/03/2013
 * Time: 22:11
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class MyFrame extends JFrame {

    JMenuBar bar;
    JMenu options;
    JMenuItem clear, uppercase, backspace;
    JTextField box1;
    JButton [][] b = new JButton[3][3];
    JPanel p1;
    int in = -1;

    String [] letterin = { "hannah", "ethan", "love", "smell", "is", "cooler", "than", "s", " "};

    public MyFrame (){

        setSize(300, 200);
        setTitle("Ethans frame");
        setLocation(100,100);

        Container c = getContentPane();
        c.setBackground(Color.blue);
        c.setLayout(new FlowLayout());

        clear = new JMenuItem("Clear");
        uppercase = new JMenuItem("Uppercase");
        backspace = new JMenuItem("Backspace");
        options = new JMenu("Options");
        options.add(clear);
        options.add(uppercase);
        options.add(backspace);
        bar = new JMenuBar();
        bar.add(options);
        setJMenuBar(bar);

        box1 = new JTextField(20);
        c.add(box1);

        p1 = new JPanel();
        p1.setBackground(Color.blue);
        p1.setLayout(new GridLayout(3,3));

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){

                in ++;
                b [i][j] = new JButton(letterin[in]);
                p1.add(b[i][j]);

                b[i][j].addActionListener(
                        new ActionListener(){
                            public void actionPerformed(ActionEvent e){

                                JButton b0 = (JButton) e.getSource();
                                String selected = b0.getLabel();
                                String current = box1.getText();
                                box1.setText(current + selected);
                            }

                }

                );
            }
        }

        c.add(p1);

        uppercase.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e){

                        String s = box1.getText();
                        s = s.toUpperCase();
                        box1.setText(s);
                    }
                }
        );

        clear.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        box1.setText("");
                    }
                }
        );

        backspace.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        box1.setText(box1.getText().substring(0, box1.getText().length () -1));
                    }
                }


        );

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }



}
