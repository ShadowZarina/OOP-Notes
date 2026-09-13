
# II. Paradigms & Core Concepts
Understanding how Object-Oriented Programming fundamentally restructures logic compared to procedural models.

## Procedural vs. Object-Oriented

**PROCEDURAL PROGRAMMING**
- Functions and sequence of execution steps
- Data and functions are kept separate
- Global state easily modified by any function
- Harder to maintain as programs grow large

**OBJECT-ORIENTED PROGRAMMING**
- Objects that bundle data and behavior
- Data is encapsulated inside objects
- Controlled access via encapsulation modifiers
- Highly modular, reusable, and extendable

## Classes and Objects
**Blueprint vs Instance**
- **Class**: A conceptual blueprint or template that defines what properties (attributes) and actions (methods) an object will have
- **Object**: A concrete instance created in memory from a class, holding actual data values.

```
Student { String name; int age; }
Student s1 = new Student();
```

# III. The Four Pillars of OOP
The foundational design principles required for building robust, modular, and maintainable software systems.

1. Encapsulation
- Building data & methods into a SINGLE UNIT while restricting direct access to internal states using private access modifiers
- **Benefit**: Protects data integirty and prevents unintended side effects by forcing interaction through *public getters/setters*

2. Abstraction
- Hiding complex internal implementation details and exposing only the essential interface needed to use the object
- **Benefit**: Reduces cognitive complexity. Users call drive() without needing to understand engine combustion mechanics

3. Inheritance
- Allows a CHILD class (subclass) to inherit attributes & mmethods from a PARENT class (superclass) using keywords like *extends*
- **Benefit**: Eliminiates code duplication and creates logical hierarchy relationships (eg. Dog inherits from Animal)

4. Polymorphism
- Enables a single interface/method call to behave differently depending on the specific object invoking it ("*Many Forms*")
- **Benefit**: Facilitates flexibility through method *overriding and overloading* (eg. animal.makeSound())

# ACTIVITY

> Java (Version) 26 is needed to run void main with outputs. Java 22 requires public class and public static void.

## Main.java

public class Main {
  public static void main(String[] args) {
    Car car1 = new Car();
    Car car2 = new Car();

    car1.make = "Porsche";
    car1.model = "911";
    car1.isRunning = false;
    System.out.println(car1.make);
    System.out.println(car1.model);
    System.out.println(car1.isRunning);
    car1.startCar();

    car2.make = "Ford";
    car2.model = "Mustang"; // if undeclared, default value is null
    car2.isRunning = false; // default value is false
    System.out.println(car2.make);
    System.out.println(car2.model);
    System.out.println(car2.isRunning);
    car2.startCar();
    System.out.println("Is Car 2 running? " + car2.isRunning);
  }
}

## Car.java

Class with Pre-Defined Values

```
public class Car {
  int wheelType = 4;
  String make = "Toyota";
  String model = "Avanza";

  void startCar() {
    System.out.println("CAR STARTED!");
  }
}
```
Class with Attributes Only
```
public class Car {
  int wheelType;
  String make;
  String model;
  boolean isRunning;

  void startCar() {
    System.out.println("CAR STARTED!");
    this.isRunning = true; // sets the value for all objects
  }
}
```
