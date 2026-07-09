package com.jahnvi.properties.interfaces;

public class Car implements Engine , Brake{
    public void start(){
        System.out.println("start the car");
    }
    public void stop(){
        System.out.println("stop the car");
    }
    public void accelerate(){
        System.out.println("accelerate the car");
    }
    public void brake(){
        System.out.println("Put brake on car");
    }
    // public void start(){
    //     System.out.println("Put brake on car");
    // }

    // the problem here is that, both engine and MediaPlayr have got same methods of start and stop , and we can only define one of them , otherwise it'll show error.
    // so what we'll do now is, we will make another class named as CDplayer where we'll define these methods
}
