package com.unisbadri.mannerism;

public class Mannerism {
    private final String name;

    public Mannerism(String name) {
        this.name = name;
    }

    public String create() {
        return String.format("Hi %s, how are you?", name);
    }
}
