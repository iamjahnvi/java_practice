package com.jahnvi.staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once , when the first obj is being created i.e when the class is loaded for the first time.
    
    static {
        System.out.println("i am inside static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        StaticBlock obj2 = new StaticBlock();
        // even when we formed new obj2 of StaticBlock class, still , the static block was not called again due to which it didn;t print "i am inside static block again"
        System.out.println(StaticBlock.a + " " + StaticBlock.b);















    }
}