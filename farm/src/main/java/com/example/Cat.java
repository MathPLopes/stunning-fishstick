package com.example;

public class Cat extends Animal {
    private static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public String talk() {
        return "Meow!";
    }

    public static int getCount() {
        return catCount;
    }

}
