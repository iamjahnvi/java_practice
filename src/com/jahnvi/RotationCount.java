package com.jahnvi;

public class RotationCount {
    public static void main(String[] args) {
        // rotation count will be equal to pivot + 1;


        int[] arr = {2 , 3, 6 , 12 , 15 , 18};
        int rotations = findPivot(arr) + 1;
        System.out.println(rotations);
    }

    // this one for non duplicate array :-
    static int findPivot(int[] arr){
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
            if(arr[s]>=arr[mid]){
                e = mid-1;
            } else {
                s = mid+1;
            }
        }
        return -1;
    }

    // this one for duplicate array :-
    static int findPivotDuplicate(int[] arr ){
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
            // didn't get i
             }
        }
        return -1;
    }
}
