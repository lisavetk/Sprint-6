package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.AlexLionConstants.*;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {
    @Mock
    LionDependencyInjection lionDependencyInjection;

    @Test
    public void getFriendsTest() throws Exception{
        AlexLion alexLion = new AlexLion(lionDependencyInjection);
        assertEquals("Некорректный список друзей Алекса", LIST_OF_FRIENDS_ALEX, alexLion.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        AlexLion alexLion = new AlexLion(lionDependencyInjection);

        assertEquals("Неверное место жительства", HOME_ADDRESS_ALEX, alexLion.getPlaceOfLiving());
    }

    @Test
    public void getKittensAlexTest() throws Exception {
        AlexLion alexLion = new AlexLion(lionDependencyInjection);

        assertEquals("Неверное число котят", ALEX_KITTENS, alexLion.getKittens());
    }

}
