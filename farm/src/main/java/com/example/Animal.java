package com.example;

public abstract class Animal implements Talkable {
    protected static int count;
    protected String name;

    public Animal(String name) {
        this.name = name;
        Animal.count++;
    }

    @Override
    public String talk() {
        return "...";
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
