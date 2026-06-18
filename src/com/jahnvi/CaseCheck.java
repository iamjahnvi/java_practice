package com.jahnvi;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter char : ");
       char ch = sc.next().charAt(0);

       if(ch < 'z' && ch > 'a'){
        System.out.println("smallcase");
       }

       if(ch < 'Z' && ch > 'A'){
        System.out.println("uppercase");
       }

       // it doesn't return any error when input is of other data type than char.
       sc.close();
    }
}
