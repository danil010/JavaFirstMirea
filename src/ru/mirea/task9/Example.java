package ru.mirea.task9;
import java.awt.*;
import javax.swing.*;
public class Example{
    Example(){
        JFrame a = new JFrame("example");
        JPanel p = new JPanel();
        p.setBounds(40,70,200,200);
        JButton b = new JButton("click me");
        b.setBounds(60,50,80,40);
        p.add(b);
        JButton o = new JButton("click me");
        o.setBounds(120,50,80,40);
        p.add(o);
        JTextField u = new JTextField("edureka");
        u.setBounds(120,120,200,30);
        a.add(u);
        JTextField uy = new JTextField("edureka2");
        uy.setBounds(120,160,200,30);
        a.add(uy);
        JTextField ut = new JTextField("edureka3");
        ut.setBounds(120,200,200,30);
        a.add(ut);
        a.add(p);
        a.setSize(400,400);
        a.setLayout(null);
        a.setVisible(true);
    }
    public static void main(String args[])
    {
        new Example();
    }
}