package ru.mirea.task8;
import javax.swing.*;

public class Image1 {

    public static void main (String[] args) {
        Image1 image1 = new Image1();
        image1.go();
    }

    public void go () {
        JFrame frame = new JFrame();
        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(panel);

        frame.setSize(300, 300);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}