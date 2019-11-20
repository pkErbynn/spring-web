package io.turntabl.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Number {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
