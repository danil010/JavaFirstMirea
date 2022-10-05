package ru.mirea.task4;

import java.util.Scanner;

public class TestBall
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        Ball rt = new Ball(x2,y2);
        rt.setX(x2);
        rt.setY(y2);
        System.out.println(rt.getX());
        System.out.println(rt.getY());
        rt.setXY(x2,y2);
        rt.move(x2,y2);
    }
}
