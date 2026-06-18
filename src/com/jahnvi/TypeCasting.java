package com.jahnvi;

public class TypeCasting {
    public static void main(String[] args) {
        int num = (int)(65.45f);
        System.out.println(num);

        // this way , we are explicitly changing the data type of num from float to int.

        // automatic type promotion in expressions
        
        int a = 257;
        byte b = (byte)(a);
        // b = 257%256 = 1

        System.out.println(b);

        // data-type , byte can store value only upto 256, so when value of 257 is given to it, it returned 1.

        byte p = 40;
        byte q = 50;
        byte r = 100;
        int s = p*q/r;
        System.out.println(s);

        // notice here that a*b gives 2000, which clearly exceeds the limit of the storing capacity of byte, but still it proceeds without an erroe, because while evaluating , variable of data type byte gets converted into integer.

        // byte val = 50;
        // val = val*3;
        // System.out.println(val);

        // here it showed an error even when val*3 which is 150, is under the limit of byte(of limit 256) , beacuse val was converted into data type int whike evaulating.

        int number = 'A';
        System.out.println(number);

        // here the output would be 65, as automatic type conversion happened converting 65 into ASCII value.


    }
}