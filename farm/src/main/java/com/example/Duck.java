package com.example;

public class Duck extends Animal {

    protected static int duckCount;

    public Duck(String name) {
        super(name);
        duckCount++;
    }

    @Override
    public String talk() {
        return this.name + " Quack!";
    }

    public static int getCount() {
        return duckCount;
    }

}
