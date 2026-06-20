package com.jahnvi;
import java.util.Scanner;

public class OverLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // overloading only means that there could be two functions of same name but different functanilities, and the compiler with understand by itself the usuage of each one of them.

        int sum1 = sum(11 , 12);
        System.out.println("sum : " + sum1);
        int sum2 = sum(1 , 2 , 3);
        System.out.println("SUM : " + sum2);
        sc.close();

    }
    static int sum(int a , int b){
        return a+b;
    }
    static int sum(int num1 , int num2 , int num3){
        return num1 + num2 + num3;
    }
}
