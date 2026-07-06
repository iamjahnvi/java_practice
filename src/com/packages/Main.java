package com.packages;

import com.access.A;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10 , "kunal");
        System.out.println(obj.getNum());
        // we can access num here , even when it's private by using getter.

        obj.setNum(54);
        System.out.println(obj.getNum());
        // will return the setted num

        System.out.println(obj.name);
        // as this is public , it can be accessed anywhere

         
        // System.out.println(Arrays.toString(obj.arr));
        // it is showing error as we cannot access something that has default access modifier, in some other package

        A object = new A(54.34f);
        // System.out.println(object.marks);
        // marks being protected cannot be accessed in some other package

    }
}
