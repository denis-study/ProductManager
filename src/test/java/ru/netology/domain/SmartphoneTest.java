package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartphoneTest {
    @Test
    void matchesTrue() {
        Product first = new Smartphone(1, "Samsung", 300, "Korea");
        boolean expected = true;
        boolean actual = first.matches("Korea");
        assertEquals(true, actual);
    }
    @Test
    void matchesFalse() {
        Product first = new Smartphone(1, "Iphone", 200, "China");
        boolean expected = false;
        boolean actual = first.matches("Samsung");
        assertEquals(false, actual);
    }
}