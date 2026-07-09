package com.jahnvi.properties.interfaces;

import javax.print.attribute.standard.Media;

public class Main {
    public static void main(String[] args) {
        Car swift = new Car();
        // we made a ref var named as swift of class Car, and an object of the same, and becuase it was implements , Engine, Brake , MediaPlayer, it can implement all the methods written inside them as well.
        swift.start();
        swift.stop();
        swift.brake();
        swift.accelerate();

        Engine nano = new Car();
        nano.start();
        nano.stop();

        // nano.acc();
        // this acc method showed error, why ?
        // becuase the ref var is of type Engine, and we can only access and call methods, that are defined in it.

        MediaPlayer ferrari = new CDplayer();
        ferrari.start();
        ferrari.stop();

    }
}
