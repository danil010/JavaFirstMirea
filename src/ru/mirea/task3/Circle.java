package ru.mirea.task3;

import java.util.Scanner;

public class Circle {
    private int rcir;
    int getRcir(){
        return rcir;
    }
    void reget(int n){
        rcir=n;
    }
    int getp(){
        return 2*rcir*3;
    }
    int gets(){
        return rcir*rcir*3;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус");
        Circle t = new Circle();
        t.reget(sc.nextInt());
        System.out.println("Вывод");
        System.out.println(t.getRcir());
        System.out.println(t.getp());
        System.out.println(t.gets());
    }
}
