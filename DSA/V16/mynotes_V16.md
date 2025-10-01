# Video 16 - OOPS PART 1

## My_Notes:
```
* About HLD - High Level Design
    Seeing in Eagle EYE View 
    click url -> load balance -> multiple web servers

* About LLD - Low Level Design
    Inside our application, how we write classes and how classes has relation btw others classes and how objects create

* Abouts Structural Programming vs OOPS

* 4 Pillars Of OOPS
    Abstraction - Just know function but not know how its works inside or implemented
    Encapsulation - All functions inside Capsule | Grouping the function in box
    Inheritance - Child inherits Parents | Its about specialization (Creating a subclass from a superclass)
    Polymorphism - Its about Genralization | I have Sony TV,Samsung Tv,Mi Tv but these are Genralized (Common Name) As TV | OverLoading and OverRiding

* Learn Some Common Lib -> For Java Learning
    Collections in JAVA
    JDBL Class Design

* About Class in OOPS

* When you use new keyword in object creation - It allocates memory 

* Concept of Data Hiding in OOP 
    Private key word is Used
    Class Account {
        Private Account
        Private Balance
    }

    SEE IMAGES

* Interface? (Like a Promise)
    Think of a remote control. It has buttons like: 
    turnOn()
    turnOff()
    But the remote doesn’t care if it’s for a TV or an AC — it just promises those buttons will be there.

* Abstract
    This thing is not complete yet, and someone else must finish it.
    It can be used for: Abstract classes & Abstract methods
    
        abstract class Animal {
        abstract void sound(); // child must finish this

        void sleep() {
            System.out.println("Sleeping...");
            }
        }

* Diff Interface & Abstract Class    
| Feature           | Interface                        | Abstract Class                    |
| ----------------- | -------------------------------- | --------------------------------- |
| Is it complete?   | Only method names (no body)      | Half complete (some methods done) |
|                   |                                  |                                   |
| Can it have code? | No (except default methods)      | Yes                               |
|                   |                                  |                                   |
| Used for?         | Saying what something **can do** | Giving **basic structure**        |

* When Use ?
    100% mandatory means only USE Interface
    Common Behavior means use Abstract class
```

## Images:
``` Images Folder - Available ```
![Image of V16](Images/(V16)%201.png)
![Image of V16](Images/(V16)%202.png)
![Image of V16](Images/(V16)%203.png)
![Image of V16](Images/(V16)%204.png)
![Image of V16](Images/(V16)%205.png)
![Image of V16](Images/(V16)%206.png)
![Image of V16](Images/(V16)%207.png)
![Image of V16](Images/(V16)%208.png)
![Image of V16](Images/(V16)%209.png)
![Image of V16](Images/(V16)%2010.png)
![Image of V16](Images/(V16)%2011.png)
![Image of V16](Images/(V16)%2012.png)
![Image of V16](Images/(V16)%2013.png)
![Image of V16](Images/(V16)%2014.png)
![Image of V16](Images/(V16)%2015.png)
![Image of V16](Images/(V16)%2016.png)
![Image of V16](Images/(V16)%2017.png)
![Image of V16](Images/(V16)%2018.png)
![Image of V16](Images/(V16)%2019.png)

## Code:
``` No Code Folder ```

## Description Of V16 - OOPS PART 1

Doubt Submission Form

Please use the following link to access the form and submit your queries. 

https://forms.gle/SCVudmcPMW7UH9Mh9

We will review your submissions and provide clarifications as soon as possible. Ensure you provide accurate and detailed information for us to assist you effectively.


Chapters

00:00 → Introduction to Object-Oriented Programming (OOP)

02:43 → Importance of Low-Level Design (LLD)

05:55 → Low-Level Design from an Interview Perspective

11:42 → Overview of OOP, SOLID Principles, and LLD

15:25 → The Four Pillars of OOP

19:20 → Understanding Inheritance and Polymorphism

24:46 → Exploring Commonly Used Libraries

31:28 → Concept of Data Hiding in OOP

36:06 → Deep Dive into Inheritance

42:10 → Case Studies: Scenario 1 & Scenario 2

49:00 → Understanding Abstract Classes


Four Pillars of OOP: OOP is built on Abstraction, Encapsulation, Inheritance, and Polymorphism, forming the foundation for modular and reusable code design.

Abstraction: Hides complex implementation details from the user (e.g., TV switch-on functionality), exposing only essential features for simplicity and usability.

Encapsulation: Bundles data and methods into a single unit (e.g., a TV class with volume and channel functions), protecting data via access control (e.g., getters/setters for balance in an Account class).

Inheritance: Enables a class to inherit properties and methods from another (e.g., SmartTV extending TV), promoting code reuse and hierarchical organization.

Polymorphism: Allows objects to take multiple forms, achieved through method overriding (e.g., specialized SmartTV features) or overloading, enhancing flexibility in behavior.

Classes and Objects: Classes act as blueprints (e.g., Apartment with attributes like rooms), while objects are instances occupying memory (e.g., a specific 1BHK apartment), bridging design and execution.

Data Hiding: Encapsulation supports data hiding (e.g., private balance in an Account class), restricting direct access and ensuring controlled modification via methods like setters.

Interfaces: Define common behavior across classes (e.g., Priceable interface for sellable pets), enforcing abstraction and enabling generalization for diverse implementations.

Abstract Classes: Provide partial abstraction with shared methods (e.g., a Car class with a common steering method), allowing subclasses to inherit and extend functionality.

Dynamic Method Dispatch: Polymorphism supports runtime method resolution (e.g., calling an overridden method in a SmartTV object via a TV reference), ensuring the correct behavior is executed dynamically.


___
---
***
