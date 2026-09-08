# ACTIVITY: My First Java Object

## INSTRUCTIONS

1. Define Class
- Create a simple class Student with 3 attributes: String name; and int age; int (or double) grade; (no access modifiers needed!)
2. Instantiate Object
- Inside main(), create an object using: Student s1 = new Student();
3. Assign Values
- Set s1.name = "Maria"; and s1.age = 20;
4. Assess Grade
- Add indiividual grades and create a function in main to check if they passed or not, grade is numerical, passing grade is 75
5. Print Output
- Print the values using System.out.println().

## SOLUTION
NOTES:
- Java 26 is needed to run void main with outputs. Java 22 can only use public class and static void main.
- You can use VSCode, Terminal, etc.

### Main.java

```
public class Main {
  public static void main(String[] args) {
    Student s1 = new Student();

    s1.name = "Maria";
    s1.age = 20;
    s1.grade = 80;

    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println("Did the student pass? " + s1.checkGrade());
  }
}
```

### Student.java

```

```
