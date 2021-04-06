package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    void matchesTrue() {
        Product first = new Product(1, "tshirt", 300);
        boolean expected = true;
        boolean actual = first.matches("tshirt");
        assertEquals(true, actual);
    }
    @Test
    void matchesFalse() {
        Product first = new Product(1, "ball", 200);
        boolean expected = false;
        boolean actual = first.matches("roman");
        assertEquals(false, actual);
    }
}