package com.jahnvi.properties.abstraction;

public abstract class Parent {
    int age ;

    public Parent(int age){
        this.age = age;
    }
    // we can make a constructor in the abstract class and can also call it in the child class , normally by using "super" keyword.

    abstract void career(String name);
    abstract void partner(String name, int age );

    static void hello(String nameString){
        System.out.println("Hello " + nameString);
    }
    // creation of static method in abstract class of java is possible, and we can also  call it.
    // but being static they cannot be overriden in child class.

    // we cannot have parent class as final , becuase abstarct class is the class being is being built with the purpose of being overidden by child classes  , so it cannot be final.


}
