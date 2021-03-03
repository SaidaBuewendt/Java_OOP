package start;


import data.Fraction;
import dao.Math;

public class StartApp {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(27, 50);
        Fraction fr2 = new Fraction(23, 50);
        Fraction fr3 = new Fraction(4, 20);

        Fraction add = Math.addition(fr1, fr2);
        System.out.println("Cложение: " + add);

        Fraction subtract = Math.subtraction(fr1, fr2);
        System.out.println("Вычитание: "+subtract);

        Fraction divide = Math.division(fr1, fr2);
        System.out.println("Деление: " + divide);

        Fraction multiply = Math.multiplication(fr1, fr2);
        System.out.println("Умножение: " + multiply);

        Fraction reduct = Math.reduction (fr3);
        System.out.println("Сокращение: " + reduct);

    }
}