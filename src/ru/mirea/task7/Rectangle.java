package ru.mirea.task7;
import ru.mirea.task7.Shape;
public class Rectangle extends Shape{
    private double width;
    private double lenght;
    Rectangle(){}
    Rectangle(double width2 , double lenght2){
        lenght = lenght2;
        width = width2;
    }
    Rectangle(double width2 , double lenght2, String color2 , boolean filled2){
        lenght = lenght2;
        width = width2;
        setColor(color2);
        setFilled(filled2);
    }
   /* public void setWidth( double filled2 ){
        width=filled2;
    }
    public void setLenght( double filled2 ){
        lenght=filled2;
    }*/
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double radius2)
    {
        width=radius2;
    }
    public double getLength()
    {
        return  lenght;
    }
    public void setLength(double radius2)
    {
        lenght=radius2;
    }
    public double getArea(){
        return lenght*width;
    }
    public double getPerimeter(){
        return (lenght+width)*2;
    }
    public String toString(){
        return "Rectangel";
    }
}
