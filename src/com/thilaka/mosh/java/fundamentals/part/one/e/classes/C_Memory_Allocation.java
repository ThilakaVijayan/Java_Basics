package com.thilaka.mosh.java.fundamentals.part.one.e.classes;

public class C_Memory_Allocation {
    public static void main(String[] args) {
        var textBox1 = new B_TextBox();
        var textBox2 = textBox1;
        textBox2.setText("Hello World");
        System.out.println(textBox1.text);//Hello World
    }
}
