package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int totalSales(long[] sales) {
        int sum = 0;
        for (int s = 0; s < sales.length; s++) {
            sum = (int) (sum + sales[s]);
        }
        return sum;
    }

    public int averageSum(long[] sales) {
        int sum = 0;
        for (int a = 0; a < sales.length; a++) {
            sum = (int) (sum + sales[a]);
        }
        return sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int belowAver(long[] sales) {
        int monthBelowAver = 0;
        int average = averageSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales [i] < average) {
                monthBelowAver++;
            }
        }
        return monthBelowAver;
    }

    public int UpAver(long[] sales) {
        int monthUpAver = 0;
        int average = averageSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales [i] > average) {
                monthUpAver++;
            }
        }
        return monthUpAver;
    }

}

