package com.jahnvi;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18 , 12 , -7 , 3 , 14 , 28};

        // question : to find for 3 in the range of index of [1,4]
        
        int target = 3;
        boolean ans = findTarget(arr , target);
        System.out.println(ans);

        // question to find index in the same range 
        int index = findIndex(arr, target);
        System.out.println("index : " + index);
    }
    static boolean findTarget(int[] arr , int target){
        for(int i = 1 ; i < 4 ; i++){
            if(arr[i] == target){ return true; }
        }
        return false;
    }
    static int findIndex(int[] arr , int target){
        for(int i = 1 ; i < 4 ; i++){
            if(arr[i] == target){ return i; }
        }
        return -1;
    }

}

