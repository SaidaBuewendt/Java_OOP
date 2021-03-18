package Comparators;

import java.util.Comparator;

import Items.Car;


public class ComparatorByEngine implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Double.compare(o1.getEngine(),o2.getEngine());
    }
}
