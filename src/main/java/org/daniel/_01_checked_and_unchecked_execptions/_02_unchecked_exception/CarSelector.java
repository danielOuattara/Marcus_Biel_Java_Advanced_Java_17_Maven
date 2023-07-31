package org.daniel._01_checked_and_unchecked_execptions._02_unchecked_exception;

public class CarSelector {
    public static void main(String[] args) {
        CarService carService = new CarService();
        for (String singleArgument : args) {
            new CarService().process(singleArgument);
        }
    }
}
