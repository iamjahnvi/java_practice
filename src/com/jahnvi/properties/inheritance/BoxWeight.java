package com.jahnvi.properties.inheritance;

public class BoxWeight extends Box{
    double weight;
    // weight is new instance variable inside child class BoxWeight

    BoxWeight(){
        // default constructor in the child class BoxWeight
        this.weight = -1;
    }

    static void  greeting(){
        System.out.println("Hey i am in boxweight class , greetings");
    }


    BoxWeight(double weight){
        this.weight = weight;
    }

    BoxWeight(double weight , double l , double w , double h){
        super(l, w , h);
        // super is the keyword that we use to call the instance variables from parent class Box

        // if there is weight also defined in the parent class , then we can access it here thru "super" keyword

        System.out.println(super.Weight);

        // it will print the value of weight from the constructor of parent class in which weight is defined

        this.weight = weight;

        // also it is important to realise that , as child class is dependent on the parent class , we need to initialize parent class first.
        // that is why writing  super(l, w , h); after 
        // this.weight = weight; will give error.
    }

    BoxWeight(double weight , double side){
        super(side);
        this.weight = weight;
    }

    // we are going to make a constructor of class BoxWeight and will call another constructor inside it

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    // now that here the other that we are passing in the super is a boxweight type , taking a box type.

    // it is exactly same as saying that the ref var "other" , is of type BoxWeight and the object is of type Box.

    










}
