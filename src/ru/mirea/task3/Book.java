package ru.mirea.task3;

import java.util.Scanner;

public class Book
{
    private String nam;
    private String avt;
    private int dat;
    String getnam(){
        return nam;
    }
    String getavt(){
        return avt;
    }
    int getdatt(){
        return dat;
    }
    void regetnam(String n)
    {
        nam=n;
    }
    void regetavt(String n)
    {
        avt=n;
    }
    void regetdat(int n)
    {
        dat=n;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Book ty = new Book();
        ty.regetnam(sc.nextLine());
        ty.regetavt(sc.nextLine());
        ty.regetdat(sc.nextInt());
        System.out.println(ty.getnam());
        System.out.println(ty.getavt());
        System.out.println(ty.getdatt());
    }
}
