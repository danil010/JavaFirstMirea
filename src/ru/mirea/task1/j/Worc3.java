package ru.mirea.task1.j;
import java.util.Scanner;
public class Worc3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y;
        double[] b = new double[10];
        for (int i = 0; i < 10; i++) {
            // y = y / 2;
            //
            b[i] = Math.random();
            System.out.println(b[i]);
        }

        for (int i = 0; i < 10; i++) {
            for (int e = i; e < 10; e++) {
                if (b[i]<b[e]){
                    y=b[i];
                    b[i]=b[e];
                    b[e]=y;
                }

            }
        }
        System.out.println("_______________");
        for (int i = 0; i < 10; i++) {
            // y = y / 2;
            //
          //  b[i] = Math.random();
            System.out.println(b[i]);
        }
    }
}