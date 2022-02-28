package ru.netology.syndrome100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Syndrome100Test {
    @Test
    void findMaxTest() {
        Syndrome100 service = new Syndrome100();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxTest1() {
        Syndrome100 service = new Syndrome100();

        long[] incomesInBillions = {14, 8, 8, 4, 5, 33, 8, 6, 11, 11, 12};
        long expected = 33;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}