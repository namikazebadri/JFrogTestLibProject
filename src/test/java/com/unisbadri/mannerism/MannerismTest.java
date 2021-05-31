package com.unisbadri.mannerism;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MannerismTest {
    private final String name = "Unis Badri";
    private final Mannerism mannerism = new Mannerism(name);

    @Test
    void createManner() {
        assertEquals(String.format("Hi %s, how are you?", name), mannerism.create());
    }
}