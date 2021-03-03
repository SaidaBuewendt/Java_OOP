package data;

import dao.Math;

public class Fraction extends Number{
    private int numerator; // верхняя часть -> числитель
    private int denominator; // нижняя часть -> знаменатель

    private double sortIndex;
    private long sortLongIndex;

    public double getSortIndex() {
        return sortIndex;
    }

    private void setSortIndex() {
        this.sortIndex = ((double)numerator)/denominator;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        setSortIndex();
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(Fraction a, Fraction b, char arithmeticOperationSymbol) {
        //проверка оператора
        Fraction frResult = Math.addition(a, b);
        this.numerator = frResult.getNumerator();
        this.denominator = frResult.getDenominator();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }


    @Override
    public String toString() {
        return "data.Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public void addAnotherFraction(Fraction b) {
        // что здесь должно стоять
        // что нам известно
        // первая дробь B. передена в сигнатуре метода.
        // вторая дробь this. numerator
        // this. denominator


        int d = Math.leastCommonMultiple(this.denominator, b.getDenominator());
        int n = this.numerator * d / this.denominator + b.getNumerator() * d / b.getDenominator();
        this.denominator = d;
        this.numerator = n;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

/*    public static Fraction addition(Fraction a, Fraction b) {  // summa
        int cNumerator;
        int cDenominator;
        cDenominator = leastCommonMultiple(a.getDenominator(), b.getDenominator()); //polychili c
        cNumerator = a.getNumerator() * cDenominator / a.getDenominator() + b.getNumerator() * cDenominator / b.getDenominator();
        int reduction = gcdRecursionAlgorithm(cNumerator, cDenominator);
        cNumerator = cNumerator / reduction;
        cDenominator = cDenominator / reduction;
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }*/

    private void reduction(){
        // сокращение дроби
        // this.n
        // this.d
    }
    private int reduction (int n, int d){
        //нод
        return 1;
    }

    // cleane code -> один класс -> один метод -> одна строчка
}