package ru.mirea.task8;
import javax.swing.*;
import java.awt.*;
public class Lesson85 {
    public static void main (String[] args){
        JFrame frame = new JFrame("надо");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*GUI85 gui = new GUI85();
        gui.setBackground(Color.WHITE);
        frame.add(gui);*/
        GUI85 gu = new GUI85();
        gu.setBackground(Color.WHITE);
        frame.add(gu);
        /*GUI85 [] gui = new GUI85[20];
        for (int i=0 ; i<19 ;i++) {
            gui[i].setBackground(Color.WHITE);
            frame.add(gui[i]);
        }*/
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
