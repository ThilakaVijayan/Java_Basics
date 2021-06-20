package com.thilaka.mosh.java.fundamentals.part.one.e.classes;

public class J_Reducing_Coupling {
    public static void main(String[] args) {
        var browser = new I_Browser();
        browser.navigate("websiteName.com");//<html></html>
    }
}
