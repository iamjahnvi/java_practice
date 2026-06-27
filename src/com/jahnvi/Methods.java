package com.jahnvi;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Kunal kushwaha";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());
        // it's not changing the main name but only creating a new object of it.
        System.out.println(name);
        System.out.println(name.endsWith("h"));
        System.out.println(name.length());
        
        System.out.println(Arrays.toString(name.split(" ")));
        // split it from where it has got spaces 








    }
}
