package ru.mirea.task10;

import java.util.Scanner;

public class Ab0
{
    int factorial(int n , int y0 , int t1 , int u ){
        if (y0 == 0 )
        {
            return t1;
        }
        if (t1 == 0 )
        {
            if ( y0 == 0 )
            {
                return 0;
            }else{
                return 1;
            }
        }
        if (u==1){
            n=n+1+factorial( n ,  y0-1 , t1 , 0 );
            n=n+1+factorial( n ,  y0 , t1-1 , 1 );
        }
        if (u==0){
            n=n+1+factorial( n ,  y0 , t1-1 , 1 );
        }
        System.out.println(n);
        return n;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Ab0 ty = new Ab0();
        System.out.println(ty.factorial(0,1,1,1));
    }
}