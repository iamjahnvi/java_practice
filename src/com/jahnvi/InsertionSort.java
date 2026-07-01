package com.jahnvi;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2 , 3 , 4 , 1 };
        System.out.println(Arrays.toString(arr));
        
    }

    static void insertion(int[] arr){
        for(int i = 0 ; i <= arr.length - 2 ; i++){
            for(int j = i + 1 ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr , j , j-1 );
                } else { break ;}
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    















}

// complexity in worst case : big o of N square
// worst caes - descending sorted
// best case is when array already sorted 
// compplexity big o of N

// WHY USE insertion sort
// steps gets reduced , loop breaks , so less comparision , 
// stable
// used for smaller values of N
// works good when array is partially sorted , it is the reason it takes part in hybrid sorting algorithmn - means we use insertion sort with merge/quick sort



