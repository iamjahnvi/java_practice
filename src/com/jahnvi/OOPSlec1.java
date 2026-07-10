package com.jahnvi;

public class OOPSlec1 {
    public static void main(String[] args) {
        // a class is a named group of properties and functions.

        // class is the logical construct and object is physical reality
        // class is an template of an object.
        // object is an instance of a class.

        // object has three essential properties :-

        // state of an object 
        // identity of an object
        // behaviour of an object


        Student student1;
        student1 = new Student();

        // dynamically allocates memory(allocates memory at runtime) and returns a ref to it , which is stored in student1 variable.

        // student1 is a ref variable pointing to an object , in the heap memory , consisting of roll no, name and marks.

        Student student2 = new Student();

        // here :-
        // Student is a class
        // student2 is a reference variable
        // new is a keyword
        // Student() is a constructor.

        System.out.println(student2.rno);
        // if it is not initialised then it'd be 0

        System.out.println(student2.name);
        // if it is not initialised then it'd be null

        System.out.println(student2.marks);
        // 0.0

        // here student2 is a ref var , of class Student which is being instansiated.

        student2.rno = 13;
        student2.name = "kunal";
        student2.marks = 88.5f;

        // System.out.println(student2.rno);
        // System.out.println(student2.name);
        // System.out.println(student2.marks);

        // even when marks were given a value of 90 in the class it still printed 88.5

        // also the most important thing to be reminded is that , even when the details of student2 are given here , but still, it will print values written inside the constructor.

        // constructor is special function, that runs when u create an object and it allocates some varibales.

        student2.greeting();

        student2.changeName("pikachu");
        student2.greeting();


        Student student3 = new Student();
        // will call the constructor with no arguments at all.

        System.out.println(student3.name);

        Student one = new Student();
        Student two = one;

        one.name = "something something";
        System.out.println(two.name);

        // both of them are pointing towards the same object
    }


    // by creating a class , student , we are creating a logical construct for an object, a template for it

    static class Student{
        int rno;
        String name;
        float marks = 90;

        // this is a constructor with the following properties

        Student(){
            this.rno = 13;
            this.name = "arjun";
            this.marks = 84.4f;
        }

        Student(int rno, String name, float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

        void greeting(){
            System.out.println("hello, my name is " + this.name);
        }

        void changeName(String newName){
            name = newName;
        }

        Student (Student other){
            // within student class , we have passed a class , of name Student , of object other.

            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }
    }
    // variables inside the object like rno, name and marks in this case are known as instant variable.
    // . is called a separator or dot operator

}
