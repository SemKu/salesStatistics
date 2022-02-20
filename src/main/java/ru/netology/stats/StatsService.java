package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sumSales) {
        int sum = 0;
        for (int sumSale : sumSales) {
            sum = sum + sumSale;
        }
        return sum;
    }

    public int calculateAverage(int[] sumSales) {
        return calculateSum(sumSales) / sumSales.length;
    }

    public int calculateMaxSales(int[] sumSales) {
        int maxMonth = 0;
        int month = 0;
        for (int sumSale : sumSales) {
            if (sumSale >= sumSales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculateMinSales(int[] sumSales) {
        int minMonth = 0;
        int month = 0;
        for (int sumSale : sumSales) {
            if (sumSale <= sumSales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateSalesBelowAverage(int[] sumSales) {
        int sumMonth = 0;
        int month = 0;
        for (int sumSale : sumSales) {
            if (sumSale < calculateAverage(sumSales)) {
                sumMonth++;
            }
            month = month + 1;
        }
        return sumMonth;
    }

    public int calculateSalesAboveAverage(int[] sumSales) {
        int sumMonth = 0;
        int month = 0;
        for (int sumSale : sumSales) {
            if (sumSale > calculateAverage(sumSales)) {
                sumMonth++;
            }
            month = month + 1;
        }
        return sumMonth;
    }
}
