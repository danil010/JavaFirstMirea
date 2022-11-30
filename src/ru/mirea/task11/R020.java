package ru.mirea.task11;

import java.util.Scanner;
import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;
import java.awt.FlowLayout;
public class R020 extends JFrame
{
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    // Текстовые поля
    JTextField smallField, bigField;
    int yu=0;
    public R020() {
        super("Текстовые поля");

        final int min = 0; // Минимальное число для диапазона
        final int max = 20; // Максимальное число для диапазона
        final int rnd = rnd(min, max);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Создание текстовых полей
        smallField = new JTextField(15);
        smallField.setToolTipText("Короткое поле");
        bigField = new JTextField("Текст поля", 25);
        bigField.setToolTipText("Длиное поле");
        // Настройка шрифта
      //  bigField.setFont(new Font("Dialog", Font.PLAIN, 14));
      //  bigField.setHorizontalAlignment(JTextField.RIGHT);
        // Слушатель окончания ввода
        smallField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста
                yu=yu+1;
                if (yu==3){
                    System.out.println("поражение");
                }else {
                    if (rnd == Integer.parseInt((smallField.getText()))) {
                        System.out.println("победа");
                    } else {
                        if (rnd > Integer.parseInt((smallField.getText()))) {
                            System.out.println("больше");
                        } else {
                            System.out.println("меньше");
                        }
                   //     System.out.println(rnd);
                    }
                }
                //JOptionPane.showMessageDialog(R020.this,
                //        "Ваше слово: " + smallField.getText());
            }
        });
        // Поле с паролем
        JPasswordField password = new JPasswordField(12);
        password.setEchoChar('*');
        // Создание панели с текстовыми полями
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(smallField);
        //contents.add(bigField);
        //contents.add(password);
        setContentPane(contents);
        // Определяем размер окна и выводим его на экран
        setSize(400, 130);
        setVisible(true);
    }

    public static void main(String[] args) {
        new R020();
    }
}
/*{
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    int n = 0;
    int factorial( int f )
    {
        int t;
        if (f % 10 != 0 )
        {
            int y;
            y = factorial( (f / 10) );
            n++;
            t = (int)Math.pow(10,n);
            System.out.println(t);
            return (f%10)*t + y;
        }else {
            n++;
            return f;
        }
    }
    int factorial2()
    {
        Scanner sc = new Scanner(System.in);
        final int min = 0; // Минимальное число для диапазона
        final int max = 20; // Максимальное число для диапазона
        final int rnd = rnd(min, max);
        System.out.println("Псевдослучайное целое число: " + rnd);
        return 1;
    }
    public static void main(String[] args)
    {
        R020 ty = new R020();
        System.out.println(ty.factorial2());
    }
}*/
