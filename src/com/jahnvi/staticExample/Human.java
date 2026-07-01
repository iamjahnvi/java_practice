package com.jahnvi.staticExample;

public class Human {
   int age;
   String name;
   boolean married;
   String gender;
   float salary;
   static long population;

   static void message(){
    System.out.println("yoyoyoyo");
    // System.out.println(this.name);

    // we cannot use this keyword inside a static method.
    // in static we cannot use "this" keyword , becuase it is of non static nature and is used to access objects.
   }

   public Human(int age, String name, boolean married , String gender , float salary){
    this.age = age;
    this.name = name;
    this.married = married;
    this.gender = gender;
    this.salary = salary;
    Human.population+=1;

    // here name, age , salary , gender, population are all instant variables.

    // as soon as we add static keyword in population, it displays error in the constructor, as we need to realise that population doesn't really behaves like that of an object due to which "this" keyword cannot be used for it. and hence this.
   }







}


