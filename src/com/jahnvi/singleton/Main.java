package com.jahnvi.singleton;

public class Main {
    public static void main(String[] args) {

        // Singleton single = new Singleton();

        // it is showing an error , why? because Singleton can be used privately within the class named as Singleton.

        Singleton obj1 = Singleton.getInstance();
        //Cannot make a static reference to the non-static method getInstance() from the type Singleton

        // this is the error that it showed when we made an object of Singleton class , defined in Singleton.java

        // to solve it, we'll make getInstance as static

        Singleton obj2 = Singleton.getInstance();

        
        Singleton obj3 = Singleton.getInstance();

    }

    // as we made our singleton class private we cannot make an object of it here, so the question is where can we actually make on object of singleton class, the ans is within that class itself.

    // to get an instance of that class, we  make a function, to do so, and for that , we check , if instance is null , if yes, we'll make an instance of singleton class.

    // in Main.java (here) , we call only call an instance of Singelton class, which is already being created in that file. we refer , obj1 to the first instance that is being made there, then we make another obj here  , and see if it can point to some other instance but the thing is it is a singleton class with a check system by if else which keeps in check that only one instance is created , even wjen the new ref var obj2 is created, it still points to the previous instance only.











}
