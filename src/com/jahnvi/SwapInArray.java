package com.jahnvi;
import java.util.Scanner;
import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args) {

        int[] array = {2 , 4 , 5 , 6 , 7};
        int[] ans = swapVal(array);
        System.out.print(Arrays.toString(ans));

    }
    static int[] swapVal(int[] array){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first index : ");
        int i = in.nextInt();
        System.out.print("Enter second index : ");
        int j = in.nextInt();
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        in.close();
        return array;
    }
}
