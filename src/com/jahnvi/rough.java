package com.jahnvi;
import java.util.Arrays;

public class rough {
    public static void main(String[] args) {
        // int[][] arr = {
        //     {23 , 45 , 6 , 6 , 7},
        //     {34 ,3 , 4 , 2},
        //     {90, 2 , 12 , 8},
        //     {100 , 22 , 1}
        // };
        // int target = 22;
        // System.out.println(Arrays.toString(search(arr, target)));

        // System.out.println(Arrays.toString(Sum(arr)));

        // System.out.println(sumC(arr));


        // int[] array={ 2, 4, 6 , 9 , 11 , 12, 14, 20,36 ,48};

        // // question : to find index  of 36 by binary search algorithmn
        // System.out.println(binarySearch(array));

        // int[] nums = {2, 4, 6, 8, 10, 12};
        // int tar = 8;
        // int[] nums = { 5 , 10 , 15};
        // int tar = 5;
        // System.out.println(Ceiling(nums, tar));


        int[] arr = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(Position(arr,target)));
    }

    // static int[] search(int[][] arr , int target){
    //     for(int i = 0 ; i < arr.length ; i++){
    //         for(int j = 0 ; j < arr[i].length ; j++){
    //             if(arr[i][j]==target){
    //                 return new int[]{i, j};
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }

    // static int[] Sum(int[][] arr){
    //     int[] sums = new int[arr.length];
    //     for(int i = 0 ; i < arr.length ; i++){
    //         int sum = 0;
    //         for(int j = 0 ; j < arr[i].length ; j++){
    //             sum+=arr[i][j];
    //         }
    //         sums[i] = sum;
    //     }
    //     return sums;
    // }

    // static int sumC(int[][] arr){
    //     int sum = 0;
    //     for(int j = 0 ; j < arr.length ; j++){
    //         for(int i = 0 ; i < arr[j].length ; i++){
    //             sum+=arr[j][i];
    //         }
    //     }
    //     return sum;
    // }

    // static int binarySearch(int[] array){
    //     int find = 36;
    //     int s = 0;   // s - start
    //     int e = array.length - 1;   // e - end

    //     while(s<=e){

    //         int mid = s + (e-s)/2;

    //         // if we will write mid = s+e/2 , it will treat it as [ s + e/2 ] , because of precendence.

    //         if(find==array[mid]){
    //             return mid;
    //         }
            
    //         if(find > array[mid]){
    //             s = mid + 1;
    //         } else {
    //             e = mid - 1;
    //         }
    //     }
    //     return -1;
    // }
    // static int Ceiling(int[] arr , int target){
    //     int s = 0;
    //     int e = arr.length - 1 ;
    //     int mid = s + (e-s)/2;


    //     while(s<=e){
    //         mid = s + (e-s)/2;

    //         if(target==arr[mid]){
    //             return arr[mid];
    //         }
    //         if(target>arr[mid]){
    //             s=mid+1;
    //         } else {
    //             e=mid-1;
    //         }
    //     }
    //     return s;
    // }

    static int[] Position(int[] arr , int target){
        int s = 0;
        int e = arr.length - 1;

        while(s<=e){

            int mid = s + (e-s)/2;

            if(arr[mid] < target){
                s=mid+1;
            } else {
                e=mid-1;
            }

            if(arr[mid]==target){
                int i = mid;
                int j = mid;

                while(arr[i-1]==target && i >0){
                    i--;
                }
                while(j<arr.length-1 && arr[j+1]==target){
                    j++;
                }
                return new int[]{i,j};
            }
            return new int[]{-1,-1};
        }
        return new int[]{-1,-1};
    }


}