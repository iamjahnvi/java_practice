package com.jahnvi;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {23 , 28 , 29 , 20 , 45};
        // question : find whether any num exists in array or not?
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        boolean ans = checkNum(arr, num);
        System.out.println(ans);

        // question : find the index of num in this array:-
        int answer = findIndex(arr, num);
        System.out.println("index : " + answer);

        // question : find the number and return it
        int number = reNUm(arr, num);
        System.out.println("element in array : " + number);
        sc.close();

    }

    // function to checkNum :-

    static boolean checkNum(int[] arr , int num){
        if(arr.length == 0 ){
            return false;
        }
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    // function to find index
    static int findIndex(int[] arr , int num){
        if(arr.length == 0 ){
            return -1;
        }
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }

    // search the num and return the num itself
    static int reNUm(int[] arr , int num){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i]==num){
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }
}
