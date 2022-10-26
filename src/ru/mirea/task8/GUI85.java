package ru.mirea.task8;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class GUI85 extends JPanel{
    public void paintComponent(Graphics g){
        for (int i=0 ; i <20 ; i++) {
            this.setBackground(Color.WHITE);
            int q = (int) (Math.random() * 3);
            int w = (int) (Math.random() * 3);
            if (q == 2) {
                g.setColor(Color.GREEN);
            }
            if (q == 1) {
                g.setColor(Color.BLUE);
            }
            if (q == 0) {
                g.setColor(Color.RED);
            }
            if (w == 0) {
                int w1 = (int) (Math.random() * 100);
                int w2 = (int) (Math.random() * 100);
                int w3 = (int) (Math.random() * 100);
                int w4 = (int) (Math.random() * 100);
                g.drawLine(w1, w2, w3, w4);
            }
            if (w == 1) {
                int w1 = (int) (Math.random() * 100);
                int w2 = (int) (Math.random() * 100);
                int w3 = (int) (Math.random() * 100);
                int w4 = (int) (Math.random() * 100);
                g.fillRect(w1, w2, w3, w4);
            }
            if (w == 2) {
                int w1 = (int) (Math.random() * 100);
                int w2 = (int) (Math.random() * 100);
                int w3 = (int) (Math.random() * 100);
                int w4 = (int) (Math.random() * 100);
                g.fillOval(w1, w2, w3, w4);
            }
        }
    }
}
