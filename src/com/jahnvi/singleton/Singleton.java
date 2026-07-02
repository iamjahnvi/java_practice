package com.jahnvi.singleton;

public class Singleton {

    // the constructor of Singleton class is made private due to which it can be used only within this class.
    private Singleton(){

    }

    // singleton means only one single obj of singleton class has to be created , if that has not been created then we can do so as we can see in getInstance() 

    private static Singleton instance;

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();

            // checks if an object is being created or not, if not (null) , create an object by calling the constructor itself

        }
        return instance;
    }


}
