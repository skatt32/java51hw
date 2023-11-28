package ru.netology.java5hw.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.nio.file.Files;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files ="src/test/resources/Vacation.csv")
    public void shouldcalculateMonthsOfRest(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();
        //int income = 10_000;
        //int expenses = 3_000;
        //int threshold = 20_000;
        //int expected = 3;
        int actual = service.calculateMonthsOfRest(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}