public class StringExercise {
    public static void main(String[] args) {
        //We’ll say that a String is xy-balanced if for all the ‘x’ chars in the string, there exists a ‘y’ char somewhere later in the string.
        // So “xxy” is balanced, but “xyx” is not. One ‘y’ can balance multiple ‘x’s. Return true if the given string is xy-balanced.
        System.out.println(xyBalance("aaxbby")); //true
        System.out.println(xyBalance("aaxbb")); //false
        System.out.println(xyBalance("yaaxbb"));//false
    }

    private static boolean xyBalance(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='x') {

            }
        }

        return false;
    }
}
