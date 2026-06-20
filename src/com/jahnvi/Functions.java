package com.jahnvi;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input of two nums and print sum
        // System.out.print("Enter first num : ");
        // float a = sc.nextFloat();
        // System.out.print("Enter second num : ");
        // float b = sc.nextFloat();
        // System.out.println("sum : " + (a+b));

        // make a function of to perform sum :-

        // sum without passing arguments and parameters
        // sum();

        // sum with passing arguments and parameters
        System.out.print("Enter first num : ");
        float a = sc.nextFloat();
        System.out.print("Enter second num : ");
        float b = sc.nextFloat();
        System.out.println("sum : " + sum(a,b));

        // function for greeting
        System.out.println(greet("jahnvi"));
        sc.close();
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num : ");
        float a = sc.nextFloat();
        System.out.print("Enter second num : ");
        float b = sc.nextFloat();
        System.out.println("sum : " + (a+b));
        sc.close();
    }

    static float sum(float a , float b){
        return a+b;
    }

    static String greet(String name){
        String message = "namaste " + name;
        return message;
    }





}
