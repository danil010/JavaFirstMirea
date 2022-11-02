package ru.mirea.task8;
import javax.swing.*;

public class ShowImageJavaFrame extends JFrame
{
    public ShowImageJavaFrame(String title)
    {
        super(title);
    }

    public static void main(String[] args)
    {
        // получаем текущую рабочую папку откуда запущена программа
        var cwd = System.getProperty("C:\\Users\\ivc1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8");

        var frame = new ShowImageJavaFrame("Показываем картинку");

        // относительно текущей папки загружаем изображение
        // папка с изображением должна находиться в текущей папке программы
        //var icon = new ImageIcon(cwd + "/images/laravel-cover.png");
        var icon = new ImageIcon(cwd +"\\product-496868-1.jpg");
        // создаем панель, в панель добавляем заголовок с картинкой
        var panel = new JPanel();
        panel.add(new JLabel(icon));

        // добавляем панель в главный фрейм (окно)
        frame.add(panel);

        // устанавливаем размер окна
        frame.setSize(700, 500);

        // при закрытии окна - выходим из приложения (важно всегда правильно закрывать окна)
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // помещаем окно в центре экрана
        frame.setLocationRelativeTo(null);

        // делаем окно видимым
        frame.setVisible(true);
    }
}
