package com.example;

import java.util.Map;
import java.lang.String;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        DeprecatedClass.deprecatedMethod();
    }

    public void untestedMethod() {
        System.out.println("This is not tested");
    }

    public void emptyIf() {
        if (true) {

        }
        testMethod();
    }

    public String testMethod() {
        return "This is a string!";
    }
}
