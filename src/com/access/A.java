package com.access;

public class A {
    private int num;
    public String name;
    // can be accessed anywhere

    int[] arr;
    // default access modifier , in a diff package(see package.Main.java) we can't really access it but in the same package , yes

    protected float marks;

    public A(int num , String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }

    public A(float marks){
        this.marks = marks;
    }
    
}
