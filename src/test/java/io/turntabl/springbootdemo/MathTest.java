package io.turntabl.springbootdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    @Test
    public void add_nonNegatives(){
        Math math = new Math();
        assertEquals(5,math.add(3, 2));
    }
@Test
    public void add_negatives(){
        Math math = new Math();
        assertEquals(-8,math.add(-3, -5));
    }

    @Test
    public void add_negAndNonNeg(){
        Math math = new Math();
        assertEquals(-998, math.add(-999, 1));
    }

    @Test
    public void add_zeros(){
        Math math = new Math();
        assertEquals(0, math.add(0, 0));
    }

}