package com.example;

import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        assertEquals("Хищник", feline.eatMeat());
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
    }

    @Test
    public void testGetKittens() {
    }
}