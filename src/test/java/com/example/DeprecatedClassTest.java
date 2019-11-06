package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeprecatedClassTest {

    @Test
    public void shouldSayHello() {
        assertEquals("hello", DeprecatedClass.deprecatedMethod());
    }
    
    @Test
    public void shouldInstantiate() {
        assertNotEquals(new DeprecatedClass(), new DeprecatedClass());
    }
}
