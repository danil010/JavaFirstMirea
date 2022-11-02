package ru.mirea.task8;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Image2 {
    public static void main (String[] args) throws InterruptedException {
        Image2 image1 = new Image2();
        image1.go();

    }

    public void go () throws InterruptedException {
        JFrame frame = new JFrame();
        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(panel);
        frame.setSize(300, 303);
        frame.setVisible(true);
        TimeUnit.SECONDS.sleep(1);
        MyDrawPanel2 panel2 = new MyDrawPanel2();

        frame.getContentPane().add(panel2);

        frame.setSize(300, 303);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}