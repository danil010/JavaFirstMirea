package ru.mirea.task5;

import java.util.Scanner;

public class Dish1 extends Dish {
    @Override
    public void namedish() {
        System.out.println("Стакан");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name3 = sc.nextLine();
        Dish1 ty = new Dish1();
        ty.setMater(name3);
        System.out.print("Вид ");
        System.out.println(ty.getMater());
        ty.namedish();
    }
}
