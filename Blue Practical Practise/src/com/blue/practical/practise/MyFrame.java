package com.blue.practical.practise;

/**
 * User: EthanArcher
 * Date: 21/03/2013
 * Time: 23:34
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame{

    JMenu other;
    JMenuItem compare;
    JMenuBar bar;
    JTextField input1, input2, output;
    JButton plus, minus, multiply, swap, clear;
    String text1, text2;
    JPanel p1, p2;

    public MyFrame (){

        setSize(200,250);
        setLocation(100,100);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.blue);

        compare = new JMenuItem("Compare");
        other = new JMenu("Other");
        other.add(compare);
        bar = new JMenuBar();
        bar.add(other);
        setJMenuBar(bar);

        input1 = new JTextField(10);
        input2 = new JTextField(10);
        output = new JTextField(10);

        plus = new JButton("+");
        minus = new JButton("-");
        multiply = new JButton("*");
        swap = new JButton("> <");
        clear = new JButton("C");

        p1 = new JPanel();
        p1.setLayout(new GridLayout(3,2));
        p1.setBackground(Color.blue);
        p1.add(plus);
        p1.add(minus);
        p1.add(multiply);
        p1.add(swap);
        p1.add(clear);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(2,2));
        p2.setBackground(Color.blue);
        p2.add(input1);
        p2.add(input2);

        c.add(p2);
        c.add(p1);
        c.add(output);

        plus.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){

                        text1 = input1.getText();
                        text2 = input2.getText();
                        int a = Integer.parseInt(text1);
                        int b = Integer.parseInt(text2);
                        int c = a + b;
                        String temp = String.valueOf(c);
                        output.setText(temp);

                    }
                }
        );

        minus.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){

                        text1 = input1.getText();
                        text2 = input2.getText();
                        int a = Integer.parseInt(text1);
                        int b = Integer.parseInt(text2);
                        int c = a - b;
                        String temp = String.valueOf(c);
                        output.setText(temp);

                    }
                }
        );

        multiply.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){

                        text1 = input1.getText();
                        text2 = input2.getText();
                        int a = Integer.parseInt(text1);
                        int b = Integer.parseInt(text2);
                        int c = a*b;
                        String temp = String.valueOf(c);
                        output.setText(temp);

                    }
                }
        );

        swap.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){

                        text1 = input1.getText();
                        text2 = input2.getText();
                        input1.setText(text2);
                        input2.setText(text1);

                    }
                }
        );

        clear.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){

                        input1.setText("");
                        input2.setText("");
                        output.setText("");

                    }
                }
        );

        compare.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){

                        text1 = input1.getText();
                        text2 = input2.getText();
                        int a = Integer.parseInt(text1);
                        int b = Integer.parseInt(text2);

                        if (a == b) output.setText(a + "=" + b);
                        if (a < b) output.setText(a + "<" + b);
                        if (a > b) output.setText(a + ">"+ b);

            }
        }
        );

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}