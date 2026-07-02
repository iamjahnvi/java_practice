package com.jahnvi.properties.polymorphism;

public class Shapes{
    // Shapes is a parent class , having a method area
    void area(){
        System.out.println("we will find area of shapes");
    }

    // early binding - this is used to prevent the method from overriding , as by using the keyword final we cannot override it in any other child class

    final void volume(){
        System.out.println("we will find the volumes of shapes");
    }

    // late binding - when we can override the methods of parent class in child class , then it is late binding

}
