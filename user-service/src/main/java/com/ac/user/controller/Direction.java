package com.ac.user.controller;

public enum Direction {
    FRONT("front"), BEHIND("behind"), LEFT("left"), RIGHT("right");

    private String name;

    Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
