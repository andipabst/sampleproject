package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeprecatedClassTest {

    @Test
    public void shouldSayHello() {
        assertEquals("hello", DeprecatedClass.deprecatedMethod());
    }
}
