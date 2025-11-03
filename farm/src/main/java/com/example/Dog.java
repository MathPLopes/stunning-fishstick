package com.example;

public class Dog extends Animal {
    protected static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public String talk() {
        return this.name + " Au au!";
    }

    public static int getCount() {
        return dogCount;
    }
}
