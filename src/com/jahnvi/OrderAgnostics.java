package com.jahnvi;

public class OrderAgnostics {
    public static void main(String[] args) {
        // in order agnostics we are given a sorted array, and we have to figure out if it is sorted in ascending or descending order , and then perform binary search.

        int[] arr = {48, 36, 20, 14, 12, 11, 9, 6, 4, 2};
        int target = 14;
        int s = 0 ; 
        int e = arr.length-1;

        if(s>e){
            // descendingly sorted array 
            System.out.println(binarySearch(arr,target));
        }
        if(e>s){
            // ascendingly sorted array
            System.out.println(searchBinary(arr,target));
        }
    }
    static int binarySearch(int[] arr , int target){
        int s = 0 ; 
        int e = arr.length-1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]>target){
                s = mid + 1;
            } else {
                e = mid -1;
            }
        }
        return -1;
    }
    static int searchBinary(int[] arr , int target){
        int s = 0 ; 
        int e = arr.length-1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]>target){
                e = mid -1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    
}
