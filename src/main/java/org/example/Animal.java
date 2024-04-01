package org.example;

sealed interface Animal permits Cat, Dog {
    void makeSound();
}

non-sealed class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

sealed class Dog implements Animal permits Labrador {
    @Override
    public void makeSound() {
        System.out.println("howl");
    }
}

final class Labrador extends Dog {
    @Override
    public void makeSound() {
        System.out.println("howl, howllllll");
    }
}

