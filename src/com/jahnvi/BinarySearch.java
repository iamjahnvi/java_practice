package com.jahnvi;

public class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr = { 2 , 4 , 6 , 9 , 11 , 12 , 14 , 20 , 36 , 48};
        
        // array is already sorted in ascending order.

        int target = 9;
        System.out.println(binarySearch(arr, target)); 


        int[] array = {48, 36, 20, 14, 12, 11, 9, 6, 4, 2};

        // array is already sorted in descending order

        System.out.println(searchBinary(array, target));

    }

    // code for searching target element in ascendingly sorted array.

    static int binarySearch(int[] arr , int target){

        int s = 0;
        int e = arr.length - 1;

        // mid != (s+e)/2 in java, because that might exceeds the range of integer in java.

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

    static int searchBinary(int[] array, int target){
        int s = 0;
        int e = array.length-1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(array[mid]==target){
                return mid;
            }
            if(array[mid]<target){
                e = mid-1;
            } else{
                s = mid+1;
            }
        }
        return -1;
    }
}
    



















