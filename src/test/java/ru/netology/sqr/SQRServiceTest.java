package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldSqrRangeCounterCheck200_300() {
        int result;
        int expected = 3;

        SQRService service = new SQRService();
        result = service.sqrRangeCounter(200, 300);

        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void shouldSqrRangeCounterCheck1000_5000() {
        int result;
        int expected = 39;

        SQRService service = new SQRService();
        result = service.sqrRangeCounter(1000, 5000);

        assertEquals(expected, result);
    }
}