package com.jahnvi;

public class LCq852 {
    public static void main(String[] args) {

        // question 852 : peak index in a mountain array / bytonic array

        int[] arr = {1 , 2 , 3 , 5 , 6 , 4 , 3 ,2};
        System.out.println(peakIndexInMountainArray(arr));
        
    }
    static int peakIndexInMountainArray(int[] arr ){

        int s = 0;
        int e = arr.length - 1;


        // mid != (s+e)/2 in java, because that might exceeds the range of integer in java.

        while(s==e){

            int mid = s + (e-s)/2;

            if(arr[mid] > arr[mid+1]){
                // if arr[mid] > arr[mid+1] , it means we are in the descending part of array and there might be a chance of even a greater element to be on on the left hand side of the array, and as we are unsure if truly some greater num is there, we take end as mid;
                e = mid;
            } else {
                // if arr[mid] < arr[mid+1] , it means we are ascending part of array and surely a greater number than the arr[mid] exists.
                s = mid + 1 ;
            }
        }
        // here , we can also write retun arr[e] , as at the end both become same.
        return s;
    }
}
