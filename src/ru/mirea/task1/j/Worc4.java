package ru.mirea.task1.j;
import java.util.Scanner;
public class Worc4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // double y;
        //double[] b = new double[10];
       int y = sc.nextInt();
       int t=y;
        for (int i = 1; i < y; i++) {
            // y = y / 2;
            //
            t=t*i;
            System.out.println(t);
        }
            System.out.println(t);

    }
}