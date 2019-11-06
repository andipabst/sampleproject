package com.example.anotherpackage;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AnotherClass implements SomeInterface{

    void veryImportantMethod() {
        Map<String, Integer> interestingMap = new HashMap<>();
        Set<String> set = new HashSet<>();
        LocalDateTime time = LocalDateTime.now();

        interestingMap.put("1", 1);
    }

    @Override
    public void doNothing() {
        //nothing to see here
    }
}
