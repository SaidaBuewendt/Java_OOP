package start;

import data.Fraction;

/**
 * 16M-OOP
 * 03 12 : 21
 */
public class Test {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(1, 10);
        Fraction fr2 = new Fraction(2, 10);
        Fraction fr3 = new Fraction(3, 10);
        Fraction fr4 = new Fraction(4, 10);
        Fraction fr5 = new Fraction(5, 10);
        Fraction fr6 = new Fraction(20, 3);
        Fraction fr7 = new Fraction(7, 10);
        Fraction fr8 = new Fraction(8, 10);
        Fraction fr9 = new Fraction(9, 10);
        Fraction fr11 = new Fraction(11, 10);

        Fraction[] array = new Fraction[]{fr5, fr2, fr3, fr4, fr1, fr6, fr7, fr8, fr9, fr11};
        System.out.println(fr1.getSortIndex());
    }
}