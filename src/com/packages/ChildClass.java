package com.packages;

import com.access.A;

public class ChildClass extends A{

    public ChildClass(float marks) {
        super(marks);
        //TODO Auto-generated constructor stub
    }

    public ChildClass(int num , String name){
        super(num , name);
    }

    public static void main(String[] args) {
        A obj = new A(32.21f);
        // System.out.println(obj.marks);
        // you see we cannot access marks,which is a mem of protected access modifier.
        // if it we could access mem of protected access mdifier anywhere, why would we create it at the first place then.
        // conclusion : we cannot access mem of protected class by making an obj of parent class , in subClass of another package.

        // but but but

        ChildClass cc = new ChildClass(32.21f);
        System.out.println(cc.marks);

        // now i can simply marks 
        // so point to be noted is that , we cannot access mem of protected class , anywhere in the subclass of parent class in another package by simple making an obj of it using parent class
        

    }
    
}
