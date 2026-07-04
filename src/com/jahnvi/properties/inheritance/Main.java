package com.jahnvi.properties.inheritance;


public class Main {
    public static void main(String[] args) {

        Box box1  = new Box();
        // box1 is a ref var of parent class Box , which creates a new object by using the default constructor

        System.out.println(box1.l + " " + box1.w + " " + box1.h);
        box1.getC();
        // even tho the colour of box is private , we still can acess it via the getter method inside encapsulation internally.
        
        // it will run the default constructor with no arguments.

        Box box2 = new Box(4);
        // box2 is a ref var of class Box , whose object will be made by passing argument in the constructor with 1 instance variable in it

        System.out.println(box2.l + " " + box2.w + " " + box2.h);

        Box box3 = new Box(3.2 , 4.5 , 6.7);
        System.out.println(box3.l + " " + box3.w + " " + box3.h);


        Box box4 = new Box(box1);
        // an constructor containing another constructor.


        BoxWeight bw = new BoxWeight(23.34);
        System.out.println(bw.weight + " " + bw.l+ "" + bw.w + bw.h);

        // 23.34 -1.0-1.0-1.0

        // also , it is important to note that any instance of box class which is declared as private cannot be accessed anywhere outside the class , itself.


        Box object = new BoxWeight(4.5 , 3.2 , 3.4 , 6.7);

        // System.out.println(object.weight);

        System.out.println(object.l);
        System.out.println(object.w);
        System.out.println(object.h);

        // we can access the length, width, and height of object but not the weight.
        // because , it is the type of the ref var(object) , that decides which properties can be accessed and not the type of the object.

        // Boweight object2 = new Box(3.4 , 8.9 , 9.0  , 7.8);

        // here we can see , that it is showing becuase the constructor named as Box cannot access the properties of it's child class, BoxWeight




        // BoxWeight obj3 = new Box(4.5 , 6.7 , 5.6);

        // it is still showing error , why because we are trying to referencing a child class to an obj of parent class.

        // more explaination:-
        // there are many variables in both parent and child class.
        // and you are given access to variables of the class , that are in the ref type i.e , BowWeight
        // hence , you should have access to weight variable
        // this also means , that the ones you are trying to accesss should be initialised.
        // but here, when the object itself is of type parent class , how will you call the constructor.
        // the constructor of parent class is unknown to the properties of it's child class , and it's variables , like weight.
    

        BoxWeight other2 = new BoxPrice(2.3 , 4.5 , 7.8 ,6 , 4);

        System.out.println(other2.l);
        System.out.println(other2.w);
        System.out.println(other2.h);
        System.out.println(other2.weight);

        
        // System.out.println(other2.price);
        // price is now accessible because other2 is a BoxPrice reference
        // so tho we can initialise price , we cannot actually print it , or access it.


        Box other3 = new BoxPrice(2 , 3 , 4  , 5 , 6);

        System.out.println(other3.l);
        System.out.println(other3.w);
        System.out.println(other3.h);


        // System.out.println(other3.weight);
        // System.out.println(other2.price);

        // these two are again showing error as we cannot access properties of the child classes of the parent class-Box , because even tho the ref var is of type Box, the obj is of child class BoxPrice.

        

        // BoxPrice other4 = new Box(2 , 3 , 4 );

        // this time tho we have access to all the varaibles of BoxPrice class , but we cannot really initialise them , becuase the constructor of parent class doesn;t know if these variables even exist.


        Box.greeting();
        // we surely can call static methods but can we override thme?

        Box box = new BoxWeight();
        Box.greeting();
        // printing "Hey i am in box class , greetings"
        // static methods are not dependent on objects , hence this is the reason , that it is able to access and call only the method in parent class only.
        // tho they can be inherited , they can't be overriden.

        // all in one, overriden depends on objects , and static methods are not dependent on objects , hence static methods cannot be overriden

       




    }
}
