package com.jahnvi;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        for(int i = 1 ; i < 26 ; i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.charAt(0));
        System.out.println(builder.isEmpty());
        System.out.println(builder.delete(2 , 5));
        
    }
}
// the only difference between performance.java and StringBuilder.java is that in performance.java a new object is being created everytime due to which space complexity is N sqaure, but this time only new element is being added at it.


// StringBuilder is mutable also.

