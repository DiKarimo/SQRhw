package ru.netology.javahw5.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,200,300"
    })
    public void shouldCalcThree( int expected, int min, int max) {

        SQRService service = new SQRService();

        int actual = service.calcSQR(min, max);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "90,100,9900"
    })
    public void shouldCalcLimit( int expected, int min, int max) {

        SQRService service = new SQRService();

        int actual = service.calcSQR(min, max);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "50,100,3500"
    })
    public void shouldCalcHalf( int expected, int min, int max) {

        SQRService service = new SQRService();

        int actual = service.calcSQR(min, max);

        Assertions.assertEquals(expected, actual);
    }
}