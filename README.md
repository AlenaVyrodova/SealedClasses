# Sealed Classes Example

This repository contains an example implementation of sealed classes in Java.

Sealed classes, introduced in Java 17, allow you to define a closed set of subclasses that can extend a parent class or interface. This restricts the inheritance hierarchy and provides more control over subclassing.

## Usage

The `Animal` interface in this example is a sealed interface that permits two subclasses: `Cat` and `Dog`. Each subclass provides its implementation of the `makeSound()` method.

```java
public sealed interface Animal permits Cat, Dog {
    void makeSound();
}
