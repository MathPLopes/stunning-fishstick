package com.example;

public class Cow extends Animal {

    protected static int cowCount;

    public Cow(String name) {
        super(name);
        cowCount++;
    }

    @Override
    public String talk() {
        return this.name + " Muuu!";
    }

    public static int getCount() {
        return cowCount;
    }

}
