package org.example;

public class Elephant extends Animal implements Eater, Mover, SoundMaker{
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " :: " + age);
    }

    @Override
    public void eat() {
        System.out.println("Elephant is eating");
    }

    @Override
    public void move() {
        System.out.println("Elephant is moving");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant is making sound");
    }
}
