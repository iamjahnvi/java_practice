package com.jahnvi;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(24);
        list.add(25);
        list.add(26);

        System.out.println(list);

        list.set(0 , 99);
        // 99 at 0th index 
        System.out.println(list);
        
        System.out.println(list.contains(90));
        // checks if list contain 90

        System.out.println(list.get(3));
        // gets item at index-3

        System.out.println(list.isEmpty());
        // checks if arraylist is empty

        System.out.println(list.indexOf(24));
        // displays index of 24

        // internal working of an ArrayList
        // the arraylist actually has some sort of fixed size in stack memory , which extends when the input of elements inside arraylist goes beyond the size.

        sc.close();
    }
}
