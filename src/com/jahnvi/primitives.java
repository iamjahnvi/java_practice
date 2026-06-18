package com.jahnvi;
import java.util.Scanner;

public class primitives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int age = 23;
        float marks = 99.7f;
        char ch = 'r';
        String str = "kunal";
        double val = 9999.6564;
        long num = 555555L;
        boolean check = true;
        boolean unCheck = false;

        // literals are the syntactical representation of boolean, integers, float etc.

        // identfiers are the variables inside which the value of literal is being stored.

        System.out.print("Enter a number : ");
        float number = input.nextFloat();
        System.out.println(number);

        // float is a primitive data-type.

        System.out.print("Enter an integer : ");
        int value = input.nextInt();
        System.out.println(value);

        // int is a primitive data-type.

        
        System.out.print("Enter a character : ");
        char character = input.next().charAt(0);
        System.out.println(character);

        // char is a primitive data-type.

        input.nextLine();
        // this is written , not to store anything by itself but to consume the leftover Enter key that is in the input buffer.
        // without it , it would consider the string to be empty and will move forward, printing no string.

        System.out.print("Enter a string : ");
        String string = input.nextLine();
        System.out.println(string);

        // string is not a primitive data-type.

        input.close();
    }
}
