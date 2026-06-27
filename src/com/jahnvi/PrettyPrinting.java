package com.jahnvi;

import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.12345f;
        System.out.printf("The formatted number is %.2f" , a);

        System.out.printf("Pie : %.3f" , Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and i am %s " , "kunal" , "cool");


        System.out.println('a' + 'b');
        // shows sum of their ascii values

        System.out.println("a" +"b");
        // concatenation of characters

        System.out.println();

        System.out.println('a' + 3);
        // shows 100

        System.out.println((char)('a' + 3));
        //prints d

        System.out.println("a" + 1);

        // prints a1
        // this is same as after a few steps , which is "a" + "1"
        // integer will be converted to Integer that will call to toString()

        System.out.println("Kunal" + new ArrayList<>());
        // print Kunal[]

        System.out.println("kunal" + new Integer(56));
        // print kunal56

        // in all these cases it is passing them as objects to toString method which is converting them into strings and then concatenating them together.

        // System.out.println(new ArrayList<>() + new Integer(56));

        // this is showing error , why?
        // the plus operator in java must be only used with , either two primitives or , when either one of them is an primitive or any string.

        // for example , this will work:-

        System.out.println(new ArrayList<>() + "" + new Integer(56));

        // also the entire result will be of string type.

        



        




    }
}
