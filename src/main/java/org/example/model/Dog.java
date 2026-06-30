package org.example.model;

public final class Dog extends Animal {
    public Dog (String name, int age, String color, boolean adopted) {
        super("Dog", name, age, color, adopted);
    }

    public Dog(String name,int age, boolean adopted) {
        this(name, age,"Light brown",adopted);
    }
    public Dog(String name, int age, String color) {
        this(name,age,color,false);
    }

    public Dog(String name,int age) {
        this(name,age,"Black",false);
    }


}
