public class Math {
    //НОД a and b ->> 25 and 15: НОД = 5
    //25-15 = 10
    //15-10 = 5
    //10-5 = 0
    //5-5 = 0

    public static int euclideanAlgorithmWhile(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int euclideanAlgorithmDoWhile(int a, int b) {
        do {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        } while (a != b);
        return a;
    }

    public static int gcdAlgorithmModern(int a, int b) {
        while (b != 0) { // b!=0
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int gcdRecursionAlgorithm(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursionAlgorithm(b, a % b);
    }

    //HOK LCM
    //3 and 5 -->>HOK 15
    //10 and 20 -->> общее кратное 10*20 = 200
    //10 and 20 -->> наименьшее общее кратное 10*20 = 20
    //10 and 20 -->> 10*20 /НОД = 200/10 = 20

    public static int leastCommonMultiple(int a, int b) {
        return a * b / gcdRecursionAlgorithm(a, b);
    }


}
