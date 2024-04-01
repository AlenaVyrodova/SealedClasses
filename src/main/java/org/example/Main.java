package org.example;

public class Main {
    static void makeSoundAnimal(Animal animal) {
        switch (animal) {
            case Labrador labrador -> labrador.makeSound();
            case Dog dog -> dog.makeSound();
            case Cat cat -> cat.makeSound();
        }
    }

    public static void main(String[] args) {
        var permittedSubclasses = Animal.class.getPermittedSubclasses();
        for (Class<?> subclass : permittedSubclasses) {
            System.out.println(subclass.getName());
        }

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal labrador = new Labrador();

        makeSoundAnimal(dog);
        makeSoundAnimal(cat);
        makeSoundAnimal(labrador);

    }
}