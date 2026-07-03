package com.access;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        A obj = new A(10 , "kunal");
        // need to do a few things
        // access the data mem and modify them

        A obj2 = new A(34.22f);
        // System.out.println(obj.num);
        // shows error , becuase data has been hidden, called as data hiding.

        System.out.println(obj2.marks);
        System.out.println(obj.name);
        System.out.println(Arrays.toString(obj.arr));

        System.out.println(obj.getNum());
        // so even tho the method for getting num is private , we still can access it by getter and setters.
        // this is called as data hidden , where we can prevent the data from being called , by making it private.

       obj.setNum(5);
       System.out.println(obj.getNum());
    //    imagine that even tho num's acces was private still we could access it and modify it via getters and setters.

    subClass sc = new subClass(3 , "smriti");
    System.out.println(sc.name);
    // name being public can be accessed in a child class of parent class
    
    System.out.println(sc.getNum());
    // we can also get num is child class, even after being private.

    System.out.println(Arrays.toString(sc.arr));
    // we can also access arr even after having default access modifier in child class

    subClass sc2 = new subClass(34.23f);
    System.out.println(sc2.marks);
    // okay , so even marks had a protected access modifier but we can access it



    }
}
