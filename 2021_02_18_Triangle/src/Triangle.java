public class Triangle {
    public static void main(String[] args) {
        lovelyTriangle(6);
    }

    public static void lovelyTriangle(int size) {
        for (int i = 1; i < size; i++) {
            drawSpace(size, i); //рисуем пробелы
            drawDigits(i); //рисуем цифры
            System.out.println();
        }
    }

    private static void drawDigits(int digit) {
        for (int j = 0; j < digit*2-1; j++) {
            System.out.print(digit);

        }
    }

    private static void drawSpace(int size, int i) {
        for (int j = i; j < size; j++) {
            System.out.print(" ");
        }


    }
}
