package com.example;

public class Cat extends Animal {
    protected static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public String talk() {
        return this.name + " Meow!";
    }

    public static int getCount() {
        return catCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
