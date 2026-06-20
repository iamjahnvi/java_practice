package com.jahnvi;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();


        // first approach
        // int max = a;
        // if(b > max){
        //     max = b;
        // }
        // else if(c>max){
        //     max=c;
        // }
        // System.out.print("Maximum number : " + max);

       // second approach
       //    int max = 0;
       //    if(a > b){
       //     max = a;
       //    } else {
       //     max = b;
       //    }

       //    if(c > max){
       //     max=c;
       //    }
       //    System.out.print("Maximum number : " + max);

        // third approach
        int max = Math.max(c , Math.max(a , b));
        System.out.println("Max : " + max);
        sc.close();

    }
}
