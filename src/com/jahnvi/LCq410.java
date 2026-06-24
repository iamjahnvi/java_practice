package com.jahnvi;

public class LCq410 {
    public static void main(String[] args) {

        // split array largest sum
        // asked in google

    }

    static int splitArray(int[] arr , int m){
        // m = no. of subarrays
        int s = 0;
        int e = 0;

        for(int i = 0; i < arr.length ; i++){
            s = Math.max(s,arr[i]);
            e+=arr[i];
        }
        // binary search

        while ( s < e){
            // try for the middle as potential ans

            int mid = s + (e-s)/2;

            // calculate how many pieces you can divide this into whith max sum

            int sum = 0;
            int pieces = 1;

            for(int num : arr){
                if(sum + num > mid){
                    // u cannot add this in subarray , make new one
                    // say you add this num in new subarray , then sum = num

                    sum = num;
                    pieces ++;
                } else {
                    sum+=num;
                }
            }

            if(pieces>m){
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
        // start will be equal to end.
    }
}
