package Oct.ex_02092024;
// created class ATBStudent
/*
  Classes and Objects
  1. classes and objects are basic concepts of Object-Oriented Programming (OOPs)
     that are used to represent real-world concepts.
  2. Class is user defined datatype which has its own attributes and behaviors
  3. Class is a blueprint or template from which objects can be created
  4. class is declared once and call multiple times to create new objects
  5. objects are instance of class.
  6. 'new' keyword is used in java to create an object of any class
  7. No memory is allocated when a class is declared, but memory allocation happens when an object is created.
  8. A class is a logical entity, while an object is a physical entity.

  OOPS and features
  1. OOPS is object-oriented Programming  is a methodology or paradigm to design a program using
     classes and objects.
  2. Object-oriented programming aims to implement real-world entities and its features includes:
     - Classes and Objects
     - Inheritance
     - Polymorphism
     - Abstraction
     - Encapsulation
*/
public class ATBStudent {
    int roll;
    String name;
    int age;
    String city;
    boolean ismale;
    void display()
    {
        System.out.println("Rollno: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("IsMale?: " + ismale);
    }
}
