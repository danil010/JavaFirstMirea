package ru.mirea.task5;

public abstract class Furniture {
    private String mater;
    public String getMater(){
        return mater;
    }
    public void setMater(String mater){
        this.mater = mater;
    }
    public abstract void namedish();
}
