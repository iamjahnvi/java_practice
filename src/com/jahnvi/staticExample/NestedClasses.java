package com.jahnvi.staticExample;

public class NestedClasses {
    static class Test{
        String name;

        // formation of a constructor.
        public Test(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return name;
        }
        // this is written so that when system.out calls the println method, it checks for the toString method inside test and hence we could display it
        
    }

    public static void main(String[] args) {

        // Test a = new Test("kunal");
        // Test b = new Test("kushwaha");

        // this was showing an error until , static keyword is being written before the class Test, why?

        // becuase the class named as Test was not static and was dependent on NestedClasses, the class outside it.
        // also, being a non static class , it requires an object for it;s functioning.
        // when an object was being inside main, the main class asked test if it requires naything to run , to which test replies that yes it requires an instance of the nestedclass to run.


        Test a = new Test("kunal");
        Test b = new Test("kushwaha");

        // this time it run, without showing error because now, it is idependent of it's outerclass.

        System.out.println(a.name);
        System.out.println(b.name);

        // if we print a only like this:-

        System.out.println(a);
        
        // it will print some random value including the class name + @ + random hash value and stuff (without the overridden part)

        // and lemme explain how that works internally
        // system has got a ref var out which will call this method println , which will pass whatever is there inside it, to valueOf func that will pass it to toString , toString will check if func Test , itself has got some toString method, if not , it will written the way it is coded inside it.



    }











}
