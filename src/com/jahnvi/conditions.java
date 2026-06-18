package com.jahnvi;
import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // printing nums from 1-10 :-
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(i);
        }
        //          OR
        for(int num = 1 ; num <= 10 ; num+=1){
            System.out.println(num);
        }

        // printing nums from 1 to n
        System.out.print("Enter number : ");
        float n = sc.nextFloat();
        for(int i = 1 ; i <=n ; i++){
            System.out.println(i);
        }

        // sum or multiplication of nums from 1 to n

        // by for loops :-
        int sum = 0;
        int mul = 1;
        for(int i = 1 ; i <=n ; i++){
            sum+=i;
            mul*=i;
        }
        System.out.println("sum : " + sum );
        System.out.println("product : " + mul);

        // by while loops :-
        sum = 0;
        int j = 1;
        while(j<=n){
            sum+=j;
            j++;
        }
        System.out.println("sum : " + sum);


        // by dd-while loop :-
        sum = 0;
        int z = 1;
        do{
            sum+=z;
            z++;
        } while (z <= n);
        System.out.println("sum : " + sum);
        sc.close();
    }
}
