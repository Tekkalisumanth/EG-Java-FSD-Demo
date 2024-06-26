# Levels of Abstraction in Programming Languages:

Programming languages can be categorized based on their level of abstraction, which defines how closely the language aligns with machine code and hardware architecture. These levels of abstraction include:

**Low-Level Languages:**
These languages are closer to machine code and directly correspond to the hardware architecture.

**Examples include Assembly language.**

**Mid-Level Languages:**
Mid-level languages provide a balance between high-level and low-level languages.
They offer some level of abstraction from hardware specifics while still allowing fine-grained control over system resources.

**Examples include C and C++.**

**High-Level Languages:**
These languages provide a high level of abstraction from the hardware details, focusing more on problem-solving and algorithm implementation.
They are closer to human language and are easier to understand and use.

**Examples include Python, Java, JavaScript, and Ruby.**

Abstraction: Internal Working - how its done rather than what we do

  **eg:** saving a file with Notepad 
      Here we dont know how its saving the file in memory or what form will it be in inside memory etc.

**Compiler:** Completes the conversion to machine code.
        1. Converts the high level code into low level (0's and 1's)
        2. Its faster
        3. Collects the error and displays at the very end
        4. Memory requirement is more

    **Ex:** C Compiler
    
**Interpreter:** Converts line by line to machine code.
        1. Converts the high level code into low level (0's and 1's)
        2. Its slower comparitively
        3. If any error in instruction, it stops and displays then and there
        4. Memory requirement is less

   ** Ex:** BASIC

Programming Paradigms:

 * Imperative - ex: java, c#
 * Declarative - ex: Miranda, Erlang, Haskell, Prolog

` **refer:** https://media.licdn.com/dms/image/C4E12AQGFcNgWwdKEBw/article-inline_image-shrink_1500_2232/0/1583152646078?e=1715817600&v=beta&t=Ok6ZQ0GMadqUjQ7K0etsrM14ET3eu1o6-XNuGPyGljg `


**Object-Oriented:** Examples include Java, C#, etc.

  **Java:**  Not purely object-oriented due to usage of primitive data types (value types) such as int, float, char, boolean, etc. Example of objects: mobile - consisting of screen, buttons, IC chips with attributes.

**Pure object Oriented :**     ex: python

**Partially Object-Oriented:**  ex: C++

Can a C program run in a C++ environment? Yes.

**Reason:**
+ C++ was developed as an extension of C, adding object-oriented features while maintaining backward compatibility with C.
+ Because of this a c program can be saved in .cc extension and can run int C++ environment where it breaks the principle of Object Oriented Core Principles as everything must be in form of class and object only

**Class:**
* Collection of  objects.
* Blueprint.
* Collection common methods or behaviours and attributes shared by all objects
  
**Object: **Instance (representation/example) of a class. Real-world entity, tangible thing.

Example:

**Class Food**
**Objects:** biriyani, dosa.

**Class** : **Bird**
**Objects:** dove, peacock, pigeon, hummingbird.

**Methods/Functions/Behaviours (Actions):**
fly()
lands()

**Attributes/Properties/Variables:**
feathers
beak
eyes
legs


```
**EXAMPLE:**

class Student {
    // Properties/Attributes/Variables
    student ID
    student name
    course
    year
    
    // Methods/Behaviours
    Study()
    read()
    write()
    play()
}
```
### DAY 2

**Title**: Understanding Object-Oriented Concepts through Real-world Examples

**1. Introduction to Objects:**

Objects are real-world entities characterized by physical existence and tangibility.
Attributes define the characteristics of an object, with each attribute holding different values.
2. Understanding Objects through Examples:

**2.1. Student Object:**
**Attributes**: name, course, year, id.
The id uniquely identifies objects of the same class.
**Methods** (Behaviors): study(), writeExam().

Attributes are referred to as state due to their ability to change over time, akin to the change of state in matter.

**2.2. Book Object (Online Book Store):**

**Attributes**: name, no.of.pages, author, edition, qty, available.
**Methods**: purchase().

**2.2. Book Object (Online Book Store):**

**Attributes**:

**Name: "Java 8"
Number of Pages: 300
Author: "ABC"
Edition: 2nd
Quantity: 3
Availability: Yes**

**Methods:**

purchase():
Action: Represents the process of buying a book from the online store.

**Functionality:**
Decreases the quantity of the book by 1.
Updates the availability status accordingly.

**Illustration of Purchase Transactions:**

Initial State:

Quantity: 3
Availability: Yes
User A Buys 1 Book:

Action: User A purchases 1 copy of the book.
Result:
Quantity Decreased: 2
Availability: Yes (Still available)
User B Buys 1 Book:

Action: User B purchases 1 copy of the book.

Result:
Quantity Decreased: 1
Availability: Yes (Still available)

**User C Buys Last Book:**

Action: User C purchases the last available copy of the book.
Result:
**Quantity Decreased: 0
Availability: No (Book out of stock)**

**Conclusion:**
Through the process of purchasing, the quantity of the book decreases until it is no longer available for purchase, demonstrating the change in state of the book object.

**2.3. TV Object:**

Attributes: LED, status, volume, channelNum, ChName, input mode.
Methods: on(), off(), incVol(), decVol(), idle().
Demonstrating state changes through TV operations.

**3. Object-Oriented Principles:**

**3.1. Encapsulation:**

Hiding internal state and requiring all interaction to be performed through an object's methods.
Example: Private class encapsulating variables and methods, objects 

**3.2. Abstraction:**
Presenting only the essential features of an object to the outside world, hiding implementation details.
Example: Abstraction in file content through interfaces like NotePad.

**4. Application of Object-Oriented Concepts:**
**4.1. ATM Machine:**

Logic for withdraw() and deposit() hidden, while user interacts through UI buttons.

**4.2. Notepad Interface:**
Interface providing a view with methods like save(), open(), new().
 Windows OS:
Complex logic encapsulated within the operating system, abstracting details from users.

**5. Conclusion:**
Understanding objects through real-world examples helps grasp fundamental object-oriented concepts.
Encapsulation and abstraction play pivotal roles in organizing and managing complex systems effectively.
