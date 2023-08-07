package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        int expectedDay = 9;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualDay = service.minSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldCalcTotalSum() {
        StatsService service = new StatsService();

        int expectedSum = 180;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualSum = service.totalSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void shouldCalcAverage() {
        StatsService service = new StatsService();

        int expectedAver = 15;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualAver = service.averageSum(sales);

        Assertions.assertEquals(expectedAver, actualAver);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        int expectedmDay = 8;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualmDay = service.maxSales(sales);

        Assertions.assertEquals(expectedmDay, actualmDay);
    }

    @Test
    public void shouldFindDayBelowAverage() {
        StatsService service = new StatsService();

        int expected = 5;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.belowAver(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindDayUpAverage() {
        StatsService service = new StatsService();

        int expected = 5;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.UpAver(sales);

        Assertions.assertEquals(expected, actual);

    }

}