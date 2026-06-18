package com.jahnvi;
import java.util.*;

public class rough {
    public static void main(String[] args) {
        int[][] arr = {
            {23 , 45 , 6 , 6 , 7},
            {34 ,3 , 4 , 2},
            {90, 2 , 12 , 8},
            {100 , 22 , 1}
        };
        int target = 22;
        System.out.println(Arrays.toString(search(arr, target)));

        System.out.println(Arrays.toString(Sum(arr)));

        System.out.println(sumC(arr));


        int[] array={ 2, 4, 6 , 9 , 11 , 12, 14, 20,36 ,48};

        // question : to find index  of 36 by binary search algorithmn
        System.out.println(binarySearch(array));

    }

    static int[] search(int[][] arr , int target){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int[] Sum(int[][] arr){
        int[] sums = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < arr[i].length ; j++){
                sum+=arr[i][j];
            }
            sums[i] = sum;
        }
        return sums;
    }

    static int sumC(int[][] arr){
        int sum = 0;
        for(int j = 0 ; j < arr.length ; j++){
            for(int i = 0 ; i < arr[j].length ; i++){
                sum+=arr[j][i];
            }
        }
        return sum;
    }

    static int binarySearch(int[] array){
        int find = 36;
        int s = 0;   // s - start
        int e = array.length - 1;   // e - end

        while(s<=e){

            int mid = s + (e-s)/2;

            // if we will write mid = s+e/2 , it will treat it as [ s + e/2 ] , because of precendence.

            if(find==array[mid]){
                return mid;
            }
            
            if(find > array[mid]){
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
