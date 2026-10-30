package org.example;

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void displayInfo();
    abstract void eat();
    abstract void makeSound();
    abstract void move();
}
