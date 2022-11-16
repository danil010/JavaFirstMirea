package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Example {
    int milan = 0, madrid = 0;
    Example(){

        JFrame a = new JFrame("example");
        JPanel p = new JPanel();
        p.setBounds(40,70,200,200);
        JButton b = new JButton("AC Milan");
        b.setBounds(60,50,80,40);
        p.add(b);
        JButton o = new JButton("Real Madrid");
        o.setBounds(120,50,80,40);
        p.add(o);
        JTextField u = new JTextField("Result: 0 X 0");
        u.setBounds(120,120,200,30);
        a.add(u);
        JTextField uy = new JTextField("Last Scorer: N/A");
        uy.setBounds(120,160,200,30);
        a.add(uy);
        JTextField ut = new JTextField("Winner: DRAW");
        ut.setBounds(120,200,200,30);
        a.add(ut);
        a.add(p);
        a.setSize(400,400);
        a.setLayout(null);
        a.setVisible(true);
        b.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                milan++;
                u.setText("Result: " + milan + " X " + madrid);
                uy.setText("Last Scorer: AC Milan");
                if (milan > madrid)
                    ut.setText("Winner: AC Milan");
                else if (madrid > milan)
                    ut.setText("Winner: Real Madrid");
                else
                    ut.setText("Winner: DRAW");
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });

        o.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                madrid++;
                u.setText("Result: " + milan + " X " + madrid);
                uy.setText("Last Scorer: Real Madrid");
                if (milan > madrid)
                    ut.setText("Winner: AC Milan");
                else if (madrid > milan)
                    ut.setText("Winner: Real Madrid");
                else
                    ut.setText("Winner: DRAW");
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
    }
    public static void main(String args[])
    {
        new Example();
    }
}