package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensParametersTest {

    private final int input;
    private final int expected;

    public FelineGetKittensParametersTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Котят: {0}, ожидаем: {1}")
    public static Object[][] getData() {
        return new Object[][] {
                {0, 0},
                {1, 1},
                {5, 5},
                {10, 10},
        };
    }

    @Test
    public void getKittensWithParametersTest() {
        Feline feline = new Feline();
        assertEquals(expected, feline.getKittens(input));
    }
}
