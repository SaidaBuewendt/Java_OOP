package Items;
import Comparators.*;

import java.util.Arrays;

public class CarAppl {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(2017, "Audi A6", "silver", 2.0, 16000),
                new Car(2015, "Volkswagen Golf", "grau", 1.4, 10000),
                new Car(2018, "BMW 7", "white", 1.8, 20000),
                new Car(2019, "Opel Astra", "blue", 1.6, 10000),
                new Car(2017, "Kia Rio", "red", 1.8, 10000),
                new Car(2020, "Mercedes A", "black", 2.3, 45000),
                new Car(2014, "Lada Kalina", "yellow", 1.3, 5000),
                new Car(2020, "Ferrari", "red", 3.9, 190000),
                new Car(2018, "Peugeot", "green", 1.8, 30000),
                new Car(2019, "Citroen", "blue", 1.6, 28000)};

        System.out.println("Random order:");
        displayCars(cars);
        Arrays.sort(cars);
        System.out.println("___________________________________________________");
        System.out.println("Reodered by using the Comparable property (Model): ");
        displayCars(cars);
        System.out.println("___________________________________________________");
        System.out.println("Reodered by using comparator by Year: ");
        Arrays.sort(cars, new ComparatorByYear());
        displayCars(cars);
        System.out.println("___________________________________________________");
        System.out.println("Reodered by using comparator by Color: ");
        Arrays.sort(cars, new ComparatorByColor());
        displayCars(cars);
        System.out.println("___________________________________________________");
        System.out.println("Reodered by using comparator by Engine: ");
        Arrays.sort(cars, new ComparatorByEngine());
        displayCars(cars);
        System.out.println("___________________________________________________");
        System.out.println("Reodered by using comparator by Price: ");
        Arrays.sort(cars, new ComparatorByPrice());
        displayCars(cars);
        System.out.println("___________________________________________________");
        System.out.println("Reodered by using comparator by Year and Price: ");
        Arrays.sort(cars, new ComparatorYearAndPrice());
        displayCars(cars);
    }

    private static void displayCars(Car[] cars) {
        for (Car c : cars) {
            System.out.println(c);
        }
    }
}