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
}
