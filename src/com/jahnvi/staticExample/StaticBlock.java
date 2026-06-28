package com.jahnvi.staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("i am inside static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}