package io.turntabl.springbootdemo;

import org.springframework.context.annotation.Bean;

public class Math {

    public int add(int a, int b){
        return (a+b);
    }

    public int subtract(int x, int y){
        return (x-y);
    }
}
