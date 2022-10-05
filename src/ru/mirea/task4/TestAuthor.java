package ru.mirea.task4;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name3=sc.nextLine();
        String email3=sc.nextLine();
        char gender3=sc.next().charAt(0);
        Author rt =new Author (name3,email3,gender3);
        System.out.println(rt.getName());
        System.out.println(rt.getEmail());
        System.out.println(rt.getGender());
        rt.setEmail(email3);
    }
}
