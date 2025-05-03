package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionSexParametersTest {

    Feline felineMock = Mockito.mock(Feline.class);

    private final boolean expected;
    private final String sex;

    public LionSexParametersTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Пол: {0}, ожидаем: {1}")
    public static Object[][] getData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void shouldReturnCorrectManeStatus() throws Exception {
        Lion lion = new Lion(sex, felineMock);
        assertEquals(expected, lion.doesHaveMane());
    }

}
