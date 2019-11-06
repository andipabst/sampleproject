package com.example.anotherpackage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstClassTest {
    
    @Test
    public void shouldWorkAsIntended() {
        FirstClass firstClass = new FirstClass();
        assertEquals(firstClass.duplicatedMethod(10), "medium");
        assertEquals(firstClass.duplicatedMethod(-5), "no weight");
    }
}
