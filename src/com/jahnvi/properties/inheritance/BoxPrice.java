package com.jahnvi.properties.inheritance;

public class BoxPrice extends BoxWeight{
    
    double price;

    BoxPrice(){
        this.price = 0.0;
    }

    BoxPrice(double price){
        this.price = price;
    }

    BoxPrice(double weight , double price){
        super(weight);
        this.price = price;
    }

    BoxPrice(double l , double w , double h , double weight , double price){
        super(weight , l , w , h);
        this.price = price;
    }

    BoxPrice(BoxPrice other2){
        super(other2);
        price = other2.price;
    }
    // this thing is exactly same as saying that the ref var is of child class BoxPrice , but the object is of it's parent class , Boxweight.

    BoxWeight other2 = new BoxPrice(2.3 , 4.5 , 7.8 ,6 , 4);

    

}
