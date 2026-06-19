package com.jahnvi;
import java.util.Arrays;

public class LCq34 {
    public static void main(String[] args) {

        int[] nums = {1,1,2,2,2,3,3,3,4,4,4,4,5} ;
        int target = 4;

        System.out.println(Arrays.toString(Position(nums, target)));
    }

    static int[] Position(int[] nums , int target){
        int s = 0;
        int e = nums.length-1;

        while(s<=e){

            int mid = s + (e-s)/2;

            if(nums[mid]<target){
                s = mid + 1;
            } else {
                e = mid - 1;
            }

            if(nums[mid]==target){
                int i = mid;
                int j = mid;
                while(i > 0 && nums[i-1] == target){
                    i--; 
                }
                while(j < nums.length - 1 && nums[j+1] == target){
                    j++;
                }
                return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}

