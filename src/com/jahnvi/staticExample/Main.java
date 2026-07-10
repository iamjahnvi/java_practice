package com.jahnvi.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(23,"kunal" ,false ,"male" , 100000);
        
        Human rahul = new Human(28 , "rahul" , true , "male" , 200000);

        System.out.println(kunal.name);
        System.out.println(kunal.population);
        System.out.println(rahul.population);

        // static var like population doesn;t depend on obj , and they are same for every obj.
        // the best way to access to it is:-

        System.out.println(Human.population);
        System.out.println(Human.population);


        // population for both humans is 1,which means it really doesn't depend on the object, it is static.
    }

    public void greeting() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'greeting'");
    }

    public void fun2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fun2'");
    }
}

// when a member is declared static , it can be accessed before any of the obj of the class is being created and before referencing to it.

// static var aren't dependent on objects

//*why is main declared as static => 
// so that we can access it without creating an object of it , becuase if it won't be static then in order to run it only we have to create an object of it.*/

