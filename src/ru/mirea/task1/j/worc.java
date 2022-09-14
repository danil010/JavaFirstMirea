package ru.mirea.task1.j;
/*package example;
public class Example {
    public static void main(String[] args) {
    }}
*/import java.util.Scanner;
public class worc {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int[] b = new int[10];
        int y = 0;
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
            y = y + b[i];
//Действия в цикле
        }
        System.out.println(y);
    }
     //Math.random()
}
