package com.example;

public class Dog extends Animal {  
    private static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public String talk() {
        return "Au au!";
    }

    public static int getCount() {
        return dogCount;
    }
}
