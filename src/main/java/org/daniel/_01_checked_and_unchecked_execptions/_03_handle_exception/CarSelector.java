package org.daniel._01_checked_and_unchecked_execptions._03_handle_exception;

public class CarSelector {
    public static void main(String[] args) {
        CarService carService = new CarService();
        for (String singleArgument : args) {
            try {
                carService.process(singleArgument);
            } catch (RuntimeException err) {
                System.out.println(err);
                // err.printStackTrace();
                System.err.println(err.getMessage());
            }
        }
    }
}
