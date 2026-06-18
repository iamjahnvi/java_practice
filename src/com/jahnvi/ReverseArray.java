package com.jahnvi;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2 , 3 , 4 , 5 ,6};
        int[] ans = reverseArray(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(end > start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start ++;
            end --;
        }
        return arr;
    }
}
