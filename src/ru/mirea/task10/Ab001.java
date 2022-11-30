package ru.mirea.task10;

import java.util.Scanner;

public class Ab001
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
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int u =0;
        while ((u==0)||(u==1)) {
            int y = sc.nextInt();
            if (y==1) {
                i=i+1;
            } else {
                if (y==0){
                    u=u+1;
                }else{
                    u=0;
                }
            }
        }
        return i;
    }
    public static void main(String[] args)
    {
        Ab001 ty = new Ab001();
        System.out.println(ty.factorial2());
    }
}
