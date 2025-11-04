package com.example;

public class Duck extends Animal {
    private static int duckCount;

    public Duck(String name) {
        super(name);
        duckCount++;
    }

    @Override
    public String talk() {
        return "Quack!";
    }

    public static int getCount() {
        return duckCount;
    }

}
