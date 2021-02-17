import java.util.Arrays;

public class Snowflake {
    public static void main(String[] args) {
        //winter(10);
        String[][] snowflake = winter(10);
        myPrint(snowflake);
    }

    private static void myPrint(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    private static String[][] winter(int size) {
        String[][] output;
        if (size % 2 == 0) {
            output = new String[size + 1][size + 1];
        } else {
            output = new String[size][size];
        }
        fillArray(output, "X");
        return output;
    }

    private static void fillArray(String[][] input, String element) {
     /*   for (int i = input.length / 2; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                input[i][j] = element;
            }
            break;
        }
        for (int i = 0; i < input.length; i++) {
            for (int j = input.length / 2; j < input.length; j++) {
                input[i][j] = element;
                break;
            }
        }*/
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                input[i][j] = " ";
            }
        }


        for (int i = 0; i < input.length; i++) {
            input[i][input.length / 2] = element;
        }
        for (int i = 0; i < input.length; i++) {
            input[input.length / 2][i] = element;
        }

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (i == j) {
                    input[i][j] = element;
                }
            }

        }
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (i + j == input.length - 1) {
                    input[i][j] = element;
                }

            }

        }

    }
}
