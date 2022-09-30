package ru.mirea.task3;

import java.util.Scanner;

public class Human
{
   private Hand qHand;
   private Head pHead;
   private Leg qLeg;
   void regethu(Hand n ,Head i , Leg t)
   {
      qHand=n;
      pHead=i;
      qLeg=t;
   }
   void gethu()
   {
     // Scanner sc = new Scanner(System.in);
      System.out.println(qHand.gethan());
      System.out.println(pHead.gethea());
      System.out.println( qLeg.getlg());

   }
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      Human ty = new Human();
      ty.qHand.regethan(sc.nextInt());
      ty.pHead.regethea(sc.nextInt());
      ty.qLeg.regetlg(sc.nextInt());
      ty.regethu(ty.qHand, ty.pHead,ty.qLeg);
      ty.gethu();
   }
}
