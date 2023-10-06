package com.example.enums;

public enum ProductStatus {
    ACTIVE(1),
    IN_ACTIVE(0),
    TERMINATED(-1);
    private int value;
    ProductStatus(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }
}
