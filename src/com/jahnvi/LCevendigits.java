package com.jahnvi;

public class LCevendigits {
    public static void main(String[] args) {
        int[] nums = {12 , 345 , 2 , 6 , 7896};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    // function to check if number contains even number of digits or not
    static boolean even(int num){
        int digits = numberOfDigits(num);

        // if(digits%2==0){
        //     return true;
        // }
        // return false;

        return digits % 2 == 0;
    }

    // function to find out the total no of digits in num
    static int numberOfDigits(int num){
        if(num < 0){
            num = num * -1;
        }

        
        // if(num == 0){
        //     return 1;
        // }
        // int countDigits = 0;
        // while(num > 0){
        //     int rem = num % 10;
        //     countDigits++;
        //     num/=10;
        // }

        int countDigits = (int)(Math.log10(num) + 1);

        return countDigits;
    }
}
