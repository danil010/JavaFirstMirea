package ru.mirea.task7;
import ru.mirea.task7.Shape;
public class Circle extends Shape {
    private double radius;
    Circle(){}
    Circle(double radius2){radius=radius2;}
    Circle(double radius2, String color2 , boolean filled)
    {
        radius=radius2;
        setColor(color2);
        setFilled(filled);
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius2)
    {
        radius=radius2;
    }
    public double getArea(){
        return radius*radius*3.14;
    }
    public double getPerimeter(){
        return radius*6.28;
    }
    public String toString(){
        return "Circle";
    }
}
