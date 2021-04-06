package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    @Test
    void matchesTrue() {
        Product first = new Book(1, "novel", 300, "Lermontov");
        boolean expected = true;
        boolean actual = first.matches("novel");
        assertEquals(true, actual);
    }
    @Test
    void matchesFalse() {
        Product first = new Book(1, "novel", 300, "Lermontov");
        boolean expected = false;
        boolean actual = first.matches("roman");
        assertEquals(false, actual);
    }
}