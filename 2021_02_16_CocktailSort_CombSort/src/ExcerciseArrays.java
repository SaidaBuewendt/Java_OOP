public class ExcerciseArrays {
    public static void main(String[] args) {
        //Return the number of even ints in the given array. Note: the % “mod” operator computes the remainder, e.g. 5 % 2 is 1.

        int[] arr1 = new int[]{2, 1, 2, 3, 4};
        int[] arr2 = new int[]{2, 2, 0};
        int[] arr3 = new int[]{1, 3, 5};

        System.out.println(countEvens(arr1));//→ 3
        System.out.println(countEvens(arr2));//→ 3
        System.out.println(countEvens(arr3));//→ 0
    }

    public static int countEvens(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
