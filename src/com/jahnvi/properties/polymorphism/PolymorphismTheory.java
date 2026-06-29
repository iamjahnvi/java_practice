package com.jahnvi.properties.polymorphism;

public class PolymorphismTheory {
    public static void main(String[] args) {
        
        // types of polymorphism

        // 1) compile time / static polymorphism -


        // achieved via method overloading
        // method overloading means same name of methods but return types, no of arguments , types of arguments can be diff.
        // example - multiple constructors

        // this type of polymorphism , is called static or compile polymorphism becuase the constructors undergoing method overloading undergoes correction, or are implemented only while compile time.


        // 2) runtime or dynamic polymorphism

        // achieved by method overriding
        // method overriding - when the child class has a method of same name, return type, no.and type of parameters as that of the super/parent class but only the body is different.

        // Parent obj = new Child();
        // here the method which will be called will depend on the child class , but the accessibility of methods depends on the parent class.
        // this is known as upcasting

        // How java determines this upcasting?
        // by dynamic method dispatch

        // it is a mechanism by which a call to a overriden method (it is a method which is defined in both child and parent class, with same name , type and number of arguments and return type) is resolved at runtime than that at compile time.





        



    }
}
