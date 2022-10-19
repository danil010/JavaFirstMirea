package ru.mirea.task7;

public abstract class Shape {
    private String color;
    private boolean filled;
    Shape(){}
    Shape( String color2, boolean filled2)
    {
        color = color2;
        filled = filled2;
    }
    public String getColor(){
        return color;
    }
    public void setColor( String color2){
        color=color2;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled( boolean filled2 ){
        filled=filled2;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
