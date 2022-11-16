package ru.mirea.task10;

import java.util.Scanner;

public class Ab01
{
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
        int t;
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Ab01 ty = new Ab01();
        System.out.println(ty.factorial( 12345)/100);
    }
}