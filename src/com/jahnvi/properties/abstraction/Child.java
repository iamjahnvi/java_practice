package com.jahnvi.properties.abstraction;

public abstract class Child extends Parent{
    public Child(int age) {
        super(age);
        //TODO Auto-generated constructor stub
    }
    void career(String name){
        System.out.println("name : " + name);
    }
    void partner(String name, int age ){
        System.out.println("partner's name : " + name + "age : " + age);
    }
    // it showed error when i didn;t write abstract in front of return type - void, why?
    // becuase writing abstract keyword means , only declaration of a particular method will be done, with no implemention as we did in parent class.

    // multiple inheritance is not allowed in case of abstrac classes , due to which , a single child class cannot inherit more than one parent class , and this problem is being solved by interfaces, where the methods are defined similar to that of abstract methods, but the only diff is we can inherit multiple classes. also in case of intefaces, the variables used are static(whose object cannot be made)and final in nature(cannot be changed). the keyword used in case of abstarction is extends  , while that in interfaces is implements.
}
