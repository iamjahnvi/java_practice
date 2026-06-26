package com.jahnvi;

public class RotatedDuplicateArray {
    public static void main(String[] args) {

        // the actual question for finding the targeted element in an array which doesn't contain duplicates is in LCq33.java




    }
    static int findPivot(int[] arr ){
        int s = 0;
        int e = arr.length - 1;

        while(s<=e){

            // the cases for finding peak in rotated array are as follows :-
            int mid = s + (e-s)/2;

            if(arr[mid+1] < arr[mid] && mid < e ){
                return mid;
            } 
            if(arr[mid] < arr[mid-1] && mid > s){
                return mid-1;
            }
            else if(arr[s]==arr[mid] && arr[mid]==arr[e]){
                // skip the duplicates
                // but what if these elements at start and end were the pivots themselves??

                if(arr[s] > arr[s+1]){
                    return s;
                } 
                s++;
                if(arr[e-1] > arr[e]){
                    return e-1;
                }
                e--;
            }
            else if(arr[s]<arr[mid] || (arr[s]==arr[mid] && arr[mid] > arr[e])){
                s = mid +1;
            } else {
                e = mid-1;
            // didn't get it

        }
    }
    return -1;
}
}

