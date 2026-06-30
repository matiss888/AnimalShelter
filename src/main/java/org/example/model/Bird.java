package org.example.model;

public final class Bird extends Animal {
    public Bird (String name, int age, String color,boolean adopted) {
        super("Bird", name, age, color, adopted);
    }

    public Bird(String name,int age, boolean adopted) {
        this(name, age,"Black with white stripes",adopted);
    }
    public Bird(String name, int age, String color) {
        this(name,age,color,false);
    }

    public Bird(String name,int age) {
        this(name,age,"Yellow",false);
    }
}
