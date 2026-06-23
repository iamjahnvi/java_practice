package com.jahnvi;

public class LCq1095{
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5 , 3 , 1};
        int target = 3;

        int peak = findPeak(arr);
        int firstTry = findTargetIndex(arr, target , 0 , peak);
        int result;
        if(firstTry != -1){
            result = firstTry;
        } else {
            result = OrderAgnosticsBinarySearch(arr, target , peak + 1, arr.length-1);
        }
        System.out.println(result);
    }

    static int findPeak(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while(s==e){
            int mid = s + (e-s)/2;
            if(arr[mid+1] > arr[mid]){
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }

    static int findTargetIndex(int[] arr , int target , int s , int e ){

        while(s<=e){
            int mid = s + (s-e)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    static int OrderAgnosticsBinarySearch(int[] arr , int target , int s , int e ){

        while(s<=e){
            int mid = s + (s-e)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
