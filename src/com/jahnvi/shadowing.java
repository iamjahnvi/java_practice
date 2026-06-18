package com.jahnvi;
import java.util.*;

public class shadowing {
    static int x = 40;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(x);  // 40

        int x = 90;
        System.out.println(x);  // 90
        // the class variable x , which is 40 in line 5 will be shadowed by this.
        
        fun();                  // 40
        sc.close();
    }
    static void fun(){
        System.out.println(x);
    }
}
