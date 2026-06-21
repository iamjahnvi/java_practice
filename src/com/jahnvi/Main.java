package com.jahnvi;

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        System.out.println("hello janvi");
        // System is a class, containing a variable out, which is of type prinstream , and out has  a method called println.

        // String[] args is a command line argument, which means it stores value in the array which we input at the terminal, which can of any data type, be it integer,strig, float, boolean.

        System.out.println("Hello world");

        System.out.println(args[0]);
        // will print the data at 0th index of inputs we pass.

        Scanner sc = new Scanner(System.in);
        // object sc is of class scanner and by typing "new" we initialize that object, and within it , as we write system.in , that means input has to be taken from keyboard.
        
        // System.out is a standard output stream, that displays output in terminal, when we write System.out.println(), it means in standard output stream print, whatever is written inside it.

        // system.out for command line output
        // system.in is referring to taking input from keyboard.

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }
}
