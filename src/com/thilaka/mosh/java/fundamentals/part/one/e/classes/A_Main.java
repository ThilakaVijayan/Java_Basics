package com.thilaka.mosh.java.fundamentals.part.one.e.classes;

public class A_Main  {
    public static void main(String[] args) {
        var textBox1 = new B_TextBox();
        System.out.println(textBox1.text);//null
        //System.out.println(textBox1.text.toUpperCase());//NullPointerException
        textBox1.setText("Box1");
        System.out.println(textBox1.text);//Box1

        var textBox2 = new B_TextBox();
        textBox2.setText("Box2");
        System.out.println(textBox2.text);//Box2

    }
}
