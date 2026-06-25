package com.jahnvi;

public class string {
    public static void main(String[] args) {
        // string is the most commonly used class in java class library.

        String name = "Kunal Kushwaha";

        // name is a reference variable of datatype string pointing to object kunal kushwaha.

        String a = "kunal";
        String b = "Advik";

        // the question is , whether a and b are pointing to the same object in the heap memory?

        // for this we need to understand the concept of string pool.
        // in the heap , there is a string pool and any reference variable points to an object inside that string pool.

        // the doubt that can come to our mind is that if we make any change in b , then similar change would occur in b , but that's not how it works. strings are immutable hence we cannot change them at all.
        // strings are immutable becz of security reasons.

        String c = "Kunal";
        System.out.println(c);    // kunal
        c = "kushwaha"; 
        System.out.println(c);    // kushwaha

        // but this time , the object inside the ref var c got changed into kushwaha. how?

        










    }
}
