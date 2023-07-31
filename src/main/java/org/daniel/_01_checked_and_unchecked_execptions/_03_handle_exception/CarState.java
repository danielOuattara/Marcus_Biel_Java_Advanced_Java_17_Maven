package org.daniel._01_checked_and_unchecked_execptions._03_handle_exception;

public enum CarState {
    DRIVING, WAITING, PARKING;

    public static CarState from(String state) {
        switch (state) {
            case "DRIVING":
                return DRIVING;
            case "WAITING":
                return WAITING;
            case "PARKING":
                return PARKING;
            default:
                throw new RuntimeException("Unknown state call for " + state);
        }
    }
}
