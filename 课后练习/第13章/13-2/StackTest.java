package com.soft.generic;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println("��ջ�������ַ�����");
        System.out.println("��Ƶѧ");
        System.out.println("ϸ˵");
        System.out.println("Java����");
        stack.push("��Ƶѧ");  //��ջ�������ַ���
        stack.push("ϸ˵");   //��ջ�������ַ���
        stack.push("Java����"); //��ջ�������ַ���
        System.out.println("��ջ��ȡ���ַ�����");
        while (!stack.empty()) {
            System.out.println((String) stack.pop());//ɾ��ջ��ȫ��Ԫ�ز��������
        }
    }
}

