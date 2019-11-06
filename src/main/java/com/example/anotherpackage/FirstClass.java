package com.example.anotherpackage;

public class FirstClass {

    String duplicatedMethod(int i) {
        if (i <= 0) {
            return "no weight";
        }
        if (i < 10) {
            return "light";
        }
        if (i < 20) {
            return "medium";
        }
        if (i < 30) {
            return "heavy";
        }
        return "very heavy";
    }
}
