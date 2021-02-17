public class ArrayExercise {
    public static void main(String[] args) {
        //Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index).
        //Return the count of the number of times that the two elements differ by 2 or less, but are not equal.


        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{2, 3, 10};
        int[] arr3 = new int[]{2, 3, 5};
        int[] arr4 = new int[]{2, 3, 3};

        System.out.println(matchUp(arr1, arr2)); //2
        System.out.println(matchUp(arr1, arr3)); //3
        System.out.println(matchUp(arr1, arr4)); //2

    }


    public static int matchUp(int[] num1, int[] num2) {
        int count = 0;
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] != num2[i] && Math.abs(num2[i]-num1[i]) <=2) {
                count++;
            }
        }
        return count;
    }

}
