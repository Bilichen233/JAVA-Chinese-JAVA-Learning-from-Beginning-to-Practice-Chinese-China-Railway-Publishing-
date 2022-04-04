package com.soft.generic;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println("向栈中增加字符串：");
        System.out.println("视频学");
        System.out.println("细说");
        System.out.println("Java从入");
        stack.push("视频学");  //向栈中增加字符串
        stack.push("细说");   //向栈中增加字符串
        stack.push("Java从入"); //向栈中增加字符串
        System.out.println("从栈中取出字符串：");
        while (!stack.empty()) {
            System.out.println((String) stack.pop());//删除栈中全部元素并进行输出
        }
    }
}

