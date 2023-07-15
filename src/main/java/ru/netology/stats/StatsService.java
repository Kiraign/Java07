package ru.netology.stats;

public class StatsService {
    public long allSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSales(long[] sales) {
        return allSales(sales) / sales.length;
    }

    public int peakSales(long[] sales) {
        int peak = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[peak]) {
                peak = i;
            }
        }
        return peak + 1;
    }
    public int minimumSales(long[] sales) {
        int minimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minimum]) {
                minimum = i;
            }
        }
        return minimum + 1;
    }

    public int salesBelowAverage(long[] sales) {
        int belowAverage = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int salesAboveAverage(long[] sales) {
        int aboveAverage = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}

