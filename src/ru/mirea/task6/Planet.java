package ru.mirea.task6;

public class Planet implements Nameable {
    private String namef;
    void setname(String ft){
        namef=ft;
    }
    public void getName(){
        System.out.println("Planet");
    }
}
