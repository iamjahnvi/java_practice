package com.jahnvi;
import java.util.Scanner;
import java.util.Arrays;

public class multiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inputing a 2-D array - typical way :-
        // System.out.print("Enter the no. of rows : ");
        // int rows = sc.nextInt();
        // System.out.print("Enter the no. of cols : ");
        // int cols = sc.nextInt();
        // int[][] arr = new int[rows][cols];
        // for(int i = 0 ; i < rows ; i++){
        //     for(int j = 0 ; j < cols ; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        // inputing array :-

        int[][] arr = new int[3][3];
        System.out.print("Enter the elements of array : ");
        // arr.length - total no. of rows
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        // displaying array (1st way) :-
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // displaying array(2nd way) :-
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

        // displaying array (3rd way) :-
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(Arrays.toString(arr[i]));
            System.out.println();
        }
        sc.close();
    }
}
