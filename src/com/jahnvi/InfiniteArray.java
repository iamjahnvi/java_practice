package com.jahnvi;

public class InfiniteArray {
    public static void main(String[] args){
        int[] arr = {2, 3  , 6 ,7 , 8 , 9 , 11 , 16 , 20 ,36 };
        int target = 8;

        System.out.println(ans(arr, target));
        
    }
    static int ans(int[] arr , int target){
        // as this is an infinite array , we will study about it in chunks.
        // hence we'll find the range of a chunk
        // for that , we first consider a chunk of size 2, and then we keep doubling it, because then it would take only log(N) steps, where N is inifnity, to find the index of target.

        int s = 0;
        

        // int end = arr.length-1;
        // this step for finding end , would be wrong, becuase in infinite array, we don;t know arr.length, due to the reason we move in chunks.

        int e = 1;

        // initially the size of array = 2;
        
        // condition for target to lie in range
        while(target > arr[e]){
            int newStart = e + 1;

            // the newEnd will be e + length of box/chunk*2
            int newEnd = e + (e-s+1)*2;
            s = newStart;
        }
        return binarySearch(arr, target, s, e);
    }

    static int binarySearch(int[] arr , int target , int s , int e){

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
}