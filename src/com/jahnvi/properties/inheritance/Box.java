package com.jahnvi.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;
    double Weight;

    // constructor of Box class
    Box (){

        super();
        // this box class is not a derived class, stil when we wrote super, it didn't show error, why?

        // becuase this parent class is being derived from , or , it is child to Object() class.

        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    Box (double side){
        this.h = side;
        this.w = side;
        this.l = side;
    }

    // cuboid
    Box (double l , double w , double h){
        this.h = h;
        this.w = w;
        this.l = l;
    }


    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("running the box");
    }
}
// all the classes that we make are child to the Object() class.

