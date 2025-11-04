package com.example;

public class Cow extends Animal {
    private static int cowCount;

    public Cow(String name) {
        super(name);
        cowCount++;
    }

    @Override
    public String talk() {
        return "Muuu!";
    }

    public static int getCount() {
        return cowCount;
    }

}
