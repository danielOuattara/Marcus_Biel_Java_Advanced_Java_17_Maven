package org.daniel._02_interfaces;

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
