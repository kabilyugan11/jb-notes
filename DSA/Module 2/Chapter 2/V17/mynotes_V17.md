# Video 17 - SOLID OOPS PART 2

## My_Notes:
```
* SOLIDS:
    S - Single Responsibility Principle (SRP)
        Too many if else - Violate/Break S | To avoid this split into seperate classes and make this as Interface

        Bad:
        class Invoice {
            void calculateTotal() {}
            void printInvoice() {}
            void saveToDatabase() {}
        }

        GOOD:
        class Invoice {
            void calculateTotal() {}
        }

        class InvoicePrinter {
            void print(Invoice invoice) {}
        }

        class InvoiceSaver {
            void save(Invoice invoice) {}
        }

    O - Open for Extention / new functionality | Open/Closed Principle (OCP)
        But closed for modification (Won't alter existing code)

        BAD:
        class Payment {
            void pay(String type) {
                if (type.equals("credit")) {
                    // credit payment
                } else if (type.equals("paypal")) {
                    // paypal payment
                }
            }
        }

        GOOD: //Now you can extend without modifying existing code.
        interface PaymentMethod {
            void pay();
        }

        class CreditCard implements PaymentMethod {
            public void pay() {
                System.out.println("Paid with credit card");
            }
        }

        class PayPal implements PaymentMethod {
            public void pay() {
                System.out.println("Paid with PayPal");
            }
        }

        class Payment {
            void pay(PaymentMethod method) {
                method.pay();
            }
        }

    L - Liskov Substitution Principle (LSP)
        Objects of a subclass should be replaceable for objects of the superclass without breaking the program.

        BAD:
        class Bird {
            void fly() {}
        }

        class Ostrich extends Bird {
            void fly() {
                throw new UnsupportedOperationException();
            }
        }

        GOOD:
        class Bird {}

        class FlyingBird extends Bird {
            void fly() {}
        }

        class Ostrich extends Bird {}

        class Sparrow extends FlyingBird {
            void fly() {
                System.out.println("Sparrow flying");
            }
        }


    I - Interface Segregation Principle (ISP)
        Don’t force a class to implement methods it doesn’t use.

        BAD:
        interface Worker {
            void work();
            void eat();
        }

        class Robot implements Worker {
            public void work() {}
            public void eat() {}  // 🤖 Robots don’t eat!
        }

        GOOD:
        interface Workable {
            void work();
        }

        interface Eatable {
            void eat();
        }

        class Human implements Workable, Eatable {
            public void work() {}
            public void eat() {}
        }

        class Robot implements Workable {
            public void work() {}
        }

    D - Dependency Inversion Principle (DIP)
        Depend on abstractions, not on concrete classes 
        Loosely coupled code

        BAD: //Switch is tightly coupled to LightBulb
        class LightBulb {
            void turnOn() {}
        }

        class Switch {
            LightBulb bulb = new LightBulb();

            void operate() {
                bulb.turnOn();
            }
        }

        GOOD: //Switch works with any Switchable device, not just a LightBulb.
        interface Switchable {
            void turnOn();
        }

        class LightBulb implements Switchable {
            public void turnOn() {
                System.out.println("LightBulb turned on");
            }
        }

        class Switch {
            private Switchable device;

            public Switch(Switchable device) {
                this.device = device;
            }

            void operate() {
                device.turnOn();
            }
        }


* SEE IMAGES
```

## Images:
``` Images Folder - Available ```
![Image of V17](Images/(V17)%201.png)
![Image of V17](Images/(V17)%202.png)
![Image of V17](Images/(V17)%203.png)
![Image of V17](Images/(V17)%204.png)
![Image of V17](Images/(V17)%205.png)
![Image of V17](Images/(V17)%206.png)
![Image of V17](Images/(V17)%207.png)
![Image of V17](Images/(V17)%208.png)
![Image of V17](Images/(V17)%209.png)
![Image of V17](Images/(V17)%2010.png)
![Image of V17](Images/(V17)%2011.png)
![Image of V17](Images/(V17)%2012.png)
![Image of V17](Images/(V17)%2013.png)
![Image of V17](Images/(V17)%2014.png)
![Image of V17](Images/(V17)%2015.png)
![Image of V17](Images/(V17)%2016.png)
![Image of V17](Images/(V17)%2017.png)
![Image of V17](Images/(V17)%2018.png)
![Image of V17](Images/(V17)%2019.png)
![Image of V17](Images/(V17)%2020.png)
![Image of V17](Images/(V17)%2021.png)
![Image of V17](Images/(V17)%2022.png)
![Image of V17](Images/(V17)%2023.png)

## Code:
``` NO Code Folder```

### Description Of 17 - SOLID OOPS PART 2:
Doubt Submission Form

Please use the following link to access the form and submit your queries. 

https://forms.gle/SCVudmcPMW7UH9Mh9

We will review your submissions and provide clarifications as soon as possible. Ensure you provide accurate and detailed information for us to assist you effectively.


SOLID Principles in Object-Oriented Programming (Part 2)

CHAPTERS :

00:00 - Introduction

01:09 - S - Single Responsibility Principle

04:34 - Transferring object data (DTOs)

07:07 - Too many if/else leads to breaking Single Responsibility

16:56 - Product class in ecommerce application example

18:42 - Utility class discussion

20:48 - O - Open for extension, closed for modification (OCP)

25:00 - Abstract core behavior using interfaces

27:20 - L - Liskov's Substitution Principle

35:10 - IS-A relationship principle

36:19 - I - Interface Segregation Principle

39:08 - D - Dependency Inversion: Loose Coupling

41:08 - Code smells indicating SOLID violations

43:20 - Bad code principles can break SOLID

46:06 - Explanation of Dependency Inversion with adapter pattern exam


Summary Points:

Single Responsibility Principle (SRP): Each class should have only one reason to change and be responsible for a single part of the functionality. For example, separating order processing from invoice printing.

Open/Closed Principle: Software entities should be open for extension but closed for modification. Adding new functionality shouldn't require changing existing code.

Liskov Substitution Principle: Child classes should be substitutable for their parent classes without unexpected behaviors. Child objects should work correctly when used with parent references.

Interface Segregation Principle: Keep interfaces lightweight and focused rather than creating large interfaces with many methods. This prevents classes from implementing methods they don't need.

Dependency Inversion Principle: High-level modules should depend on abstractions rather than concrete implementations. This creates loose coupling between classes.

Adapter Pattern: Used when integrating external services like payment processors. Instead of directly using external APIs, implement adapter classes that conform to your interfaces.

Factory Design Pattern: Recommended for creating objects that implement common interfaces, particularly when working with external services.

Code Smells: Too many instance variables or methods in a class indicates a violation of the Single Responsibility Principle and should be refactored.

Testing Benefits: Following SOLID principles makes code more testable, allowing for effective unit testing that won't break when adding new features.

Practical Application: The lecture used an e-commerce application example to illustrate SOLID principles, including order processing, payment processing, and product management scenarios.


___
---
***
