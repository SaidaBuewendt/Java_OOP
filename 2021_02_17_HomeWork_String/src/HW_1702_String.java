import java.util.Arrays;

public class HW_1702_String {
    public static void main(String[] args) {
        //Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on.
        // You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
        repeatFront("Chocolate", 4); //"ChocChoChC"
        repeatFront("Chocolate", 3); //"ChoChC"
        repeatFront("Ice Cream", 2); //"IcI"
        System.out.println("_________");


        //Given a string, does “xyz” appear in the middle of the string?
        //To define middle, we’ll say that the number of chars to the left and right of the “xyz” must differ by at most one. This problem is harder than it looks.
        System.out.println(xyzMiddle("AAxyzBB")); //true
        System.out.println(xyzMiddle("AxyzBB"));//true
        System.out.println(xyzMiddle("AxyzBBB"));//false
        //System.out.println(xyzMiddle("AxyzxyzBBB"));//false
        System.out.println("_________");


        //Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
        int[] arr1 = new int[]{2, 1, 3, 5};
        int[] arr2 = new int[]{2, 1, 2, 5};
        int[] arr3 = new int[]{2, 4, 2, 5};
        int[] arr4 = new int[]{2, 3, 3};

        System.out.println(modThree(arr1)); //→ true
        System.out.println(modThree(arr2)); //→ false
        System.out.println(modThree(arr3)); //→ true
        System.out.println(modThree(arr4)); //→ false
        System.out.println("_________");

        //Return true if the group of N numbers at the start and end of the array are the same.
        // For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3.
        // You may assume that n is in the range 0..nums.length inclusive.

        int[] arr5 = new int[]{5, 6, 45, 99, 13, 5, 6};
        int[] arr6 = new int[]{5, 6, 45, 99, 13, 5, 6};
        int[] arr7 = new int[]{5, 6, 45, 99, 13, 5, 6};
        int[] arr8 = new int[]{1, 2, 3, 4, 5};
        int[] arr9 = new int[]{100, 200, 300, 1, 2, 3, 4, 5, 100, 200, 300};

        System.out.println(sameEnds(arr5, 1));//→ false
        System.out.println(sameEnds(arr6, 2));//→ true
        System.out.println(sameEnds(arr7, 3));// → false
        System.out.println(sameEnds(arr8, 5));// → true
        System.out.println(sameEnds(arr9, 3));// → true
        System.out.println("__________________");

        //Треугольник из чисел. ***
        triangle();
    }

    private static void triangle() {
        int maxRows = 6;
        int maxColumns = maxRows * 2 - 1;
        for (int i = 1; i <= maxRows; i++) {
            int startIndex = maxRows - i + 1;
            int numOfDigits = i * 2 - 1;
            System.out.println();
            for (int j = 1; j <= maxColumns; j++) {
                if (j < startIndex || j > startIndex + numOfDigits - 1) {
                    System.out.print(" ");
                }else  {
                    System.out.print(i);
                }
            }
        }
    }


    private static boolean sameEnds(int[] input, int n) {
        for (int i = 0; i < n; i++) {
            if (input[i] == input[input.length - n]) {
                return true;
            }
        }
        return false;
    }

    public static boolean modThree(int[] input) {
        //String inputTemp = Arrays.toString(input);
        //int countEven = 0;
        for (int i = 0; i < input.length - 2; i++) {
            if (input[i] % 2 == 0 && input[i + 1] % 2 == 0 && input[i + 2] % 2 == 0) {
                return true;
            } else if (input[i] % 2 != 0 && input[i + 1] % 2 != 0 && input[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }


    private static boolean xyzMiddle(String input) {
        int toTheLeft = input.indexOf("xyz");
        int toTheRight = input.length() - (toTheLeft + 3);
        return (Math.abs(toTheLeft - toTheRight) <= 1);

    }

    private static String repeatFront(String input, int number) {
        String output = "";
        for (int i = 0; i < number; ) {
            output = input.substring(i, number);
            System.out.print(output);
            number--;
        }
        System.out.println();
        return output;
    }
}
