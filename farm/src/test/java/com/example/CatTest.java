package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CatTest {
    
    @Test
    void testTalk(){
        Cat cat = new Cat("Bigode");
        String actual = cat.talk();
        assertEquals("Meow!", actual);
    }
}
