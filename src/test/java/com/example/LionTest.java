package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.TestsConstants.LIST_OF_FOOD_FOR_FELINE;
import static com.example.TestsConstants.TEXT_FOR_EXCEPTION_FOR_CONSTRUCTOR_LION;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline felineMock;

    @Test
    public void shouldThrowExceptionWhenInvalidSex(){
        try {
            Lion lion = new Lion("Пол", felineMock);
            fail("Ожидаемое исключение не выдано");
        } catch (Exception e) {
            assertEquals("Текст отличается от ожидаемого", TEXT_FOR_EXCEPTION_FOR_CONSTRUCTOR_LION, e.getMessage());
        }

    }

    @Test
    public void getKittensTest()  throws Exception{
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", felineMock);
        assertEquals("Количество не совпадает", 1, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(LIST_OF_FOOD_FOR_FELINE);
        Lion lion = new Lion("Самец", felineMock);
        assertEquals("Список продуктов не совпадает", LIST_OF_FOOD_FOR_FELINE, lion.getFood());
    }
}
