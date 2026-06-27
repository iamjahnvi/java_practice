package com.jahnvi;

public class Patterns {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(5);
        pattern3(6);
        pattern4(4);
        pattern5(5);
        pattern6(5);
    }
    static void pattern1(int n1){
        // pattern1 - left sided pyramid
        for(int row = 1 ; row <= n1  ; row++){
            for(int col = 1 ; col <= row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n2){
        // pattern2 - square
        for(int row = 1 ; row <= n2 ; row++){
            for(int col = 1 ; col <= n2 ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n3){
        // pattern3 - 0-1 pyramid
        for(int row = 1 ; row <= n3 ; row++){
            for(int col = 1 ; col <= row ; col++){
                if((row+col)%2==0){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    static void pattern4(int n4){
        for(int row=1 ; row <= n4 ; row++){
            for(int col = 1; col <= row ; col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

   
    static void pattern5(int n5){
        // pattern5 - reverse pyramid
        for(int row = n5 ; row >= 1 ; row--){
            for(int col = 1 ; col <= row ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n6){
        // pattern6 - 1-12-123-1234-12345 pyramid
        for(int row=1 ; row <= n6 ; row++){
            for(int col = 1; col <= row ; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n7){
        
    }



    












}
