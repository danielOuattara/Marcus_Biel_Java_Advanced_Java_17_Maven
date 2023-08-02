package org.daniel._03_inheritance;

public class Lion extends Animal implements Loggable {
    public String message() {
        return "Hello animal";
    }

    public void eat() {
        System.out.println("Lion is eating.");
    }
}
