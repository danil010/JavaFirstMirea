package ru.mirea.task4;

public class Author
{
    private String name;
    private String email;
    private char gender;
    Author(String name2,String email2,char gender2)
    {
        name=name2;
        email=email2;
        gender=gender2;
    }
    String getName(){return name;}
    String getEmail(){return email;}
    void setEmail(String email2){email=email2;}
    char getGender(){return gender;}
    //String toString(){return "e";};
}
