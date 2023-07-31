package org.daniel._01_checked_and_unchecked_execptions._04_handle_exception_validation;


public class CarSelector {
    public static void main(String[] args) {
        CarService carService = new CarService();
        for (String singleArgument : args) {
            if (isValid(singleArgument)) {
                carService.process(singleArgument);
            } else {
                System.err.println("Ignoring invalid argument " + singleArgument);
            }
        }
    }

    private static boolean isValid(String singleArgument) {
        try {
            CarState.valueOf(singleArgument);
            System.out.println("Valid argument " + singleArgument);
        } catch (IllegalArgumentException err) {
            System.out.println("Something went wrong : " + err.getMessage());
            return false;
        } finally {
            System.out.println("Done !");
        }
        return true;
    }
}
