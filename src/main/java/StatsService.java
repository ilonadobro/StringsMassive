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

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public long sumSales(long[] sales) {
        long sum = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long avgSales(long[] sales) {
        long sum = this.sumSales(sales);

        return sum / sales.length;
    }

    public int minAvgCountMonth(long[] sales) {
        long avgSales = this.avgSales(sales);
        int countMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avgSales) {
                countMonth++;
            }
        }
        return countMonth;
    }
    public int maxAvgCountMonth(long[] sales) {
        long avgSales = this.avgSales(sales);
        int countMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avgSales) {
                countMonth++;
            }
        }
        return countMonth;
    }


}
