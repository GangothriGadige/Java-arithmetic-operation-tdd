package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationTest {

    @Test
    void shouldReturnSixWhenTwoAndFourAreAdded(){
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation(2,4);
        int expectedSum=6;

        int actualSum = arithmeticOperation.add();

        assertEquals(expectedSum,actualSum);
    }



}
