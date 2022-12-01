package org.example;

public enum TestEnum {
    ONE {
        @Override
        int getValue() {
            return 1;
        }
    },
    TWO {
        @Override
        int getValue() {
            return 2;
        }
    },
    THREE {
        @Override
        int getValue() {
            return 3;
        }
    };

    abstract int getValue();
}
