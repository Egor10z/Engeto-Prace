package com.engeto.lekce2;

public enum TypeOfStay {
    WORKING("working"), RECREATIONAL("recreational");

    private String description;

    TypeOfStay(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return description;
    }
}
