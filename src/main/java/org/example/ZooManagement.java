package org.example;

import java.util.Arrays;

public  class ZooManagement {
    public static void main(String[] args) {
        Lion lion  = new Lion("Qirol Sher", 30);
        Elephant elephant = new Elephant("Elephant", 50);

        Animal[] animals = {lion,elephant};

        animals[0].displayInfo();
        animals[0].eat();
        animals[0].makeSound();
        animals[0].move();
        System.out.println("----------------------------");
        animals[1].displayInfo();
        animals[1].eat();
        animals[1].makeSound();
        animals[1].move();
    }
}