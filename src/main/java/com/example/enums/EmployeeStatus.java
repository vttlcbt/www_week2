package com.example.enums;

public enum EmployeeStatus {
    ACTIVE(1),
    IN_ACTIVE(0),
    TERMINATED(-1);
   private int value;

    EmployeeStatus(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }

}
