package com.jahnvi;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = "Kunal";
        String boy = "Kunal";

        // if we want to figure out if both name and boy are pointing to the same object in the heap memory , we's do this:

        if(name == boy){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // the above ans came out to be true, which means both of them are pointing to the same object in heap memory.

        if(name.equals(boy)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        // it also gave ans as yes, but the fact is it doesn;t check internally if they are pointing to the same object.
        // only checks values but not reference.


        System.out.print("Enter a fruit : ");
        String fruit = in.nextLine();

        // switch(fruit){
        //    case "mango" :
        //     System.out.println("king of fruits");
        //     break;
        //    case "apple" :
        //     System.out.println("red coloured fruit");
        //     break;
        //    case "grapes" :
        //     System.out.println("small fruit");
        //     break;
        //    default :
        //     System.out.println("Enter some other fruit name");
        // }

        // Customised switch case
        switch(fruit){
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("red coloured fruit");
            case "grapes" -> System.out.println("small sized fruit");
            default -> System.out.println("Enter some other fruit");
        }

        // another form of switch case
        System.out.print("Enter a digit from 1 to 7 : ");
        int day = in.nextInt();

        switch(day){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
        }

        // customised switch case
        switch(day){
            case 1,2,3,4,5 -> System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
        }


        // nested switch case :-
        System.out.print("Enter employee id : ");
        int id = in.nextInt();
        System.out.print("Enter age : ");
        int age = in.nextInt();

        switch(id){
            case 1:
                switch(age){
                    case 23 :
                        System.out.println("23 years old");
                        break;
                }
            break;
            case 2:
                switch(age){
                    case 25 :
                        System.out.println(" name : kunal \n 25 years old");
                        break;
                }
            break;
            case 3:
                switch(age){
                    case 27 :
                        System.out.println("name : keshavi \n 27 years old");
                        break;
                }
            break;
            case 4:
                switch(age){
                    case 30 :
                        System.out.println("name : priyanaka \n 30 years old");
                        break;
                }
            break;
            default :
               System.out.println("enter valid age and employee id ");
        }
        in.close();
    }
}
