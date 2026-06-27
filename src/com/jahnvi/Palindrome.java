package com.jahnvi;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdba";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        // because comparing a and A would create problems.

        int s = 0;
        int e = str.length()-1;

        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
