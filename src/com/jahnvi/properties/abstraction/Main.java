package com.jahnvi.properties.abstraction;

public class Main {
    public static void main(String[] args) {
        // create an anonymous subclass instance of the abstract Child
        Child child = new Child(30) {};
        child.career("doctor");
        child.partner("pickachu", 24);
        System.out.println(child.age);


        // Parent parent = new Parent(55);
        // we cannot create object of abstract class.

        // this is such a interesting point to note that we can make an object of Child class, which is actually child class of parent class, but we cannot make object of parent class.

        Parent.hello("nidhi");
        // calling of a static method in abstarct class - Parent



    }
}
