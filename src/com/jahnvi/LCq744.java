package com.jahnvi;

public class LCq744 {
    public static void main(String[] args) {
        int[] letters = {'c' , 'k' , 'l'};
        char target = 'm';

    }
    static char nextGreatestLetter(char[] letters , char target){
        int s = 0;
        int e = letters.length - 1 ;

        while(s<=e){

            if(target > letters[e]){
                return letters[0];
            }
            int mid = s + (e-s)/2;

            // if(target==arr[mid]){
            //     return s;
            // }

            if(target>=letters[mid]){
                s=mid+1;
            } else {
                e=mid-1;
            }
        }
        // return letters[0];
        // idk why this was not considered
        return letters[s % letters.length];
    }
}

