package ru.mirea.task5;

import java.util.Scanner;

public class FurnitureShop extends Furniture{
    @Override
    public void namedish() {
        System.out.println("Тумба");
    }
    public static void main(String[] args)
    {
        Furniture[] Fur;
        Scanner sc = new Scanner(System.in);
        String name3;
        Fur = new Furniture[10];
        for (int i = 0; i < 10; i++) {
            name3 = sc.nextLine();
            Fur[i].setMater(name3);
            //System.out.println("Строка №" + i);
        }
        String name2;
        name2 = sc.nextLine();
        for (int i = 0; i < 10; i++) {
           if (Fur[i].getMater()==name2){
               System.out.println(Fur[i].getMater());
               Fur[i].namedish();
           }
            //System.out.println("Строка №" + i);
        }
    }
}
