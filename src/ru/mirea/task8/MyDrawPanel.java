package ru.mirea.task8;
import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent (Graphics g) {
        Image image = new ImageIcon("C:\\Users\\ivc1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\product-496868-1.jpg"/*"C:\\Users\\temak\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\image3.PNG"*/).getImage();
        g.drawImage(image, 3, 4, this);
    }
}
