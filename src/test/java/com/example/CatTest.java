package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.example.TestsConstants.CATS_SOUND;
import static com.example.TestsConstants.LIST_OF_FOOD_FOR_FELINE;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline felineMock;

    private Cat cat;

    @Before
    public void setCat() {
        cat = new Cat(felineMock);
    }

    @Test
    public void getSoundTest() {
        assertEquals("Текст не совпадает", CATS_SOUND, cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        assertEquals("Неверный список продуктов", LIST_OF_FOOD_FOR_FELINE);
        Mockito.verify(felineMock, Mockito.times(1)).eatMeat();
    }

}
