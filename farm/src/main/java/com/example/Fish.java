package com.example;

public class Fish extends Animal {
    protected static int fishCount;

    public Fish(String name) {
        super(name);
        fishCount++;
    }

    @Override
    public String talk() {
        return this.name + " Glub Glub!";
    }

    public static int getCount() {
        return fishCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
