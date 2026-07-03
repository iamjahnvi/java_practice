package com.access;


public class subClass extends A{
    
    public subClass(int num , String name){
        super(num , name);
    }

    public subClass(float marks){
        super(marks);
    }
    public static void main(String[] args) {
        subClass obj = new subClass(45,"kunal");
        int n = obj.getNum();

        System.out.println(obj instanceof A);
        // this obj is a object of subclass of A, and subclass extends A, so obj will be instance of A
        // true

        System.out.println(obj instanceof subClass); 
        // true
        
        System.out.println(obj instanceof Object);
        // true
        


    }
}

