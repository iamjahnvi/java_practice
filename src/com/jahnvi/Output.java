package com.jahnvi;

public class Output {
    public static void main(String[] args) {

        System.out.println(56);

        // out is a ref var of type printstream with a method in it, called as println. 

        // this println will pass it to valuof function which will further pass it to toString function


        String name = "null";
        System.out.println(name);

        System.out.println(new int[]{2 , 3 , 4 , 5});

        // this println puts the object into a .valurof function which furthur pushes it into tostring converting it into some random value , and even before passing the valueof object to toString it checks if the string is null (if string is null , it leads to very popular exception which is null pointer exception)

        // but becuase we don't want java to print random values  we will pass it into Arrays.toString method 

        Integer num = Integer.valueOf(56);

        // this was 
        
        System.out.println(num.toString());
        System.out.println(num);

        // Integer is a wrapper class , by using which we make an object of integer , so that we can apply different methods in it.

        









    }
}
