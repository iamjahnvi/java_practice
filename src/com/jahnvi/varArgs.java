package com.jahnvi;
import java.util.Scanner;
import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        fun(1,2,3,4,5,6,7,8);
        function(1 , 2 , "kunal" , "kashhish" , "kirti");
        sc.close();

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    // varArgs means variable number of argruments.

    static void function(int a , int b , String ...v){
        System.out.println(a + "" + b + "" + Arrays.toString( v));
        // only possible way to print, a and b alongwith var
    }

}
