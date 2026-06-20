package com.jahnvi;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23 , 4 , 56 , 7},
                {2 , 5 , 6},
                {12 , 4 }
        };

        // question : to find the index of target in 2-D array:-
        int target = 1;
        System.out.println(Arrays.toString(search(arr, target)));

        // question : to find the max in 2-D array
        int ans = findMax(arr);
        System.out.println("max : " + ans);

        // question : find the occurence of 4 in 2-D array
        int find = 4;
        System.out.println("count : " + findCount(arr));

        // question : sum of each row
        System.out.println(Arrays.toString(Sum(arr)));

      

    }

    static int[] search(int[][] arr , int target){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int findMax(int[][] arr){
        int max = arr[0][0];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    return max;
                }
            }
        }
        return Integer.MAX_VALUE;
    }
    static int findCount(int[][] arr){
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j]==4){
                  count++;
                }
            }
        }
        return count;
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

   
   







}
