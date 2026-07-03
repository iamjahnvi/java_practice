package com.access;

public class ObjectDemo {

    // these all are methods of Object class , which we are calling and implementing here
    int num;
    float gpa;

    public String toString(){
        return super.toString();
    }

    @SuppressWarnings("removal")
    public void finalize() throws Throwable{
        super.finalize();
    }

    public ObjectDemo(int num){
        this.num = num;
    }
    
    public ObjectDemo(int num , float gpa){
        this.num = num;
        this.gpa = gpa;
    }
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ObjectDemo other = (ObjectDemo) obj;
        return this.num == other.num;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo objD = new ObjectDemo(21);
        System.out.println(objD.hashCode());
        // 1514840818 - random int formed by some internal algorithmn

        // also we can change the value of hashCode by writing it's value as whatever we want, like return 0 , return num etc etc

        ObjectDemo obj1 = new ObjectDemo(12 , 9.8f);
        ObjectDemo obj2 = new ObjectDemo(12 , 8.9f);

        if(obj1==obj2){
            System.out.println("obj1 is equal to obj2");
        } 

        if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }

        // it didn't reply anything when normal .equalto(returns super.equals()) method was implemented, but when we , did the thing it display ans 

        System.out.println(obj1.getClass());
        // class com.access.ObjectDemo

        // data about class, will be stored in heap
        // return class name
        // for getting data 

        
        System.out.println(obj1.toString());
        // com.access.ObjectDemo@d706f19

        System.out.println(obj1.hashCode());
        // 2051853139


    }







}
