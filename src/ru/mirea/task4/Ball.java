package ru.mirea.task4;

public class Ball
{
    private double x;
    private double y;
    Ball(double x1, double y1){x=x1;y=y1;}
    Ball(){}
    double getX(){return x;}
    double getY(){return y;}
    void setX(double x1){x=x1;}
    void setY(double y1){y=y1;}
    void setXY(double x1, double y1){x=x1;y=y1;}
    void move(double xDisp, double yDisp){x=x+xDisp;y=y+yDisp;}
    //String toString(){};
}
