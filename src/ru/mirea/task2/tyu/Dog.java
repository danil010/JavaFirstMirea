package ru.mirea.task2.tyu;

import java.util.Scanner;

public class Dog {
    private String fullName;
    private int age;

    Dog()
    {
        Scanner sc = new Scanner(System.in);
        fullName  = sc.nextLine();
        age= sc.nextInt();
    }
}
