package com.example;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSound() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        //Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}