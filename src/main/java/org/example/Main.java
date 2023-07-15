package org.example;

import ru.netology.stats.StatsService;
public class Main {
    public static void main(String[] args){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.allSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        System.out.println(expected + " == ? == " + actual);

        actual = service.averageSales(sales);
        expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        System.out.println(expected + " == ? == " + actual);

        actual = service.peakSales(sales);
        expected = 8;
        System.out.println(expected + " == ? == " + actual);

        actual = service.minimumSales(sales);
        expected = 9;
        System.out.println(expected + " == ? == " + actual);

        actual = service.salesBelowAverage(sales);
        expected = 5;
        System.out.println(expected + " == ? == " + actual);

        actual = service.salesAboveAverage(sales);
        expected = 5;
        System.out.println(expected + " == ? == " + actual);
    }
}
