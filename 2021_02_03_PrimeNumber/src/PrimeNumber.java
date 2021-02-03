public class PrimeNumber {
    public static void main(String[] args) {
        //Дано число. Найти все ПРОСТЫЕ числа меньше данного числа.
        findAllPrimeNumber(10);
    }

    private static void findAllPrimeNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrimeNumber(int input) {
        for (int i = 2; i < input; i++) {
            if (input%i == 0){
                return false;
            }
        }
        return true;
    }
}
