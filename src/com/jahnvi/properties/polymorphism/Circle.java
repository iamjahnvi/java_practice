package com.jahnvi.properties.polymorphism;

public class Circle extends Shapes{

    // this will run when obj of circle is created.
    // and as this area() function , in Circle(the child class) is same as that of , in Shapes(the parent class) {the return type - void , the name - area } , except for the body, that is different , hence this is method overriding.

    @Override 
    // this is annotation

    void area(){
        System.out.println("Area is square of side");
    }

    // void volume(){
    // System.out.println("The volume of circle Pie*r*r*h");
    // }

    // why this above thing is showing an error, becuase we cannot override a method which is already declared as final

// full explaination :-

// Because final means “this method is locked and cannot be changed by subclasses.”

// In Java, a method marked final is treated as a fixed implementation:

// the parent class says, “this behavior is complete”
// the child class is not allowed to replace it
// Why Java enforces this:

// It protects important behavior from being altered
// It keeps the class contract stable
// It prevents accidental or unsafe changes in inheritance
}

// in this case when we are using extend keyword before Shapes, it is showing an error , why?
// because here by mistake i defined Shapes as record which is implicity final, and by that it means that we cannot really extend a child class from it.

// the difference between class and record :-

// Class = general-purpose blueprint
// Record = special-purpose immutable data carrier