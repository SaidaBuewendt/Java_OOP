package Comparators;

import java.util.Comparator;

import Items.Car;

public class ComparatorYearAndPrice implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        double result = o1.getPrice() - o2.getPrice();
        return result == 0 ? o1.getYear() - o2.getYear(): (int) result;
    }
}
