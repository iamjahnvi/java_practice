package com.jahnvi;

public class LCq33 {
    public static void main(String[] args) {
        
        // question : search in rotated sorted array
        // asked in google and amazon

        // Rotated binary search

        // for example :-
        // int[] array = {2 , 4 , 5 , 7 , 8 , 9 , 10 , 12};

        // after first rotation : -
        // int[] array = {12 , 2 , 4 , 5 , 7 , 8 , 9 , 10}

        // after second rotation :-
        // int[] array = {10 , 12 , 2 , 4 , 5 , 7 , 8 , 9}

        // after third rotation :-
        // int[] array = {9 , 10 , 12 , 2 , 4 , 5 , 7 , 8}

        // all we have to do is to find pivot, the point after which the array is sorted on both sides of it.


        int[] arr = {4 , 5 , 6 , 7 ,0 , 1 , 2};
        System.out.println(findPivot(arr));

        int pivot = findPivot(arr);
        int target = 6;

        System.out.println(ans(arr, target, pivot));

    }

    // all of this will not work for duplicate arrays
    
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


    static int ans(int[] arr , int target , int pivot){
        int result ;
        if(pivot == -1){
            result = binarySearch(arr, target , 0 , arr.length-1);
        }
        if(arr[pivot]==target){
            result = pivot;
        }

        // if(target > arr[pivot+1]){
        //     result = leftSide(arr, target , 0 , pivot-1);
        // } else {
        //     result = rightSide(arr, target , pivot+1 , arr.length-1);
        // }

        // check if the upper one works

        if(target>arr[0]){
            result = binarySearch(arr, target , 0 , pivot-1);
        } else {
            result = binarySearch(arr, target , pivot+1 , arr.length-1);
        }
        return result;
    }

    static int binarySearch(int[] arr , int target , int s, int e){

        while(s<=e){
            int mid = s + (e-s)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(target > arr[mid]){
                s = mid +1;
            } else {
                e = mid -1;
            }
        }
        return -1;
    }

    static int rightSide(int[] arr , int target , int s , int e){

        while(s<=e){
            int mid = s + (e-s)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(target > arr[mid]){
                s = mid +1;
            } else {
                e = mid -1;
            }
        }
        return -1;
    }

    static int leftSide(int[] arr , int target , int s , int e){

        while(s<=e){
            int mid = s + (e-s)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(target > arr[mid]){
                s = mid +1;
            } else {
                e = mid -1;
            }
        }
        return -1;
    }
}
