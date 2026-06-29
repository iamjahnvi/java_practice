package com.jahnvi;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4 , 5 , 2  , 3 , 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){

        boolean swap;
        // this boolean value stands for asking us , kya abhi tak koi swap hua hai?

        // run the steps n-1 times
        for(int i = 0 ; i < arr.length ; i++){
            // for each step, the max item will come at the last respective index.

            swap = false;
            // here , we are saying that, abhi tk koi swap nhi hua.

            for(int j = 1 ; j < arr.length-i ; j++){
                // whatever i is , that much elements from back side of array must be sorted.

                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swap=true;

                    // this means, ab ek baaar atleast swap ho chuka hai
                }
            }
            if(swap==false){ // false

                // if abhi tk bhi koi swap nhi hua then break.

                // instaed of swap == false , we can write !false , which meanss if true move forward

                break;
            }
        }
    }

    // best case complexity - big O of N
    // worst case complexity - big O of N sqaure

    // Time complexity - big O of N

    // we also talked here abt stabilty and unstabilty of a sorting algorithmn
    // if the algo is able to maintain the order of the elememnts , even when the values are same , then it is stable sorting algorithmn, otherwise it is not.


}

