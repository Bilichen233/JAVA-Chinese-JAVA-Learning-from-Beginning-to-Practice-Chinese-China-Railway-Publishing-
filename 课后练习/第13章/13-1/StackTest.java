package com.soft.generic;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("��ջ�������ַ�����");
        System.out.println("��ƵѧJava");
        System.out.println("ϸ˵Java");
        System.out.println("Java");
        stack.push("��Ƶѧ");
        stack.push("ϸ˵");
        stack.push("Java��");
        System.out.println("��ջ��ȡ���ַ�����");
        while (!stack.empty()) {
            System.out.println((String) stack.pop());
        }
    }
}
