package com.jahnvi;

public class LCwealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1 , 5} , 
            {7 , 3} ,
            {3 , 5}
        };
        
        System.out.println(largestRow(Sum(accounts)));
    }
    static int[] Sum(int[][] arr){
        int[] sums = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < arr[i].length ; j++){
               sum += arr[i][j];
            }
            sums[i] = sum;
        }

        return sums;
    }
    static int largestRow(int[] sums){
        int max = Integer.MIN_VALUE;

        // for(int i = 0  ; i < sums.length ; i++){
        //     if(sums[i] > max){
        //         max = sums[i];
        //     }
        // }

        for(int num : sums){
            if(num > max){
                max = num;
            }
        }

        return max;
    }
}
