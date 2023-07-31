package org.daniel._01_checked_and_unchecked_execptions._01_checked_exception;

public enum CarState {
    DRIVING, WAITING, PARKING;

    public static CarState from(String state) throws Exception {
        switch (state) {
            case "DRIVING":
                return DRIVING;
            case "WAITING":
                return WAITING;
            case "PARKING":
                return PARKING;
            default:
                throw new Exception("Unknown state call");
        }
    }
}



