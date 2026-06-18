package com.jahnvi;
import java.util.Scanner;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] id = new int[5];
        // use the id array to avoid unused variable warning
        for (int i = 0; i < id.length; i++) {
            id[i] = i + 1;
        }

        System.out.println(Arrays.toString(id));
        // declaring of an array , id is being defined as the stack.

        int[] age = {21 , 12 , 24 , 25 , 34};
        // intialisation of an array.

        // use the id array to avoid unused variable warning
        for (int i = 0; i < age.length; i++) {
            age[i] = i*2;
        }
        System.out.println(Arrays.toString(age));
        // declaring of an array , age is being defined as the stack.

        // Dynamic Memory Allocation:-
        // int is datatype and rollno is a reference variable , whose initialisation occurs at compile-time.
        // new int[5] is the creation of an object in heap memory , whose initialisation happens at runtime. 
        // new , is a keyword that is used to create an array of size 5 in the heap memory.

        // also, very important point to be remembered is that , the object the arr will be referencing to , is stored in heap memory.
        // the data in heap memory is not continous in nature, due to which array which is stored in heap memory as object may also not be continous.
        // also the continuity depends on JVM .

        String[] str = new String[4];
        System.out.println(str[2]);

        int[] marks = new int[4];
        System.out.println(marks[3]);

        // the answer came out to be null and 0 respectively , why?
        // because the object in heap memory points to null and 0 , before the time of initialisation.


        // array input
        System.out.print("Enter digits of array : ");
        int[] arr = new int[5];
        for(int i = 0 ; i < arr.length ; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));

        // for each loop
        for(int num : arr){
            System.out.print(num);
        }
        // num is the reference variable pointing to each element in arr.

        // modifying an array
        int[] array = {2 , 4 , 5 , 6 , 9};
        changeArr(array);
        System.out.println(Arrays.toString(array));
        sc.close();
    }
    static void changeArr(int[] array){
        array[0] = 99;
    }
}
