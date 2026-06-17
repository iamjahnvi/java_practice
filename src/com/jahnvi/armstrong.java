package com.jahnvi;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        boolean ans = checkArmstrong(number);
        System.out.println(ans);
        sc.close();
    }
    static boolean checkArmstrong(int number){
        int original = number;

        int count = 0;
        int temp = number;

        while(temp > 0 ){
            count++;
            temp = temp / 10;
        }
        temp = number;
        int sum = 0;
        while(temp > 0 ){
            int rem = temp % 10;
            sum+= Math.pow(rem,count);
            temp = temp/10;
        }
        if(sum==original){
            return true;
        } else {
            return false;
        }
    }
}
