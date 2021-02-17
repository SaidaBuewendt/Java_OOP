import java.util.Arrays;

public class HomeWork_1602_arrays {
    public static void main(String[] args) {

        //Given an array of ints, return true if the array contains no 1’s and no 3’s.
        int[] arr1 = new int[]{0, 2, 4};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{1, 2, 4};
        int[] arr4 = new int[]{2, 10, 3};
        int[] arr5 = new int[]{7, 7, 7};

        System.out.println(lucky13(arr1));//→ true
        System.out.println(lucky13(arr2));//→ false
        System.out.println(lucky13(arr3));//→ false
        System.out.println(lucky13(arr4));//→ false
        System.out.println(lucky13(arr5));//→ true
        System.out.println("__________________");

        //Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, … n-1.
        //The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for the length-0 case;
        //the for-loop should naturally execute 0 times in that case, so it just works. The syntax to make a new int array is: new int[desired_length] (See also: FizzBuzz Code)

        fizzArray(4); //→ [0, 1, 2, 3]
        fizzArray(1); //→ [0]
        fizzArray(10); //→ [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        fizzArray(0); //→ [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println("_________");

        //Given an array of ints, return true if it contains no 1’s or it contains no 4’s.

        int[] arr6 = new int[]{1, 2, 3};
        int[] arr7 = new int[]{1, 2, 3, 4};
        int[] arr8 = new int[]{2, 3, 4};
        int[] arr9 = new int[]{7, 7, 7};
        int[] arr10 = new int[]{1, 4};


        System.out.println(no14(arr6)); //→ true
        System.out.println(no14(arr7)); //→ false
        System.out.println(no14(arr8)); //→ true
        System.out.println(no14(arr9)); //→ true
        System.out.println(no14(arr10));//→ false
    }

    private static boolean no14(int[] input) {
        boolean contains1 = false;
        boolean contains4 = false;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1) {
                contains1 = true;
            } else if (input[i] == 4) {
                contains4 = true;
            }
        }
        if (contains1 && contains4) {
            return false;
        }
        return true;
    }

    private static int[] fizzArray(int n) {
        int[] output = new int[n];
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            output[i] = i;
            System.out.print(output[i] + ",");
        }
        System.out.println("]");
        return new int[0];
    }


    private static boolean lucky13(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1 || input[i] == 3) {
                return false;
            }
        }
        return true;
    }
}
