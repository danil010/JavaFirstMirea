package ru.mirea.task7;
import ru.mirea.task7.Rectangle;
public class Square extends Rectangle {
    private double side;
    Square(){}
    Square(double side2 )
    {
        side=side2;
    }
    Square(double side2 , String color2 , boolean filled2)
    {
        side=side2;
        setColor(color2);
        setFilled(filled2);
    }
    public double getSide()
    {
        return side;
    }
    public void setSide(double radius2)
    {
        side=radius2;
    }
}
