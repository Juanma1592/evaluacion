package com.training;

public enum legCount {

    zero_legs("Zero_legs"),
    two_legs("twoLegs"),
    four_legs("Four_legs");

    private String status;

    legCount(String status) {
        this.status = status;
    }

    public String status() {
        return status;
    }
}
