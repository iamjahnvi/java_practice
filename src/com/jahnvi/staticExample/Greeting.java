package com.jahnvi.staticExample;

public class Greeting {
    public static void main(String[] args) {

        // greeting();
        // it is showing error as we cannot access anything main that is non-static.

        Main funn = new Main();

        // funn is an object created which can call the method fun2()

        funn.fun2();

    } 

    static void fun(){

        // greeting();

        // inside this we again cannot call greeting, as calling a non-static function inside a static one is not allowed.

        // also greeting is not static meaning it depends on instances, and fun , on the other hand , greeting , does depend on instances , which means , it is logically impossible to have anything , non static inside static function

        // you cannot access any non static stuff without referencing their instances in a static context , 

        // hence , here i am referencing it

        Main obj = new Main();
        obj.greeting();

    }

    // we know that somwthing which is not static , belongs to an object.

    void greeting(){
        System.out.println("heelo jii");

        // here there is static method inside a non static one, which is allowed.
    }

    void fun2(){
        greeting();
        // here there is non static method inside a non static one, which is allowed but for that an object has to be created in main class.
    }


    // calling of a non static obj inside a non static obj requires the formation of an object in main , otherwise it won't run
}
