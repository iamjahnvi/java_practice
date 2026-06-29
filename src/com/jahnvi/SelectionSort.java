package com.jahnvi;

public class SelectionSort {
    public static void main(String[] args) {
        
    }

    static void selection(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            // find the max item in array and swap it with correct one
            int last = arr.length - i - 1;
            int max = findMax(arr, 0, last);
            if(max != last){
                int temp = arr[max];
                arr[max] = arr[last];
                arr[last] = temp;
            }
        }
    }
    static int findMax(int[] arr , int start , int last){
        int max = start;
        for(int i = start + 1 ; i <= last ; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    











}
// best case and worst complexity - big O of N sqaure
// performs well in small values in array
// unstable sorting algo
