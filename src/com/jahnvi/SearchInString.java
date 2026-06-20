package com.jahnvi;
import java.util.*;

public class SearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String name = sc.nextLine();

        System.out.print("Enter char to be found : ");
        char target = sc.next().trim().charAt(0);

        // question : return true or false if char is in string.
        boolean ans = findChar(name,target);
        System.out.println(ans);

        // question : return the index of char
        int index = findIndex(name,target);
        System.out.println("index : " + index);

       sc.close() ;
    }
    static boolean findChar(String name , char target){
        for(int i = 0 ; i < name.length() ; i++){
            if(name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
    static int findIndex(String name, char target){
        for(int i = 0 ; i < name.length() ; i++){
            if(name.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
}
