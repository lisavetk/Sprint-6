package com.example;

import org.junit.Test;

import static com.example.TestsConstants.FAMILY_FELINE;
import static com.example.TestsConstants.LIST_OF_FOOD_FOR_FELINE;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {
        assertEquals("Неверный список продуктов", LIST_OF_FOOD_FOR_FELINE, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Неверное семейство", FAMILY_FELINE, feline.getFamily());
    }

    @Test
    public void getKittensNoParametersTest() {
        assertEquals("Неверное количество", 1, feline.getKittens());
    }


}
