package org.example.model;

public final class Cat extends Animal {
    public Cat (String name, int age, String color, boolean adopted) {
        super("Cat", name, age, color, adopted);
    }

    public Cat(String name, int age, String color) {
        this(name,age,color,false);
    }

    public Cat(String name,int age, boolean adopted) {
        this(name, age,"Brown",adopted);
    }
}
