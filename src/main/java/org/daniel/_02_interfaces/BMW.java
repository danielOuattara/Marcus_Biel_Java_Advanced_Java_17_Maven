package org.daniel._02_interfaces;

public class BMW implements Car, Loggable, Asset, Property {
    public void drive() {
        System.out.println("BMW driving...");
    }

    public int value() {
        return 80_000;
    }

    public String owner() {
        return "Marcus Biel";
    }

    public String message() {
        return "Marcus Biel is the owner";
    }
}
