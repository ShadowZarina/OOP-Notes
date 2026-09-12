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

## Main.java

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
