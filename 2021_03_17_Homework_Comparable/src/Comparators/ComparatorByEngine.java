package Comparators;

import java.util.Comparator;

import Items.Car;


public class ComparatorByEngine implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return (int) (o1.getEngine()*10 - o2.getEngine()*10);
    }
}
