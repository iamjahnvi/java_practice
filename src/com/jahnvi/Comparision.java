package com.jahnvi;

public class Comparision {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";

        // here both a and b points towards the same object inside the string pool in heap memory.

        // == method
        System.out.println(a==b);
        // true

        // this method checks not only the value the ref var contains but also the object  it is pointing towards.


        // if u only want to check values the ref var contains then use .equals method

        System.out.println(a.equals(b));

        String name1 = new String("kunal");
        String name2 = new String("kunal");

        // here by using the keyword new we have explicitly created two new objects outside the string pool and the ref var are pointing towards them inidividually.

        System.out.println(name1==name2);
        // false
        // because they are pointing to diff objects.

        System.out.println(name1.charAt(0));













    }
}
