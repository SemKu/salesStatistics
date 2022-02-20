package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
        void shouldCalculateSum() {
            StatsService service = new StatsService();
            int[] sumSales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 180;
            int actual = service.calculateSum(sumSales);
            assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        int[] sumSales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverage(sumSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateMaxSales() {
        StatsService service = new StatsService();
        int[] sumSales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateMaxSales(sumSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateMinSales() {
        StatsService service = new StatsService();
        int[] sumSales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateMinSales(sumSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sumSales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateSalesBelowAverage(sumSales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] sumSales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateSalesAboveAverage(sumSales);
        assertEquals(expected, actual);
    }
}