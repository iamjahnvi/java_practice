package com.jahnvi;
import java.util.Arrays;
import java.util.Scanner;

public class changeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 20;
        swap(a , b);
        System.out.println("a : " + a);
        System.out.println("b : " + b);


        String name = "Kunal kushawaha";
        changeName(name);
        System.out.println(name);


        int[] arr = {2 , 4 , 5 , 7 , 8};
        changeVal(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
    static void swap(int a , int b){
        int temp = a;
        a = b ;
        b = temp;
    }

    // we noticed that we were not able to swap the values of a and b, why?
    // a and b , inside swap function started pointing to some other new object, also the original value of a and b kept pointing to their respective values in the heap.

    static void changeName(String naam){
        naam = "Rahul rana";
    }

    // the name in this case also didn't change, because the string naam inside changeName function, started pointing to a new object, that is rahul rana, without modifying the actual name.

    static void changeVal(int[] arr){
        arr[0] = 99;
    }

    // this is the only case in which the value at the zeroth index of array got changed, becuause the block of code written inside changeVal was also pointing to the same array,and modified it.


}
