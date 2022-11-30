package ru.mirea.task11;
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import javax.swing.border.*;

import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class TextPaneTest extends JFrame {
    private JPanel topPanel;
    private JTextPane tPane;

    public TextPaneTest() {
        topPanel = new JPanel();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        EmptyBorder eb = new EmptyBorder(new Insets(10, 10, 10, 10));

        tPane = new JTextPane();
        tPane.setBorder(eb);
        //tPane.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        tPane.setMargin(new Insets(5, 5, 5, 5));

        topPanel.add(tPane);

        appendToPane(tPane, "My Name is Too Good.\n", Color.RED);
        appendToPane(tPane, "I wish I could be ONE of THE BEST on ", Color.BLUE);
        appendToPane(tPane, "Stack", Color.DARK_GRAY);
        appendToPane(tPane, "Over", Color.MAGENTA);
        appendToPane(tPane, "flow", Color.ORANGE);

        getContentPane().add(topPanel);

        pack();
        setVisible(true);
    }

    private void appendToPane(JTextPane tp, String msg, Color c) {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg);
    }

    public static void main(String... args) {

        JFrame jFrame = new JFrame("Set Font Example");
        JLabel jLabel1, jLabel2;

        jLabel1 = new JLabel("Label with Serif Font");
        jLabel2 = new JLabel("1Label with Arial Font");

        Font myFont1 = new Font("Papyrus", Font.BOLD, 12);
        jLabel1.setFont(myFont1);

        Font myFont2 = new Font("Arial", Font.BOLD, 12);
        jLabel2.setFont(myFont2);

        jLabel1.setBounds(80, 100, 120, 30);
        jLabel2.setBounds(80, 80, 120, 30);

        jFrame.add(jLabel1);
        jFrame.add(jLabel2);
        jFrame.setSize(300, 300);

        jFrame.setLayout(null);
        jFrame.setVisible(true);

       /* SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new TextPaneTest();
            }
        });
    }*/
    }
}