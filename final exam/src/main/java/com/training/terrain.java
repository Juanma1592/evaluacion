package com.training;

public enum terrain {

    WATER("WATER"),
    EARTH("EARTH"),
    SKY("SKY");

    private String status;

    terrain(String status) {
        this.status = status;
    }

    public String status() {
        return status;
    }
}
