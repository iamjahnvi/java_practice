package com.jahnvi;

public class ceiling {
    public static void main(String[] args) {
        int [] arr = { 2 , 3  , 5 , 9 , 14 , 16 , 18};
        int target = 15;

        // question : to find ceiling of a number:-
        // point to be remembered is that , whenever sorted array shows up , we have to try binary search in it.

        System.out.println(Ceiling(arr, target));
    }
    static int Ceiling(int[] arr , int target){
        int s = 0;
        int e = arr.length - 1 ;

        while(s<=e){
            if(target > arr[e]){
                return -1;
            }
            int mid = s + (e-s)/2;

            if(target==arr[mid]){
                return arr[mid];
            }
            if(target>arr[mid]){
                s=mid+1;
            } else {
                e=mid-1;
            }
        }
        return s;
    }
}