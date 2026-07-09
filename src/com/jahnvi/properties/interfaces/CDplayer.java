package com.jahnvi.properties.interfaces;

public class CDplayer implements MediaPlayer {
    public void start(){
        System.out.println("Start playing songs");
    }
       public void stop(){
        System.out.println("Stop playing songs");
    }
}
