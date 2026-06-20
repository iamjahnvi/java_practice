package com.jahnvi;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number upto which we want fibonacci : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        while(b < n){
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.print(a);
        System.out.print(b);
        sc.close();
    }
}
