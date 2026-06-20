package com.jahnvi;
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        boolean ans = checkPrime(n);
        System.out.println(ans);
        in.close();
    }
    static boolean checkPrime(int n ){
        if(n <=1 ){
            return false;
        } else {
            for(int i = 2 ; i <= Math.sqrt(n) ; i++){
                if(n%i==0 && n!=i){
                    return false;
                }
            }
            return true;
        }
    }
}
