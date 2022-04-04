package com.soft.generic;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("向栈中增加字符串：");
        System.out.println("视频学Java");
        System.out.println("细说Java");
        System.out.println("Java");
        stack.push("视频学");
        stack.push("细说");
        stack.push("Java从");
        System.out.println("从栈中取出字符串：");
        while (!stack.empty()) {
            System.out.println((String) stack.pop());
        }
    }
}
