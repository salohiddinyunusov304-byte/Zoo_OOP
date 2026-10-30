package org.example;

public class Lion extends Animal implements Eater, Mover, SoundMaker {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " :: " + age);
    }

    @Override
    public void eat() {
        System.out.println("Lion is eating");
    }

    @Override
    public void move() {
        System.out.println("Lion is moving");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion is making sound");
    }
}
