package com.jahnvi;
import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 136223;
        System.out.print("Enter the number whose occurence to be find : ");
        int val = sc.nextInt();
        int count = 0;
        while(num!=0){
            int rem = num % 10;
            if(rem == val){
                count++;
            }
            num = num / 10;
        }
        System.out.println("Occurence of " + val + " is " + count);
        sc.close();
    }
}
