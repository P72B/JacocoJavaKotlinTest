package org.example;

public class Human {
    private String name = null;
    private int count = 0;

    public Human(String name) {
        this.name = name;
    }

    public String greet() {
        return "My name is: " + this.name;
    }

    public int add(int value) {
        count = count + value;
        return count;
    }

}
