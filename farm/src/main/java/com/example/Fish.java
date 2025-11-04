package com.example;

public class Fish extends Animal {
    private static int fishCount;

    public Fish(String name) {
        super(name);
        fishCount++;
    }

    @Override
    public String talk() {
        return "Glub Glub!";
    }

    public static int getCount() {
        return fishCount;
    }
}
