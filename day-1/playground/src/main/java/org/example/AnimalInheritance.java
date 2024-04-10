package org.example;

public class AnimalInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}

class Animal {
    String name;

    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats");
    }
}
